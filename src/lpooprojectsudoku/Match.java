package lpooprojectsudoku;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author arthur coimbra bundchen
 */
public class Match {
    private DecimalBoard Dboard = new DecimalBoard(1);
    private HexadecimalBoard Hboard = new HexadecimalBoard(1);
    private Player player = new Player();
    private int option;
    private int level;
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    
    protected void menu(){
        menuHead();
        showAndSetPlayerName();
        showAndSetBoardOption();
        showAndSetLevelOption();
        startMatch();
    }
    
    private void startMatch(){
        int luckyNumber;
        System.out.println("\nBoa Sorte, " + player.getFirstName() + "!");
        if(option == 1){
            Dboard.setLevel(this.level);
            Hboard = null;
            
            Dboard.answerBoardCreator();
            Dboard.creatPlayerBoard(Dboard.getAnswerBoard(), this.level);
            Dboard.showBoard(Dboard.getPlayerBoard());
            
            while(true){
                helpOption();
                placement();
                if(level == 4){
                    luckyNumber = rand.nextInt(100) + 1;
                    if(luckyNumber <= 5){
                        Dboard.crazySudoku();
                        System.out.println(" ================== QUE AZAR! ==================");
                        System.out.println(" == O tabuleiro mudou, tente ser mais rápido! ==");
                        System.out.println(" ===============================================");
                    }
                }
                Dboard.showBoard(Dboard.getPlayerBoard());
                if(Dboard.hasWon(Dboard.getPlayerBoard())){
                    System.out.println("================================================");
                    System.out.println("================= VOCÊ GANHOU! =================");
                    System.out.println("================================================");
                    break;
                }
            }
        } else if(option == 2){
            Hboard.setLevel(level);
            Dboard = null;
            
            Hboard.answerBoardCreator();
            Hboard.creatPlayerBoard(Hboard.getAnswerBoard(), this.level);
            Hboard.showBoard(Hboard.getPlayerBoard());
            
            while(true){
                helpOption();
                placement();
                if(level == 4){
                    luckyNumber = rand.nextInt(100) + 1;
                    if(luckyNumber <= 2){
                        Hboard.crazySudoku();
                        System.out.println("\n\n\n\n\t\t ================== QUE AZAR! ==================");
                        System.out.println("\t\t == O tabuleiro mudou, tente ser mais rápido! ==");
                        System.out.println("\t\t ===============================================");
                    }
                }
                Hboard.showBoard(Hboard.getPlayerBoard());
                if(Hboard.hasWon(Hboard.getPlayerBoard())){
                    System.out.println("================================================");
                    System.out.println("================= VOCÊ GANHOU! =================");
                    System.out.println("================================================");
                    break;
                }
            }
        }
    }
    
    private void menuHead(){
        System.out.println("-------------------------------------");
        System.out.println("========= BEM-VINDO AO JOGO =========");
        System.out.println("-------------------------------------");
    }
    
    private void showAndSetPlayerName(){
        System.out.println("Digite o seu primeiro nome:");
        this.player.setFirstName(input.next());
        System.out.println("Digite o seu sobrenome:");
        this.player.setLastName(input.next());
    }
    
    private void showAndSetBoardOption(){
        System.out.println("\n====== ESCOLHA O TIPO DE SUDOKU ======\n");
        System.out.println("    1- SUDOKU ORIGINAL (9x9)\n" +
                           "    2- SUDOKU HEXADECIMAL (16x16)\n");
        System.out.print("Digite a opção desejada (1 ou 2): ");
        option = input.nextInt();
        //IMPLEMENTAR EXCEÇÃO CASO O INPUT NÃO SEJA 1 OU 2
        
    }
    
    private void showAndSetLevelOption(){
        System.out.println("\n====== ESCOLHA A DIFICULDADE ======\n");
        System.out.println("    1- FACIL \n" +
                           "    2- INTERMEDIARIO \n" +
                           "    3- DIFICIL \n" +
                           "    4- SUDOKU MALUCO");
        System.out.print("Digite a opção desejada (1, 2, 3 ou 4): ");
        this.level = input.nextInt();
        //Mudar para get e set de level
        //IMPLEMENTAR EXCEÇÃO CASO O INPUT NÃO SEJA 1, 2, 3 OU 4
    }
    
    private void helpOption(){
        System.out.print("\nDeseja ajuda? (S/N): ");
        char answer = input.next().toUpperCase().charAt(0);
        if(answer == 'S'){
            System.out.println("\nEm qual cálula?");
            System.out.print("Linha (1, 2...,9): ");
            int row = input.nextInt() - 1;
            System.out.print("Coluna (A, B..., I): ");
            int column = columnCharToInt(input.next().toUpperCase().charAt(0));
            if(option == 1){
                Dboard.availableNumbers(Dboard.getPlayerBoard(), row, column);
                if(Dboard.getPbLockedPosition()[row][column]){
                    System.out.println("=====================================================");
                    System.out.print("\nOs números disponíveis para a célula selecionada são: ");
                    for(int i = 0; i < Dboard.getSIZE() ;i++){
                        if(Dboard.availableNumbers(Dboard.getPlayerBoard(), row, column)[i] != 0){
                            System.out.print(Dboard.availableNumbers(Dboard.getPlayerBoard(), row, column)[i] + " | ");
                        }
                    }
                    System.out.println("\n=====================================================");
                } else {
                    System.out.println("=====================================================");
                    System.out.println("Essa posição e fixa e já contem a resposta correta.");
                    System.out.println("=====================================================");
                }
            } else if(option == 2){
                Hboard.availableNumbers(Hboard.getPlayerBoard(), row, column);
                if(Hboard.getPbLockedPosition()[row][column]){
                    System.out.println("=====================================================");
                    System.out.print("\nOs números disponíveis para a célula selecionada são: ");
                    for(int i = 0; i < Hboard.getSIZE() ;i++){
                        if(Hboard.availableNumbers(Hboard.getPlayerBoard(), row, column)[i] != 0){
                            System.out.print(Hboard.availableNumbers(Hboard.getPlayerBoard(), row, column)[i] + " | ");
                        }
                    }
                    System.out.println("\n=====================================================");
                } else {
                    System.out.println("=====================================================");
                    System.out.println("Essa posição e fixa e já contem a resposta correta.");
                    System.out.println("=====================================================");
                }
            }
        }
    }
    
    public void placement() {
        int row = 0, column = 0;
        if(option == 1){
            System.out.println("\nOnde você deseja jogar?");
            System.out.print("Linha (1, 2...,9): ");
            row = input.nextInt() - 1;
            System.out.print("Coluna (A, B..., I): ");
            column = columnCharToInt(input.next().toUpperCase().charAt(0));
            if(Dboard.getPbLockedPosition()[row][column]){
                System.out.print("\nQual sua tentativa? (1, 2, ...9): ");
                int attempt = input.nextInt();
                addTry(row, column, attempt);
            } else{
                System.out.println("=====================================================");
                System.out.println("ERRO: Essa posição é bloquada e não pode ser alterada");
                System.out.println("=====================================================");
            }
        } else if(option == 2){
            System.out.println("\nOnde você deseja jogar?");
            System.out.print("Linha (1, 2...,16): ");
            row = input.nextInt() - 1;
            System.out.print("Coluna (A, B..., P): ");
            column = columnCharToInt(input.next().toUpperCase().charAt(0));
            if(Hboard.getPbLockedPosition()[row][column]){
                System.out.print("\nQual sua tentativa? (1, 2, ...9): ");
                int attempt = input.nextInt();
                addTry(row, column, attempt);
            } else{
                System.out.println("=====================================================");
                System.out.println("ERRO: Essa posição é bloquada e não pode ser alterada");
                System.out.println("=====================================================");
            }
        }
        
        
    }
    
    public int columnCharToInt(char column){
        int finalColumn = 0;
    
        switch (column) {
            case 'A':
                finalColumn = 0;
                break;
            case 'B':
                finalColumn = 1;
                break;
            case 'C':
                finalColumn = 2;
                break;
            case 'D':
                finalColumn = 3;
                break;
            case 'E':
                finalColumn = 4;
                break;
            case 'F':
                finalColumn = 5;
                break;
            case 'G':
                finalColumn = 6;
                break;
            case 'H':
                finalColumn = 7;
                break;
            case 'I':
                finalColumn = 8;
                break;
            case 'J':
                finalColumn = 9;
                break;
            case 'K':
                finalColumn = 10;
                break;
            case 'L':
                finalColumn = 11;
                break;
            case 'M':
                finalColumn = 12;
                break;
            case 'N':
                finalColumn = 13;
                break;
            case 'O':
                finalColumn = 14;
                break;
            case 'P':
                finalColumn = 15;
                break;
            default:
                //ADICIONAR EXCEPTION
                break;
        }
        return finalColumn;
    }
        
    public void addTry(int row, int column, int attempt){
        if(option == 1){ //Dboard
            if(!Dboard.checkAll(Dboard.getPlayerBoard(), row, column, attempt)){
                System.out.println("=====================================================");
                System.out.println("AVISO: Hmmm... Sua jogada está errada!");
                System.out.println("=====================================================");
            }
            Dboard.setAttempt(Dboard.getPlayerBoard(), row, column, attempt);
        } else if(option == 2){ // Hboard
            if(Hboard.getPbLockedPosition()[row][column]){
                if(!Hboard.checkAll(Hboard.getPlayerBoard(), row, column, attempt)){
                    System.out.println("=====================================================");
                    System.out.println("AVISO: Hmmm... Sua jogada está errada!");
                    System.out.println("=====================================================");
                }
                Hboard.setAttempt(Hboard.getPlayerBoard(), row, column, attempt);
            }
        }
    }
}
