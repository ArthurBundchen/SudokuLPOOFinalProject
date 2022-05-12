/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacepkg;

/**
 *
 * @author arthu
 */
public interface BoardInterface {
    
    int level = 1;
    boolean ready = false;
    
    abstract boolean checkAll(int board[][], int rIndex, int cIndex, int attempt);
    
    abstract boolean checkOnRow(int board[][], int rIndex, int attempt);
    
    abstract boolean checkOnColumn(int board[][], int cIndex, int attempt);
    
    abstract boolean checkOnMatrix(int board[][],int rIndex, int cIndex, int attempt);
    
    //Methods that will be deleted when Grafic Interface gets build up.
    abstract void showBoard(int board[][]);
    
    
}
