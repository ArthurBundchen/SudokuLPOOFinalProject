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
    
    protected void menu(){
        Scanner input = new Scanner(System.in);
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
        System.out.println("\n=================== SUDOKU ===================\n");
        if(option == 1){
            Dboard.setLevel(level);
            Hboard = null;
            Dboard.testBoard();
        } else if(option == 2){
            Hboard.setLevel(level);
            Dboard = null;
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
}
