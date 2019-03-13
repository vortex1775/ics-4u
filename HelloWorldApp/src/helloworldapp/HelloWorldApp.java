package helloworldapp;
import javax.swing.*;
import java.awt.*;
/**
 File Name:	HelloWorldApp
Programmer:	Joseph Calarco
Date:		March 14, 2019
Description:	This program demonstrates the
use of graphics.

 */
public class HelloWorldApp extends JFrame{
    public HelloWorldApp () {
        super ("Hello World!");
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JLabel pageLabel = new JLabel("The Wonderful Thing About Tiggers");
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(pageLabel);
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HelloWorldApp hw = new HelloWorldApp();
    }
}