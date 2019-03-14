package paneinput;
import javax.swing.JOptionPane;
/**
 *      File Name:  
 *  Programmed By:  Joseph Calarco
 * Programmed For:  
 *           Date:   
 *    Description:   
 */

public class PaneInput {
    public static void main(String[] args) {
        
        String first_name;
        first_name = JOptionPane.showInputDialog("First Name");
        
        String family_name;
        family_name = JOptionPane.showInputDialog("Family Name");
        
        String full_name = "You are " + first_name + " " + family_name;
        JOptionPane.showMessageDialog(null, full_name);
        System.exit(0);
    }

}
