package stringvariabledemo;
/**
 *      File Name:  
 *  Programmed By:  Joseph Calarco
 * Programmed For:  
 *           Date:   
 *    Description:   
 */
import java.util.Scanner;  //Allows user to input information

public class StringVariableDemo {
    public static void main(String[] args) {
        
        Scanner user_input = new Scanner(System.in); //Scanner object
        String first_name; //variable declaration
        System.out.print("Enter your first name: ");
        first_name = user_input.next(); //sets input to variable
        
        String family_name;
        System.out.print("Enter your family name: ");
        family_name = user_input.next();
        
        String full_name = first_name + " " + family_name;
        System.out.println("You are "+ full_name);
        
    }

}
