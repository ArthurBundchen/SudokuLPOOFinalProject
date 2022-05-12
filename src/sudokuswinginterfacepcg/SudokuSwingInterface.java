/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sudokuswinginterfacepcg;

import java.awt.Color;
import lpooprojectsudoku.DecimalBoard;

/**
 *
 * @author arthu
 */
public class SudokuSwingInterface extends javax.swing.JFrame {

    /**
     * Creates new form SudokuSwingInterface
     */
    public SudokuSwingInterface() {
        initComponents();
        DecimalBoard novotabuleiro = new DecimalBoard(1);        
        setValues();
        
    }

    private void setValues(){
        btn00.setText(DecimalBoard.playerBoard[0][0] + "");
        btn01.setText(DecimalBoard.playerBoard[0][1] + "");
        btn02.setText(DecimalBoard.playerBoard[0][2] + "");
        btn03.setText(DecimalBoard.playerBoard[0][3] + "");
        btn04.setText(DecimalBoard.playerBoard[0][4] + "");
        btn05.setText(DecimalBoard.playerBoard[0][5] + "");
        btn06.setText(DecimalBoard.playerBoard[0][6] + "");
        btn07.setText(DecimalBoard.playerBoard[0][7] + "");
        btn08.setText(DecimalBoard.playerBoard[0][8] + "");
        btn10.setText(DecimalBoard.playerBoard[1][0] + "");
        btn11.setText(DecimalBoard.playerBoard[1][1] + "");
        btn12.setText(DecimalBoard.playerBoard[1][2] + "");
        btn13.setText(DecimalBoard.playerBoard[1][3] + "");
        btn14.setText(DecimalBoard.playerBoard[1][4] + "");
        btn15.setText(DecimalBoard.playerBoard[1][5] + "");
        btn16.setText(DecimalBoard.playerBoard[1][6] + "");
        btn17.setText(DecimalBoard.playerBoard[1][7] + "");
        btn18.setText(DecimalBoard.playerBoard[1][8] + "");
        btn20.setText(DecimalBoard.playerBoard[2][0] + "");
        btn21.setText(DecimalBoard.playerBoard[2][1] + "");
        btn22.setText(DecimalBoard.playerBoard[2][2] + "");
        btn23.setText(DecimalBoard.playerBoard[2][3] + "");
        btn24.setText(DecimalBoard.playerBoard[2][4] + "");
        btn25.setText(DecimalBoard.playerBoard[2][5] + "");
        btn26.setText(DecimalBoard.playerBoard[2][6] + "");
        btn27.setText(DecimalBoard.playerBoard[2][7] + "");
        btn28.setText(DecimalBoard.playerBoard[2][8] + "");
        btn30.setText(DecimalBoard.playerBoard[3][0] + "");
        btn31.setText(DecimalBoard.playerBoard[3][1] + "");
        btn32.setText(DecimalBoard.playerBoard[3][2] + "");
        btn33.setText(DecimalBoard.playerBoard[3][3] + "");
        btn34.setText(DecimalBoard.playerBoard[3][4] + "");
        btn35.setText(DecimalBoard.playerBoard[3][5] + "");
        btn36.setText(DecimalBoard.playerBoard[3][6] + "");
        btn37.setText(DecimalBoard.playerBoard[3][7] + "");
        btn38.setText(DecimalBoard.playerBoard[3][8] + "");
        btn40.setText(DecimalBoard.playerBoard[4][0] + "");
        btn41.setText(DecimalBoard.playerBoard[4][1] + "");
        btn42.setText(DecimalBoard.playerBoard[4][2] + "");
        btn43.setText(DecimalBoard.playerBoard[4][3] + "");
        btn44.setText(DecimalBoard.playerBoard[4][4] + "");
        btn45.setText(DecimalBoard.playerBoard[4][5] + "");
        btn46.setText(DecimalBoard.playerBoard[4][6] + "");
        btn47.setText(DecimalBoard.playerBoard[4][7] + "");
        btn48.setText(DecimalBoard.playerBoard[4][8] + "");
        btn50.setText(DecimalBoard.playerBoard[5][0] + "");
        btn51.setText(DecimalBoard.playerBoard[5][1] + "");
        btn52.setText(DecimalBoard.playerBoard[5][2] + "");
        btn53.setText(DecimalBoard.playerBoard[5][3] + "");
        btn54.setText(DecimalBoard.playerBoard[5][4] + "");
        btn55.setText(DecimalBoard.playerBoard[5][5] + "");
        btn56.setText(DecimalBoard.playerBoard[5][6] + "");
        btn57.setText(DecimalBoard.playerBoard[5][7] + "");
        btn58.setText(DecimalBoard.playerBoard[5][8] + "");
        btn60.setText(DecimalBoard.playerBoard[6][0] + "");
        btn61.setText(DecimalBoard.playerBoard[6][1] + "");
        btn62.setText(DecimalBoard.playerBoard[6][2] + "");
        btn63.setText(DecimalBoard.playerBoard[6][3] + "");
        btn64.setText(DecimalBoard.playerBoard[6][4] + "");
        btn65.setText(DecimalBoard.playerBoard[6][5] + "");
        btn66.setText(DecimalBoard.playerBoard[6][6] + "");
        btn67.setText(DecimalBoard.playerBoard[6][7] + "");
        btn68.setText(DecimalBoard.playerBoard[6][8] + "");
        btn70.setText(DecimalBoard.playerBoard[7][0] + "");
        btn71.setText(DecimalBoard.playerBoard[7][1] + "");
        btn72.setText(DecimalBoard.playerBoard[7][2] + "");
        btn73.setText(DecimalBoard.playerBoard[7][3] + "");
        btn74.setText(DecimalBoard.playerBoard[7][4] + "");
        btn75.setText(DecimalBoard.playerBoard[7][5] + "");
        btn76.setText(DecimalBoard.playerBoard[7][6] + "");
        btn77.setText(DecimalBoard.playerBoard[7][7] + "");
        btn78.setText(DecimalBoard.playerBoard[7][8] + "");
        btn80.setText(DecimalBoard.playerBoard[8][0] + "");
        btn81.setText(DecimalBoard.playerBoard[8][1] + "");
        btn82.setText(DecimalBoard.playerBoard[8][2] + "");
        btn83.setText(DecimalBoard.playerBoard[8][3] + "");
        btn84.setText(DecimalBoard.playerBoard[8][4] + "");
        btn85.setText(DecimalBoard.playerBoard[8][5] + "");
        btn86.setText(DecimalBoard.playerBoard[8][6] + "");
        btn87.setText(DecimalBoard.playerBoard[8][7] + "");
        btn88.setText(DecimalBoard.playerBoard[8][8] + "");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn00 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn04 = new javax.swing.JButton();
        btn05 = new javax.swing.JButton();
        btn06 = new javax.swing.JButton();
        btn07 = new javax.swing.JButton();
        btn08 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        btn43 = new javax.swing.JButton();
        btn44 = new javax.swing.JButton();
        btn45 = new javax.swing.JButton();
        btn46 = new javax.swing.JButton();
        btn47 = new javax.swing.JButton();
        btn48 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        btn51 = new javax.swing.JButton();
        btn52 = new javax.swing.JButton();
        btn53 = new javax.swing.JButton();
        btn54 = new javax.swing.JButton();
        btn55 = new javax.swing.JButton();
        btn56 = new javax.swing.JButton();
        btn57 = new javax.swing.JButton();
        btn58 = new javax.swing.JButton();
        btn60 = new javax.swing.JButton();
        btn61 = new javax.swing.JButton();
        btn62 = new javax.swing.JButton();
        btn63 = new javax.swing.JButton();
        btn64 = new javax.swing.JButton();
        btn65 = new javax.swing.JButton();
        btn66 = new javax.swing.JButton();
        btn67 = new javax.swing.JButton();
        btn68 = new javax.swing.JButton();
        btn70 = new javax.swing.JButton();
        btn71 = new javax.swing.JButton();
        btn72 = new javax.swing.JButton();
        btn73 = new javax.swing.JButton();
        btn74 = new javax.swing.JButton();
        btn75 = new javax.swing.JButton();
        btn76 = new javax.swing.JButton();
        btn77 = new javax.swing.JButton();
        btn78 = new javax.swing.JButton();
        btn80 = new javax.swing.JButton();
        btn81 = new javax.swing.JButton();
        btn82 = new javax.swing.JButton();
        btn83 = new javax.swing.JButton();
        btn84 = new javax.swing.JButton();
        btn85 = new javax.swing.JButton();
        btn86 = new javax.swing.JButton();
        btn87 = new javax.swing.JButton();
        btn88 = new javax.swing.JButton();
        spnValue = new javax.swing.JSpinner();
        lblResultado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(221, 223, 214));

        btn00.setBackground(new java.awt.Color(255, 255, 255));
        btn00.setText("0");
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });

        btn01.setBackground(new java.awt.Color(255, 255, 255));
        btn01.setText("0");
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });

        btn02.setBackground(new java.awt.Color(255, 255, 255));
        btn02.setText("0");
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });

        btn03.setText("jButton1");
        btn03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn03ActionPerformed(evt);
            }
        });

        btn04.setText("jButton1");
        btn04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn04ActionPerformed(evt);
            }
        });

        btn05.setText("jButton1");
        btn05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn05ActionPerformed(evt);
            }
        });

        btn06.setBackground(new java.awt.Color(255, 255, 255));
        btn06.setText("jButton1");
        btn06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn06ActionPerformed(evt);
            }
        });

        btn07.setBackground(new java.awt.Color(255, 255, 255));
        btn07.setText("jButton1");
        btn07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn07ActionPerformed(evt);
            }
        });

        btn08.setBackground(new java.awt.Color(255, 255, 255));
        btn08.setText("jButton1");
        btn08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn08ActionPerformed(evt);
            }
        });

        btn10.setBackground(new java.awt.Color(255, 255, 255));
        btn10.setText("jButton1");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setBackground(new java.awt.Color(255, 255, 255));
        btn11.setText("jButton1");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setBackground(new java.awt.Color(255, 255, 255));
        btn12.setText("jButton1");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setText("jButton1");
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn14.setText("jButton1");
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn15.setText("jButton1");
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn16.setBackground(new java.awt.Color(255, 255, 255));
        btn16.setText("jButton1");
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btn17.setBackground(new java.awt.Color(255, 255, 255));
        btn17.setText("jButton1");
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });

        btn18.setBackground(new java.awt.Color(255, 255, 255));
        btn18.setText("jButton1");
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });

        btn20.setBackground(new java.awt.Color(255, 255, 255));
        btn20.setText("jButton1");
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn21.setBackground(new java.awt.Color(255, 255, 255));
        btn21.setText("jButton1");
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn22.setBackground(new java.awt.Color(255, 255, 255));
        btn22.setText("jButton1");
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn23.setText("jButton1");
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn24.setText("jButton1");
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });

        btn25.setText("jButton1");
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });

        btn26.setBackground(new java.awt.Color(255, 255, 255));
        btn26.setText("jButton1");
        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn26ActionPerformed(evt);
            }
        });

        btn27.setBackground(new java.awt.Color(255, 255, 255));
        btn27.setText("jButton1");
        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn27ActionPerformed(evt);
            }
        });

        btn28.setBackground(new java.awt.Color(255, 255, 255));
        btn28.setText("jButton1");
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });

        btn30.setText("jButton1");
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });

        btn31.setText("jButton1");
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });

        btn32.setText("jButton1");
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });

        btn33.setBackground(new java.awt.Color(255, 255, 255));
        btn33.setText("jButton1");
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });

        btn34.setBackground(new java.awt.Color(255, 255, 255));
        btn34.setText("jButton1");
        btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn34ActionPerformed(evt);
            }
        });

        btn35.setBackground(new java.awt.Color(255, 255, 255));
        btn35.setText("jButton1");
        btn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn35ActionPerformed(evt);
            }
        });

        btn36.setText("jButton1");
        btn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn36ActionPerformed(evt);
            }
        });

        btn37.setText("jButton1");
        btn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn37ActionPerformed(evt);
            }
        });

        btn38.setText("jButton1");
        btn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn38ActionPerformed(evt);
            }
        });

        btn40.setText("jButton1");
        btn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn40ActionPerformed(evt);
            }
        });

        btn41.setText("jButton1");
        btn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn41ActionPerformed(evt);
            }
        });

        btn42.setText("jButton1");
        btn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn42ActionPerformed(evt);
            }
        });

        btn43.setBackground(new java.awt.Color(255, 255, 255));
        btn43.setText("jButton1");
        btn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn43ActionPerformed(evt);
            }
        });

        btn44.setBackground(new java.awt.Color(255, 255, 255));
        btn44.setText("jButton1");
        btn44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn44ActionPerformed(evt);
            }
        });

        btn45.setBackground(new java.awt.Color(255, 255, 255));
        btn45.setText("jButton1");
        btn45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn45ActionPerformed(evt);
            }
        });

        btn46.setText("jButton1");
        btn46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn46ActionPerformed(evt);
            }
        });

        btn47.setText("jButton1");
        btn47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn47ActionPerformed(evt);
            }
        });

        btn48.setText("jButton1");
        btn48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn48ActionPerformed(evt);
            }
        });

        btn50.setText("jButton1");
        btn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50ActionPerformed(evt);
            }
        });

        btn51.setText("jButton1");
        btn51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn51ActionPerformed(evt);
            }
        });

        btn52.setText("jButton1");
        btn52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn52ActionPerformed(evt);
            }
        });

        btn53.setBackground(new java.awt.Color(255, 255, 255));
        btn53.setText("jButton1");
        btn53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn53ActionPerformed(evt);
            }
        });

        btn54.setBackground(new java.awt.Color(255, 255, 255));
        btn54.setText("jButton1");
        btn54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn54ActionPerformed(evt);
            }
        });

        btn55.setBackground(new java.awt.Color(255, 255, 255));
        btn55.setText("jButton1");
        btn55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn55ActionPerformed(evt);
            }
        });

        btn56.setText("jButton1");
        btn56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn56ActionPerformed(evt);
            }
        });

        btn57.setText("jButton1");
        btn57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn57ActionPerformed(evt);
            }
        });

        btn58.setText("jButton1");
        btn58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn58ActionPerformed(evt);
            }
        });

        btn60.setBackground(new java.awt.Color(255, 255, 255));
        btn60.setText("jButton1");
        btn60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn60ActionPerformed(evt);
            }
        });

        btn61.setBackground(new java.awt.Color(255, 255, 255));
        btn61.setText("jButton1");
        btn61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn61ActionPerformed(evt);
            }
        });

        btn62.setBackground(new java.awt.Color(255, 255, 255));
        btn62.setText("jButton1");
        btn62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn62ActionPerformed(evt);
            }
        });

        btn63.setText("jButton1");
        btn63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn63ActionPerformed(evt);
            }
        });

        btn64.setText("jButton1");
        btn64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn64ActionPerformed(evt);
            }
        });

        btn65.setText("jButton1");
        btn65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn65ActionPerformed(evt);
            }
        });

        btn66.setBackground(new java.awt.Color(255, 255, 255));
        btn66.setText("jButton1");
        btn66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn66ActionPerformed(evt);
            }
        });

        btn67.setBackground(new java.awt.Color(255, 255, 255));
        btn67.setText("jButton1");
        btn67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn67ActionPerformed(evt);
            }
        });

        btn68.setBackground(new java.awt.Color(255, 255, 255));
        btn68.setText("jButton1");
        btn68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn68ActionPerformed(evt);
            }
        });

        btn70.setBackground(new java.awt.Color(255, 255, 255));
        btn70.setText("jButton1");
        btn70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn70ActionPerformed(evt);
            }
        });

        btn71.setBackground(new java.awt.Color(255, 255, 255));
        btn71.setText("jButton1");
        btn71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn71ActionPerformed(evt);
            }
        });

        btn72.setBackground(new java.awt.Color(255, 255, 255));
        btn72.setText("jButton1");
        btn72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn72ActionPerformed(evt);
            }
        });

        btn73.setText("jButton1");
        btn73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn73ActionPerformed(evt);
            }
        });

        btn74.setText("jButton1");
        btn74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn74ActionPerformed(evt);
            }
        });

        btn75.setText("jButton1");
        btn75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn75ActionPerformed(evt);
            }
        });

        btn76.setBackground(new java.awt.Color(255, 255, 255));
        btn76.setText("jButton1");
        btn76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn76ActionPerformed(evt);
            }
        });

        btn77.setBackground(new java.awt.Color(255, 255, 255));
        btn77.setText("jButton1");
        btn77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn77ActionPerformed(evt);
            }
        });

        btn78.setBackground(new java.awt.Color(255, 255, 255));
        btn78.setText("jButton1");
        btn78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn78ActionPerformed(evt);
            }
        });

        btn80.setBackground(new java.awt.Color(255, 255, 255));
        btn80.setText("jButton1");
        btn80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn80ActionPerformed(evt);
            }
        });

        btn81.setBackground(new java.awt.Color(255, 255, 255));
        btn81.setText("jButton1");
        btn81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn81ActionPerformed(evt);
            }
        });

        btn82.setBackground(new java.awt.Color(255, 255, 255));
        btn82.setText("jButton1");
        btn82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn82ActionPerformed(evt);
            }
        });

        btn83.setText("jButton1");
        btn83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn83ActionPerformed(evt);
            }
        });

        btn84.setText("jButton1");
        btn84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn84ActionPerformed(evt);
            }
        });

        btn85.setText("jButton1");
        btn85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn85ActionPerformed(evt);
            }
        });

        btn86.setBackground(new java.awt.Color(255, 255, 255));
        btn86.setText("jButton1");
        btn86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn86ActionPerformed(evt);
            }
        });

        btn87.setBackground(new java.awt.Color(255, 255, 255));
        btn87.setText("jButton1");
        btn87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn87ActionPerformed(evt);
            }
        });

        btn88.setBackground(new java.awt.Color(255, 255, 255));
        btn88.setText("jButton1");
        btn88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn88ActionPerformed(evt);
            }
        });

        spnValue.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        spnValue.setModel(new javax.swing.SpinnerNumberModel(0, 0, 9, 1));

        lblResultado.setForeground(new java.awt.Color(102, 255, 102));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setColumnHeaderView(null);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(9, 9));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn50, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn51, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn52, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn60, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn61, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn62, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn70, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn71, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn72, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn80, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn81, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn82, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn04, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn05, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn45, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn53, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn54, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn55, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn63, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn64, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn65, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn73, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn74, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn75, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn83, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn84, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn85, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn66, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn67, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn76, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn77, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn86, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn87, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn56, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn57, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn46, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn47, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn07, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn68, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn78, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn88, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn58, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn48, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn08, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                        .addComponent(spnValue, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(29, 29, 29)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn08, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn48, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn58, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn68, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn78, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn88, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn07, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn04, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn05, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn00, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(spnValue, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn46, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn47, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn56, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn57, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn43, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn44, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn45, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn53, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn54, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn55, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn50, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn51, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn52, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn66, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn67, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn76, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn77, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn86, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn87, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn63, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn64, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn65, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn73, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn74, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn75, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn83, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn84, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn85, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn60, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn61, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn62, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn70, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn71, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn72, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn80, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn81, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn82, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        
    }//GEN-LAST:event_btn00ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 0, 1, Integer.parseInt(spnValue.getValue().toString()))){
            btn01.setForeground(Color.red);
        } else{
            btn01.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn01.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 0, 1, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 0, 2, Integer.parseInt(spnValue.getValue().toString()))){
            btn02.setForeground(Color.red);
        } else{
            btn02.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn02.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 0, 2, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 1, 0, Integer.parseInt(spnValue.getValue().toString()))){
            btn10.setForeground(Color.red);
        } else{
            btn10.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn10.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 1, 0, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }        
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 1, 1, Integer.parseInt(spnValue.getValue().toString()))){
            btn11.setForeground(Color.red);
        } else{
            btn11.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn11.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 1, 1, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 1, 2, Integer.parseInt(spnValue.getValue().toString()))){
            btn12.setForeground(Color.red);
        } else{
            btn12.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn12.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 1, 2, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 2, 0, Integer.parseInt(spnValue.getValue().toString()))){
            btn20.setForeground(Color.red);
        } else{
            btn20.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn20.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 2, 0, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 2, 1, Integer.parseInt(spnValue.getValue().toString()))){
            btn21.setForeground(Color.red);
        } else{
            btn21.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn21.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 2, 1, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 2, 2, Integer.parseInt(spnValue.getValue().toString()))){
            btn22.setForeground(Color.red);
        } else{
            btn22.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn22.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 2, 2, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 3, 0, Integer.parseInt(spnValue.getValue().toString()))){
            btn30.setForeground(Color.red);
        } else{
            btn30.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn30.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 3, 0, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 3, 1, Integer.parseInt(spnValue.getValue().toString()))){
            btn31.setForeground(Color.red);
        } else{
            btn31.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn31.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 3, 1, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 3, 2, Integer.parseInt(spnValue.getValue().toString()))){
            btn32.setForeground(Color.red);
        } else{
            btn32.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn32.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 3, 2, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn40ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 4, 0, Integer.parseInt(spnValue.getValue().toString()))){
            btn40.setForeground(Color.red);
        } else{
            btn40.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn40.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 4, 0, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn40ActionPerformed

    private void btn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn41ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 4, 1, Integer.parseInt(spnValue.getValue().toString()))){
            btn41.setForeground(Color.red);
        } else{
            btn41.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn41.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 4, 1, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn41ActionPerformed

    private void btn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn42ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 4, 2, Integer.parseInt(spnValue.getValue().toString()))){
            btn42.setForeground(Color.red);
        } else{
            btn42.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn42.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 4, 2, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn42ActionPerformed

    private void btn51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn51ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 5, 1, Integer.parseInt(spnValue.getValue().toString()))){
            btn51.setForeground(Color.red);
        } else{
            btn51.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn51.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 5, 1, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn51ActionPerformed

    private void btn52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn52ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 5, 2, Integer.parseInt(spnValue.getValue().toString()))){
            btn52.setForeground(Color.red);
        } else{
            btn52.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn52.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 5, 2, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn52ActionPerformed

    private void btn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 5, 0, Integer.parseInt(spnValue.getValue().toString()))){
            btn50.setForeground(Color.red);
        } else{
            btn50.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn50.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 5, 0, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn50ActionPerformed

    private void btn60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn60ActionPerformed
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, 6, 0, Integer.parseInt(spnValue.getValue().toString()))){
            btn60.setForeground(Color.red);
        } else{
            btn60.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn60.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, 6, 0, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn60ActionPerformed

    private void btn61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn61ActionPerformed
        int row = 6;
        int column = 1;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn61.setForeground(Color.red);
        } else{
            btn61.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn61.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn61ActionPerformed

    private void btn62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn62ActionPerformed
        int row = 6;
        int column = 2;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn62.setForeground(Color.red);
        } else{
            btn62.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn62.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn62ActionPerformed

    private void btn72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn72ActionPerformed
        int row = 7;
        int column = 2;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn72.setForeground(Color.red);
        } else{
            btn72.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn72.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn72ActionPerformed

    private void btn71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn71ActionPerformed
        int row = 7;
        int column = 1;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn71.setForeground(Color.red);
        } else{
            btn71.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn71.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn71ActionPerformed

    private void btn70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn70ActionPerformed
        int row = 7;
        int column = 0;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn70.setForeground(Color.red);
        } else{
            btn70.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn70.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn70ActionPerformed

    private void btn80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn80ActionPerformed
        int row = 8;
        int column = 0;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn80.setForeground(Color.red);
        } else{
            btn80.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn80.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn80ActionPerformed

    private void btn81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn81ActionPerformed
        int row = 8;
        int column = 1;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn81.setForeground(Color.red);
        } else{
            btn81.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn81.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn81ActionPerformed

    private void btn82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn82ActionPerformed
        int row = 8;
        int column = 2;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn82.setForeground(Color.red);
        } else{
            btn82.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn82.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn82ActionPerformed

    private void btn43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn43ActionPerformed
        int row = 4;
        int column = 3;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn43.setForeground(Color.red);
        } else{
            btn43.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn43.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn43ActionPerformed

    private void btn44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn44ActionPerformed
        int row = 4;
        int column = 4;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn44.setForeground(Color.red);
        } else{
            btn44.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn44.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn44ActionPerformed

    private void btn45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn45ActionPerformed
        int row = 4;
        int column = 5;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn45.setForeground(Color.red);
        } else{
            btn45.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn45.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn45ActionPerformed

    private void btn54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn54ActionPerformed
        int row = 5;
        int column = 4;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn54.setForeground(Color.red);
        } else{
            btn54.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn54.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn54ActionPerformed

    private void btn55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn55ActionPerformed
        int row = 5;
        int column = 5;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn55.setForeground(Color.red);
        } else{
            btn55.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn55.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn55ActionPerformed

    private void btn53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn53ActionPerformed
        int row = 5;
        int column = 3;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn53.setForeground(Color.red);
        } else{
            btn53.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn53.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn53ActionPerformed

    private void btn05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn05ActionPerformed
        int row = 0;
        int column = 5;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn05.setForeground(Color.red);
        } else{
            btn05.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn05.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn05ActionPerformed

    private void btn63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn63ActionPerformed
        int row = 6;
        int column = 3;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn63.setForeground(Color.red);
        } else{
            btn63.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn63.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn63ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        int row = 1;
        int column = 3;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn13.setForeground(Color.red);
        } else{
            btn13.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn13.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn64ActionPerformed
        int row = 6;
        int column = 4;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn64.setForeground(Color.red);
        } else{
            btn64.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn64.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn64ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        int row = 1;
        int column = 4;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn14.setForeground(Color.red);
        } else{
            btn14.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn14.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn65ActionPerformed
        int row = 6;
        int column = 5;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn65.setForeground(Color.red);
        } else{
            btn65.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn61.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn65ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        int row = 1;
        int column = 5;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn15.setForeground(Color.red);
        } else{
            btn15.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn15.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn75ActionPerformed
        int row = 7;
        int column = 5;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn75.setForeground(Color.red);
        } else{
            btn75.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn75.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn75ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        int row = 2;
        int column = 3;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn23.setForeground(Color.red);
        } else{
            btn23.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn23.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn74ActionPerformed
        int row = 7;
        int column = 4;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn74.setForeground(Color.red);
        } else{
            btn74.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn74.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn74ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        int row = 2;
        int column = 4;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn24.setForeground(Color.red);
        } else{
            btn24.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn24.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn73ActionPerformed
        int row = 7;
        int column = 3;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn73.setForeground(Color.red);
        } else{
            btn73.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn73.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn73ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        int row = 2;
        int column = 5;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn25.setForeground(Color.red);
        } else{
            btn25.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn25.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn83ActionPerformed
        int row = 8;
        int column = 3;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn83.setForeground(Color.red);
        } else{
            btn83.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn83.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn83ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        int row = 3;
        int column = 3;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn33.setForeground(Color.red);
        } else{
            btn33.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn33.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn33ActionPerformed

    private void btn84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn84ActionPerformed
        int row = 8;
        int column = 4;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn84.setForeground(Color.red);
        } else{
            btn84.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn84.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn84ActionPerformed

    private void btn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn34ActionPerformed
        int row = 3;
        int column = 4;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn34.setForeground(Color.red);
        } else{
            btn34.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn34.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn34ActionPerformed

    private void btn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn35ActionPerformed
        int row = 3;
        int column = 5;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn35.setForeground(Color.red);
        } else{
            btn35.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn35.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn35ActionPerformed

    private void btn03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn03ActionPerformed
        int row = 0;
        int column = 3;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn03.setForeground(Color.red);
        } else{
            btn03.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn03.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn03ActionPerformed

    private void btn04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn04ActionPerformed
        int row = 0;
        int column = 4;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn04.setForeground(Color.red);
        } else{
            btn04.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn04.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn04ActionPerformed

    private void btn85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn85ActionPerformed
        int row = 8;
        int column = 5;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn85.setForeground(Color.red);
        } else{
            btn85.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn85.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn85ActionPerformed

    private void btn46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn46ActionPerformed
        int row = 4;
        int column = 6;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn46.setForeground(Color.red);
        } else{
            btn46.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn46.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn46ActionPerformed

    private void btn47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn47ActionPerformed
        int row = 4;
        int column = 7;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn47.setForeground(Color.red);
        } else{
            btn47.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn47.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn47ActionPerformed

    private void btn48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn48ActionPerformed
        int row = 4;
        int column = 8;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn48.setForeground(Color.red);
        } else{
            btn48.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn48.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn48ActionPerformed

    private void btn57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn57ActionPerformed
        int row = 5;
        int column = 7;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn57.setForeground(Color.red);
        } else{
            btn57.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn57.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn57ActionPerformed

    private void btn58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn58ActionPerformed
        int row = 5;
        int column = 8;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn58.setForeground(Color.red);
        } else{
            btn58.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn58.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn58ActionPerformed

    private void btn56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn56ActionPerformed
        int row = 5;
        int column = 6;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn56.setForeground(Color.red);
        } else{
            btn56.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn56.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn56ActionPerformed

    private void btn08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn08ActionPerformed
        int row = 0;
        int column = 8;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn08.setForeground(Color.red);
        } else{
            btn08.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn08.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn08ActionPerformed

    private void btn66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn66ActionPerformed
        int row = 6;
        int column = 6;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn66.setForeground(Color.red);
        } else{
            btn66.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn66.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn66ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        int row = 1;
        int column = 6;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn16.setForeground(Color.red);
        } else{
            btn16.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn16.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn67ActionPerformed
        int row = 6;
        int column = 7;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn67.setForeground(Color.red);
        } else{
            btn67.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn67.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn67ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        int row = 1;
        int column = 7;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn17.setForeground(Color.red);
        } else{
            btn17.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn17.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn68ActionPerformed
        int row = 6;
        int column = 8;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn68.setForeground(Color.red);
        } else{
            btn68.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn68.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn68ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        int row = 1;
        int column = 8;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn18.setForeground(Color.red);
        } else{
            btn18.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn18.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn78ActionPerformed
        int row = 7;
        int column = 8;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn78.setForeground(Color.red);
        } else{
            btn78.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn78.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn78ActionPerformed

    private void btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26ActionPerformed
        int row = 2;
        int column = 6;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn26.setForeground(Color.red);
        } else{
            btn26.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn26.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn26ActionPerformed

    private void btn77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn77ActionPerformed
        int row = 7;
        int column = 7;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn77.setForeground(Color.red);
        } else{
            btn77.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn77.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn77ActionPerformed

    private void btn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn27ActionPerformed
        int row = 2;
        int column = 7;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn27.setForeground(Color.red);
        } else{
            btn27.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn27.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn27ActionPerformed

    private void btn76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn76ActionPerformed
        int row = 7;
        int column = 6;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn76.setForeground(Color.red);
        } else{
            btn76.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn76.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn76ActionPerformed

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
        int row = 2;
        int column = 8;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn28.setForeground(Color.red);
        } else{
            btn28.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn28.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn86ActionPerformed
        int row = 8;
        int column = 6;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn86.setForeground(Color.red);
        } else{
            btn86.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn86.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn86ActionPerformed

    private void btn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn36ActionPerformed
        int row = 3;
        int column = 6;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn36.setForeground(Color.red);
        } else{
            btn36.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn36.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn36ActionPerformed

    private void btn87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn87ActionPerformed
        int row = 8;
        int column = 7;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn87.setForeground(Color.red);
        } else{
            btn87.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn87.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn87ActionPerformed

    private void btn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn37ActionPerformed
        int row = 3;
        int column = 7;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn37.setForeground(Color.red);
        } else{
            btn37.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn37.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn37ActionPerformed

    private void btn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn38ActionPerformed
        int row = 3;
        int column = 8;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn38.setForeground(Color.red);
        } else{
            btn38.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn38.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn38ActionPerformed

    private void btn06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn06ActionPerformed
        int row = 0;
        int column = 6;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn06.setForeground(Color.red);
        } else{
            btn06.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn06.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn06ActionPerformed

    private void btn07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn07ActionPerformed
        int row = 0;
        int column = 7;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn07.setForeground(Color.red);
        } else{
            btn07.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn07.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn07ActionPerformed

    private void btn88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn88ActionPerformed
        int row = 8;
        int column = 8;
        // Verifica se a tentativa é valida
        if(!DecimalBoard.checkAll(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()))){
            btn88.setForeground(Color.red);
        } else{
            btn88.setForeground(Color.black);
        }
        
        //Atribui a tentativa ao tabuleiro
        btn88.setText(spnValue.getValue().toString());
        DecimalBoard.setAttempt(DecimalBoard.playerBoard, row, column, Integer.parseInt(spnValue.getValue().toString()));
        //Verifica se Acabou o jogo
        if(DecimalBoard.isBoardFull(DecimalBoard.playerBoard)){
            lblResultado.setText("Tabuleiro Completo!");
        }
    }//GEN-LAST:event_btn88ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SudokuSwingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudokuSwingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudokuSwingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudokuSwingInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SudokuSwingInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn02;
    private javax.swing.JButton btn03;
    private javax.swing.JButton btn04;
    private javax.swing.JButton btn05;
    private javax.swing.JButton btn06;
    private javax.swing.JButton btn07;
    private javax.swing.JButton btn08;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn43;
    private javax.swing.JButton btn44;
    private javax.swing.JButton btn45;
    private javax.swing.JButton btn46;
    private javax.swing.JButton btn47;
    private javax.swing.JButton btn48;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn51;
    private javax.swing.JButton btn52;
    private javax.swing.JButton btn53;
    private javax.swing.JButton btn54;
    private javax.swing.JButton btn55;
    private javax.swing.JButton btn56;
    private javax.swing.JButton btn57;
    private javax.swing.JButton btn58;
    private javax.swing.JButton btn60;
    private javax.swing.JButton btn61;
    private javax.swing.JButton btn62;
    private javax.swing.JButton btn63;
    private javax.swing.JButton btn64;
    private javax.swing.JButton btn65;
    private javax.swing.JButton btn66;
    private javax.swing.JButton btn67;
    private javax.swing.JButton btn68;
    private javax.swing.JButton btn70;
    private javax.swing.JButton btn71;
    private javax.swing.JButton btn72;
    private javax.swing.JButton btn73;
    private javax.swing.JButton btn74;
    private javax.swing.JButton btn75;
    private javax.swing.JButton btn76;
    private javax.swing.JButton btn77;
    private javax.swing.JButton btn78;
    private javax.swing.JButton btn80;
    private javax.swing.JButton btn81;
    private javax.swing.JButton btn82;
    private javax.swing.JButton btn83;
    private javax.swing.JButton btn84;
    private javax.swing.JButton btn85;
    private javax.swing.JButton btn86;
    private javax.swing.JButton btn87;
    private javax.swing.JButton btn88;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JSpinner spnValue;
    // End of variables declaration//GEN-END:variables
}
