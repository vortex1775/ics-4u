package addnumbers;

/**
 *      File Name:  AddNumbers
 *  Programmed By:  Joseph Calarco
 * Programmed For:  Ms Lozier
 *           Date:  13 March, 2019
 *    Description:  Adds numbers together
 */
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        int x, y, z;
        System.out.println("Enter two integers to calculate their sum");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("The sum of your entered numbers = "+z);
        
    }

}
