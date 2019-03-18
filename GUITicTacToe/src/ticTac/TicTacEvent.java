import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TicTacEvent implements ItemListener, ActionListener, Runnable {
    TicTac gui;
    ImageIcon a = new ImageIcon("x.jpg");
    ImageIcon b = new ImageIcon("o.jpg");
    int clicks = 0;
    int win = 0;
    int[][] check = new int[3][3];
    public TicTacEvent(TicTac in){
        gui = in;
        for (int row=0; row<=2; row++){
            for (int col=0;col<=2;col++){
                check[row][col] = 0;
            }
        }
    }
    public void actionPerformed (ActionEvent event) {
        String command = event.getActionCommand();
        if (command.equals("1")){
            b1();
        }
        if (command.equals("2")){
            b2();
        }
        if (command.equals("3")){
            b3();
        }
        if (command.equals("4")){
            b4();
        }
        if (command.equals("5")){
            b5();
        }
        if (command.equals("6")){
            b6();
        }
        if (command.equals("7")){
            b7();
        }
        if (command.equals("8")){
            b8();
        }
        if (command.equals("9")){
            b9();
        }
        
    }
    
    void b1(){
        clicks = clicks + 1;
        if(clicks%2 == 1){
            check[0][0] = 1;
            gui.boxes[0][0].setEnabled(false);
            gui.boxes[0][0].setDisabledIcon(a);
        }else{
            check[0][0] =2;
            gui.boxes[0][0].setEnabled(false);
            gui.boxes[0][0].setDisabledIcon(b);
        }
        winner();
    }
    void b2(){
        clicks = clicks + 1;
        if(clicks%2 == 1){
            check[0][1] = 1;
            gui.boxes[0][1].setEnabled(false);
            gui.boxes[0][1].setDisabledIcon(a);
        }else{
            check[0][1] =2;
            gui.boxes[0][1].setEnabled(false);
            gui.boxes[0][1].setDisabledIcon(b);
        }
        winner();
    }
    void b3(){
        clicks = clicks + 1;
        if(clicks%2 == 1){
            check[0][2] = 1;
            gui.boxes[0][2].setEnabled(false);
            gui.boxes[0][2].setDisabledIcon(a);
        }else{
            check[0][2] =2;
            gui.boxes[0][2].setEnabled(false);
            gui.boxes[0][2].setDisabledIcon(b);
        }
        winner();
    }
    void b4(){
        clicks = clicks + 1;
        if(clicks%2 == 1){
            check[1][0] = 1;
            gui.boxes[1][0].setEnabled(false);
            gui.boxes[1][0].setDisabledIcon(a);
        }else{
            check[1][0] =2;
            gui.boxes[1][0].setEnabled(false);
            gui.boxes[1][0].setDisabledIcon(b);
        }
        winner();
    }
    void b5(){
        clicks = clicks + 1;
        if(clicks%2 == 1){
            check[1][1] = 1;
            gui.boxes[1][1].setEnabled(false);
            gui.boxes[1][1].setDisabledIcon(a);
        }else{
            check[1][1] =2;
            gui.boxes[1][1].setEnabled(false);
            gui.boxes[1][1].setDisabledIcon(b);
        }
        winner();
    }
    void b6(){
        clicks = clicks + 1;
        if(clicks%2 == 1){
            check[1][2] = 1;
            gui.boxes[1][2].setEnabled(false);
            gui.boxes[1][2].setDisabledIcon(a);
        }else{
            check[1][2] =2;
            gui.boxes[1][2].setEnabled(false);
            gui.boxes[1][2].setDisabledIcon(b);
        }
        winner();
    }
    void b7(){
        clicks = clicks + 1;
        if(clicks%2 == 1){
            check[2][0] = 1;
            gui.boxes[2][0].setEnabled(false);
            gui.boxes[2][0].setDisabledIcon(a);
        }else{
            check[2][0] =2;
            gui.boxes[2][0].setEnabled(false);
            gui.boxes[2][0].setDisabledIcon(b);
        }
        winner();
    }
    void b8(){
        clicks = clicks + 1;
        if(clicks%2 == 1){
            check[2][1] = 1;
            gui.boxes[2][1].setEnabled(false);
            gui.boxes[2][1].setDisabledIcon(a);
        }else{
            check[2][1] =2;
            gui.boxes[2][1].setEnabled(false);
            gui.boxes[2][1].setDisabledIcon(b);
        }
        winner();
    }
    void b9(){
        clicks = clicks + 1;
        if(clicks%2 == 1){
            check[2][2] = 1;
            gui.boxes[2][2].setEnabled(false);
            gui.boxes[2][2].setDisabledIcon(a);
        }else{
            check[2][2] =2;
            gui.boxes[2][2].setEnabled(false);
            gui.boxes[2][2].setDisabledIcon(b);
        }
        winner();
    }
    void winner(){
        for(int x=0;x<=2;x++){
            if ((check[x][0] == check [x][1]&&(check[x][0]==check[x][2]))){
                if (check [x][0] == 1) {
                    JOptionPane.showMessageDialog(null,"X is the winner");
                    win = 1;
                } else if (check[x][0]==2){
                    JOptionPane.showMessageDialog(null, "O is the winner");
                }
            }
        
        }
        for (int x=0;x<=2;x++){
            if ((check[0][x]==check[1][x])&&(check[0][x]==check[2][x])){
                if (check[0][x]==1) {
                    JOptionPane.showMessageDialog(null, "X is the winner");
                    win = 1;
                } else if (check[0][x]==2) {
                    JOptionPane.showMessageDialog(null, "O is the winner");
                    win =1;
                }
             }
        }
            if ((check[0][0]==check[1][1])&&(check[0][2]==check[2][2])){
                if (check[1][1]==1) {
                    JOptionPane.showMessageDialog(null, "X is the winner");
                    win = 1;
                } else if (check[1][1]==2) {
                    JOptionPane.showMessageDialog(null, "O is the winner");
                    win = 1;
                }
            if ((clicks==9)&& (win==0)){
                JOptionPane.showMessageDialog(null, "The game is a tie");
                
            }
    }
    }
            public void itemStateChanged(ItemEvent e){
                throw new UnsupportedOperationException("Not supported yet.");
            }
            public void run(){
                throw new UnsupportedOperationException("Not supported yet,");
            }
}   
    
