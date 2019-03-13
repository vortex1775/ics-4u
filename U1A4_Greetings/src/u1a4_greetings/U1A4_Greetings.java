/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1a4_greetings;
import javax.swing.*;
import java.awt.*;

/**
 *    FileName:  U1A4_Greetings
 * Description:  Create an application that describes things about me
 *  Programmer:  Joseph Calarco
 *       Class:  ICS 4U
 *        Date:  March 14. 2019
 * 
 */


public class U1A4_Greetings extends JFrame {
    String name  = "Joseph Calarco";
    String tv    = "The Blacklist";
    String age   = "21";
    String color = "Blue";
    String music = "EDM";
    String food  = "Pizza";
    
    public U1A4_Greetings () {
        super("About Me.");
        setSize(350,125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);        
        JLabel nameLabel = new JLabel("My name is " + name);
        JLabel ageLabel = new JLabel("I am " + age + " years old");
        JLabel colourLabel = new JLabel("My favourite colour is " + color);
        JLabel musicLabel = new JLabel("My favourite type of music is " + music);
        JLabel foodLabel = new JLabel("My favourite food is " + food);
        JLabel tvLabel = new JLabel("My favourite television show is " + tv);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(nameLabel);
        add(ageLabel);
        add(colourLabel);
        add(musicLabel);
        add(foodLabel);
        add(tvLabel);
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        U1A4_Greetings hw = new U1A4_Greetings();
    }
    
}
