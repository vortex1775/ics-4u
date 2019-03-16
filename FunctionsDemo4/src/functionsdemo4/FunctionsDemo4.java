package functionsdemo4;
import javax.swing.JOptionPane;
/**
 *      File Name:  
 *  Programmed By:  Joseph Calarco
 * Programmed For:  
 *           Date:   
 *    Description:   
 */

public class FunctionsDemo4 {
    private static int solve(int Num1, int Num2){
       int solution = Num1 + Num2;
       return solution;
    }
    public static void main(String[] args) {
        int Num1 = Integer.parseInt(JOptionPane.showInputDialog("Input 1st Number"));
        int Num2 = Integer.parseInt(JOptionPane.showInputDialog("Input 2nd Number"));
        int solution = solve(Num1, Num2);
        JOptionPane.showMessageDialog(null, "Sum of entered integers = "+solution);
    }

}
