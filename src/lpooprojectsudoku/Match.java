package lpooprojectsudoku;

import java.io.IOException;
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
    
    protected void menu(){
        System.out.println("-------------------------------------");
        System.out.println("========= BEM-VINDO AO JOGO =========");
        System.out.println("-------------------------------------");
        System.out.println("Digite o seu primeiro nome:");
        this.player.setFirstName(input.next());
        System.out.println("Digite o seu sobrenome:");
        this.player.setLastName(input.next());
        showBoardOptions();
        option = input.nextInt();
        //IMPLEMENTAR EXCESSÃO CASO O INPUT NÃO SEJA 1 OU 2
        showLevelOptions();
        level = input.nextInt();
        startMatch();
    }
    private void startMatch(){
        System.out.println("\nBoa Sorte, " + player.getFirstName() + "!");
        if(option == 1){
            Dboard.setLevel(level);
            Hboard = null;
            Dboard.creatAswerBoard(Dboard.getPlayerBoard()); //Isso deveria estar dentro do gerador de sudoku
            Dboard.showBoard(Dboard.getPlayerBoard());
            while(true){
                placement();
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
            Hboard.showBoard(Hboard.getPlayerBoard());
            while(true){
                placement();
                Hboard.showBoard(Hboard.getPlayerBoard());
                if(Hboard.isBoardFull(Hboard.getPlayerBoard())){
                    break;
                }
            }
        }
    }
    
    private void showBoardOptions(){
        System.out.println("\n====== ESCOLHA O TIPO DE SUDOKU ======\n");
        System.out.println("    1- SUDOKU ORIGINAL (9x9)\n" +
                           "    2- SUDOKU HEXADECIMAL (16x16)\n");
        System.out.print("Digite a opção desejada (1 ou 2): ");
        
    }
    
    private void showLevelOptions(){
        System.out.println("\n====== ESCOLHA A DIFICULDADE ======\n");
        System.out.println("    1- FACIL \n" +
                           "    2- INTERMEDIARIO \n" +
                           "    3- DIFICIL \n");
        System.out.print("Digite a opção desejada (1, 2 ou 3): ");
    }
    
    public void placement() {
        System.out.print("\nQual sua tentativa? (1, 2, ...9): ");
        int attempt = input.nextInt();
        System.out.println("\nOnde você deseja jogar?");
        System.out.print("Linha (1, 2...,9): ");
        int row = input.nextInt();
        System.out.print("Coluna (A, B..., I): ");
        char column = input.next().toUpperCase().charAt(0);

        switch (column) {
            case 'A':
                addTry((row - 1), 0, attempt);
                break;
            case 'B':
                addTry((row - 1), 1, attempt);
                break;
            case 'C':
                addTry((row - 1), 2, attempt);
                break;
            case 'D':
                addTry((row - 1), 3, attempt);
                break;
            case 'E':
                addTry((row - 1), 4, attempt);
                break;
            case 'F':
                addTry((row - 1), 5, attempt);
                break;
            case 'G':
                addTry((row - 1), 6, attempt);
                break;
            case 'H':
                addTry((row - 1), 7, attempt);
                break;
            case 'I':
                addTry((row - 1), 8, attempt);
                break;
            default:
                //ADICIONAR EXCEPTION
                break;

        }
    }
    
    public void addTry(int row, int column, int attempt){
        if(option == 1){ //Dboard
            //if(Dboard.getPbLockedPosition()[row][column]){
                if(!Dboard.checkAll(Dboard.getPlayerBoard(), row, column, attempt)){
                    System.out.println("================================================");
                    System.out.println("\nAVISO: Hmmm... Sua jogada está errada!");
                }
                Dboard.setAttempt(Dboard.getPlayerBoard(), row, column, attempt);
            //}
        } else if(option == 2){ // Hboard
            if(Hboard.getPbLockedPosition()[row][column]){
                Hboard.setAttempt(Hboard.getPlayerBoard(), row, column, attempt);
                if(!Hboard.checkAll(Hboard.getPlayerBoard(), row, column, attempt)){
                    System.out.println("================================================");
                    System.out.println("\n AVISO: Hmmm... Sua jogada está errada!");
                }
            }
        }
    }
}
