package functionsdemo3;
import java.util.Scanner;
/**
 *      File Name:  
 *  Programmed By:  Joseph Calarco
 * Programmed For:  
 *           Date:   
 *    Description:   
 */

public class FunctionsDemo3 {
    private static int solve(int Num1, int Num2){
        int solution = Num1 * Num2;
        return solution;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Num1, Num2;
        System.out.print("Enter first number: ");
        Num1 = input.nextInt();
        System.out.print("Enter second number: ");
        Num2 = input.nextInt();
        int solution = solve(Num1, Num2);
        System.out.println("The sum of the numbers is: " +solution);
        input.close();
        
    }

}
