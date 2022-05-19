package lpooprojectsudoku;

import java.util.Random;
import java.util.Scanner;
import exceptionspkg.*;
import java.util.InputMismatchException;

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
        System.out.println("\n    Boa Sorte, " + player.getName() + "!");
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
        System.out.println("    -------------------------------------------");
        System.out.println("    ============ BEM-VINDO AO JOGO ============");
        System.out.println("    -------------------------------------------");
    }
    
    private void showAndSetPlayerName(){
        String localName;
        while(true){
            try{
                Scanner nameScanner = new Scanner(System.in);
                System.out.print("    Digite o seu nome: ");
                localName = nameScanner.next();
                isNameValid(localName);
                this.player.setName(localName);
                break;
            } catch(InvalidAttributeException iae){
                System.out.println("\n" + iae.getMessage());
            }
        }
    }
    
    private void showAndSetBoardOption(){
        int localOption;
        while(true){
            try{
                Scanner optionScanner = new Scanner(System.in);
                System.out.println("\n    ======== ESCOLHA O TIPO DE SUDOKU =========\n");
                System.out.println("    1- SUDOKU ORIGINAL (9x9)\n" +
                                   "    2- SUDOKU HEXADECIMAL (16x16)\n");
                //System.out.print("    Digite a opção desejada (1 ou 2): ");
                System.out.print("    ");
                localOption = optionScanner.nextInt();
                isOptionValid(localOption);
                this.option = localOption;
                break;
            } catch(InvalidAttributeException iae){
                System.out.println("\n" + iae.getMessage());
            } catch(InputMismatchException ime){ //Tratamento se o usuario digitar algo que não seja um numero
                    System.out.println("\n    ===========================================\n" +
                                       "    Por favor, a opção deve ser um número." +
                                       "\n    ===========================================\n");
            }
        }
    }
    
    private void showAndSetLevelOption(){
        int localLevel;
        while(true){
            try{
                Scanner levelScanner = new Scanner(System.in);
                System.out.println("\n    =========== ESCOLHA A DIFICULDADE ===========\n");
                System.out.println("    1- FACIL \n" +
                                   "    2- INTERMEDIARIO \n" +
                                   "    3- DIFICIL \n" +
                                   "    4- SUDOKU MALUCO\n");
                //System.out.print("    Digite a opção desejada (1, 2, 3 ou 4): ");
                System.out.print("    ");
                localLevel = levelScanner.nextInt();
                isLevelValid(localLevel);
                this.level = localLevel;
                break;
            } catch(InvalidAttributeException iae){
                System.out.println("\n" + iae.getMessage());
            } catch(InputMismatchException ime){ //Tratamento se o usuario digitar algo que não seja um numero
                    System.out.println("\n    =============================================\n" +
                                       "    Por favor, a opção deve ser um número." +
                                       "\n    =============================================\n");
            }
        }
    }
    
    private void helpOption(){
        int row = 0, column = 0;
        char localHelpOption, answer;
        while(true){
            try{
                Scanner levelScanner = new Scanner(System.in);
                System.out.print("\nDeseja ajuda? (S/N): ");
                localHelpOption = levelScanner.next().toUpperCase().charAt(0);
                isHelpOptionValid(localHelpOption);
                answer = localHelpOption;
                break;
            } catch(InvalidAttributeException iae){
                System.out.println("\n" + iae.getMessage());
            }
        }
        if(answer == 'S'){
            System.out.println("\nEm qual célula?");
            while(true){
                Scanner rowsScanner = new Scanner(System.in);
                row = 0;
                try{
                    System.out.print("Linha (1, 2...,9): ");
                    row = rowsScanner.nextInt() - 1;
                    isRowValid(row);
                    break;
                } catch(InvalidAttributeException iae){ //Tratamento se o valor da linha está entre 1 e 9
                    System.out.println(iae.getMessage());
                    
                } catch(InputMismatchException ime){ //Tratamento se o usuario digitar algo que não seja um numero
                    System.out.println("Por favor, o valor da linha deve ser um número.");
                }
            }
            while(true){
                Scanner columnScanner = new Scanner(System.in);
                column = 0;
                try{
                    System.out.print("Coluna (A, B..., I): ");
                    column = columnCharToInt(columnScanner.next().toUpperCase().charAt(0));
                    isColumnValid(column);
                    break;
                } catch(InvalidAttributeException iae){ //Tratamento se o valor da coluna está entre 1 e 9
                    System.out.println(iae.getMessage());
                    
                } catch(InputMismatchException ime){ //Tratamento se o usuario digitar algo que não seja um letra
                    System.out.println("Por favor, o valor da coluna deve ser uma letra.");
                }
            }
            if(option == 1){
                Dboard.availableNumbers(Dboard.getPlayerBoard(), row, column);
                
                try{ //Tratamento de exceção: LockedPositionException
                    isPositionLocked(Dboard.getPbLockedPosition()[row][column]);
                    System.out.println("=====================================================");
                    System.out.print("\nOs números disponíveis para a célula selecionada são: ");
                    for(int i = 0; i < Dboard.getSIZE() ;i++){
                        if(Dboard.availableNumbers(Dboard.getPlayerBoard(), row, column)[i] != 0){
                            System.out.print(Dboard.availableNumbers(Dboard.getPlayerBoard(), row, column)[i] + " | ");
                        }
                    }
                    System.out.println("\n=====================================================");
                } catch(LockedPositionException lpe){
                    System.out.println("\n" + lpe.getMessage());
                }
            } else if(option == 2){
                Hboard.availableNumbers(Hboard.getPlayerBoard(), row, column);
                
                try{ //Tratamento de exceção: LockedPositionException
                    isPositionLocked(Hboard.getPbLockedPosition()[row][column]);
                    System.out.println("=====================================================");
                    System.out.print("\nOs números disponíveis para a célula selecionada são: ");
                    for(int i = 0; i < Hboard.getSIZE() ;i++){
                        if(Hboard.availableNumbers(Hboard.getPlayerBoard(), row, column)[i] != 0){
                            System.out.print(Hboard.availableNumbers(Hboard.getPlayerBoard(), row, column)[i] + " | ");
                        }
                    }
                    System.out.println("\n=====================================================");
                } catch(LockedPositionException lpe){
                    System.out.println("\n" + lpe.getMessage());
                }
            }
        }
    }
    
    public void placement() {
        int row = 0, column = 0, attempt = 0;
        System.out.println("\nOnde você deseja jogar?");
        while(true) {
            Scanner rowsScanner = new Scanner(System.in);
            row = 0;
            try {
                System.out.print("Linha (1, 2...,9): ");
                row = rowsScanner.nextInt() - 1;
                isRowValid(row);
                break;
            } catch (InvalidAttributeException iae) { //Tratamento se o valor da linha está entre 1 e 9
                System.out.println(iae.getMessage());

            } catch (InputMismatchException ime) { //Tratamento se o usuario digitar algo que não seja um numero
                System.out.println("Por favor, o valor da linha deve ser um número.");
            }
        }
        while(true) {
            Scanner columnScanner = new Scanner(System.in);
            column = 0;
            try {
                System.out.print("Coluna (A, B..., I): ");
                column = columnCharToInt(columnScanner.next().toUpperCase().charAt(0));
                isColumnValid(column);
                break;
            } catch (InvalidAttributeException iae) { //Tratamento se o valor da coluna está entre 1 e 9
                System.out.println(iae.getMessage());

            } catch (InputMismatchException ime) { //Tratamento se o usuario digitar algo que não seja um letra
                System.out.println("Por favor, o valor da coluna deve ser uma letra.");
            }
        }
        if(option == 1){
            try { //Tratamento de excessão: LockedPositionException
                isPositionLocked(Dboard.getPbLockedPosition()[row][column]);
                System.out.print("\nQual sua tentativa? (1, 2, ...9): ");
                attempt = input.nextInt();
            } catch(LockedPositionException lpe){
                System.out.println("\n" + lpe.getMessage());
            }
            try { //Tratamento de excessão: WrongAttemptException
                addTry(row, column, attempt);
            } catch(WrongAttemptException wat){
                System.out.println("\n" + wat.getMessage());
                //Mesmo errado tem que adicionar a jogada:
                Dboard.setAttempt(Dboard.getPlayerBoard(), row, column, attempt);
            }
        } else if(option == 2){
            try{ //Tratamento de excessão: LockedPositionException
                isPositionLocked(Hboard.getPbLockedPosition()[row][column]);
                System.out.print("\nQual sua tentativa? (1, 2, ...9): ");
                attempt = input.nextInt();
            } catch(LockedPositionException lpe){
                System.out.println("\n" + lpe.getMessage());
            }
            try{ //Tratamento de excessão: WrongAttemptException
                addTry(row, column, attempt);
            } catch(WrongAttemptException wat){
                System.out.println("\n" + wat.getMessage());
                //Mesmo errado tem que adicionar a jogada:
                Hboard.setAttempt(Hboard.getPlayerBoard(), row, column, attempt);
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
                break;
        }
        return finalColumn;
    }
        
    public void addTry(int row, int column, int attempt) throws WrongAttemptException{
        if(option == 1){ //Dboard
            
            if(!Dboard.checkAll(Dboard.getPlayerBoard(), row, column, attempt) && attempt != 0){ //Caso entre aqui lançará WrongAttemptException
                throw new WrongAttemptException("\n=====================================================\n" +
                                                "\tAVISO: Hmmm... Sua jogada está errada!\n" +
                                                "=====================================================\n");
            }
            Dboard.setAttempt(Dboard.getPlayerBoard(), row, column, attempt);
            
        } else if(option == 2){ // Hboard
            
            if(!Hboard.checkAll(Hboard.getPlayerBoard(), row, column, attempt) && attempt != 0){ //Caso entre aqui lançará WrongAttemptException
                throw new WrongAttemptException("\n=====================================================\n" +
                                                "\tAVISO: Hmmm... Sua jogada está errada!\n" +
                                                "=====================================================\n");
            }
            Hboard.setAttempt(Hboard.getPlayerBoard(), row, column, attempt);
            
        }
    }
    
    public void isPositionLocked(boolean value) throws LockedPositionException{
        if(!value){
            throw new LockedPositionException("\n======================================================\n" +
                                              "AVISO: Essa posição é bloquada e não pode ser alterada\n" +
                                              "======================================================\n");
        }
    }
    
    public void isRowValid(int row) throws InvalidAttributeException{
        if(option == 1){
            if(row < 0 || row > 8){
                throw new InvalidAttributeException("\nValor de linha inválido, por favor esconha uma linha de 1 a 9!\n");
            }
        } else if(option == 2){
            if(row < 0 || row > 15){
                throw new InvalidAttributeException("\nValor de linha inválido, por favor esconha uma linha de 1 a 16!\n");
            }
        }
    }
    
    public void isColumnValid(int column) throws InvalidAttributeException{
        if(option == 1){
            if(column < 0 || column > 8){
                throw new InvalidAttributeException("\nValor de coluna inválido, por favor esconha uma coluna de A à I!\n");
            }
        } else if(option == 2){
            if(column < 0 || column > 15){
                throw new InvalidAttributeException("\nValor de coluna inválido, por favor esconha uma coluna de A à P!\n");
            }
        }
    }
    
    public void isNameValid(String name) throws InvalidAttributeException{
        if(name.length() < 5){
            
            throw new InvalidAttributeException("\n    ===========================================\n" +
                                                "    Nome curto. Digite ao menos 5 caracteres.\n" +
                                                "    ===========================================\n");
        }
    }
    
    public void isOptionValid(int opt) throws InvalidAttributeException{
        if(!(opt == 1 || opt == 2)){
            throw new InvalidAttributeException("\n    ===========================================\n" +
                                                "    Por favor, escolha uma opção entre 1 e 2.\n" +
                                                "    ===========================================\n");
        }
    }
    
    public void isLevelValid(int opt) throws InvalidAttributeException{
        if(!(opt >= 1 && opt <= 4)){
            throw new InvalidAttributeException("\n    =============================================\n" +
                                                "    Por favor, escolha um valor entre 1, 2, 3 e 4.\n" +
                                                "    =============================================\n");
        }
    }
    
    public void isHelpOptionValid(int opt) throws InvalidAttributeException{
        if(!(opt == 'S' || opt == 'N')){
            throw new InvalidAttributeException("\n    =============================================\n" +
                                                "    Por favor, escolha entre S ou N\n" +
                                                "    =============================================\n");
        }
    }
}
