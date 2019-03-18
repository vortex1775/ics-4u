
import java.awt.*;      //Importing of needed libraries
import javax.swing.*;

/**
 *      File Name:  
 *  Programmed By:  Joseph Calarco
 * Programmed For:  
 *           Date:   
 *    Description:   
 */


public class TicTac extends JFrame {                //Sets up a TicTac class gets access to everything in the JFrame class
    TicTacEvent tictac = new TicTacEvent(this);     //Joins the two programs (TicTac.java and TicTacEvent.java) to work with each other
    JPanel row1 = new JPanel();                     //Creates a new frame
    JButton[][] boxes = new JButton [3][3];         //Creates a 2D gride of arrays for the 9 buttons
    JOptionPane win = new JOptionPane("Winner");    //Pip to declare the winner
    ImageIcon back = new ImageIcon("cardback.jpg"); //Loads the image to be used as the background of buttons

    public TicTac(){                                    //creates the method to draw the game board
        super("Tic Tac Toe");                           //creates title of app
        setSize(500,600);                               //sets size of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets the program to quite when window closes
        FlowLayout layout = new FlowLayout();           //arranges components from left to right centering horizontally to a 5p gap
        setLayout(layout);
        int name = 0;                                       //creates variable to keep track of box number
        String newname;                                     //will be used to hold button names
        GridLayout layout1 = new GridLayout(4, 3, 10, 10);  //Arranges the components in a rectangular grid where all cells are equal
        row1.setLayout(layout1);
        for(int x=0;x<=2;x++){                              //Creates and adds the buttons to the GridLayout goes up and down
            for(int y=0;y<=2;y++){                          //goes across the GridLayout
                name += 1;                                  //Adds one to the loop
                newname = Integer.toString(name);           //names newname from number 1-9
                boxes[x][y] = new JButton(newname);         // sets the boxes to show number 1-9
                boxes[x][y].setIcon(back);                  //sets the images of the back of the buttons
                row1.add(boxes[x][y]);                      //adds remaining components to the GridLayout
            }
        }
        add(row1);                                     //adds the GridLayout to the FlowLayout
        for(int x=0;x<=2;x++){                          //runs a loop to see which button was pressed
            for(int y=0;y<=2;y++){                      
                boxes[x][y].addActionListener(tictac);  //Listents to button being clicked
            }
        }
        setVisible(true);                               //shows the FlowLayout on the screen
    }
    public static void main(String[] arguments){        //main method of the program
        TicTac frame = new TicTac();                     //runs the screen layout class
    }
   
}
