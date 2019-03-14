package getinputfromuser;

/**
 *      File Name:  GetInputFromUser
 *  Programmed By:  Joseph Calarco
 * Programmed For:  Ms. Lozier
 *           Date:  14 Mar, 2019
 *    Description:  This Program gets input from the user
 */

import java.util.Scanner;

class GetInputFromUser {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        s = in.nextLine();
        System.out.println("You entered string "+s);
    }
    
}
