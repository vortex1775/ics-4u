package addintegerspane;
import javax.swing.JOptionPane;

/**
 *      File Name:  
 *  Programmed By:  Joseph Calarco
 * Programmed For:  
 *           Date:   
 *    Description:   
 */

public class AddIntegersPane {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Input 1st Number"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Input 2nd Number"));
        int z = x + y;
        JOptionPane.showMessageDialog(null,"Sum of entered integers = "+z);
        System.exit(0);
    }

}
