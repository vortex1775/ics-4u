package costofmeal;
import javax.swing.JOptionPane;

/**
 *      File Name:  CostOfMeal
 *  Programmed By:  Joseph Calarco
 * Programmed For:  Ms Lozier
 *           Date:  18 March, 2019
 *    Description:  Calculates cost of meal
 */

public class CostOfMeal {
    public static void main(String[] args) {
        double tax, meal, drink;
        String user_input;
        
        user_input = JOptionPane.showInputDialog("Enter the cost of the meal");
        meal = Double.parseDouble(user_input);
        user_input = JOptionPane.showInputDialog("Enter the cost of the drinks");
        drink = Double.parseDouble(user_input);
        user_input = JOptionPane.showInputDialog("Enter the HST tax rate %");
        tax = Double.parseDouble(user_input) / 100;
        
        double total_cost;
        total_cost = (meal + drink) + ((meal+drink) * tax);
        double rounded;
        rounded = Math.round(total_cost*100.0)/100.0;
        JOptionPane.showMessageDialog(null,"The total price of the meal is: $" +rounded);
        System.exit(0);
        
        
    }

}
