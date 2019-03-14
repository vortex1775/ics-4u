package adddoublespane;
import javax.swing.JOptionPane;

/**
 *      File Name:  
 *  Programmed By:  Joseph Calarco
 * Programmed For:  
 *           Date:   
 *    Description:   
 */

public class AddDoublesPane {
    public static void main(String[] args) {
        double x, y;
        String input;
        input = JOptionPane.showInputDialog("Enter a number: ");
        x = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter a second number: ");
        y = Double.parseDouble(input);
        double z;
        z = x+y;
        JOptionPane.showMessageDialog(null,"Sum of entered numbers = "+z);
        System.exit(0);
    }

}
