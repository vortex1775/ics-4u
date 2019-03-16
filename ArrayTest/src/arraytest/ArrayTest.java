package arraytest;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *      File Name:  
 *  Programmed By:  Joseph Calarco
 * Programmed For:  
 *           Date:   
 *    Description:   
 */

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList listTest = new ArrayList();
        listTest.add("First item");
        listTest.add("Second item");
        listTest.add("third item");
        listTest.add(7);
        listTest.add(8);
        System.out.println(listTest);

        String aryAnimals [] = {"Monkey", "Horse", "Chicken", "Cow", "Dog", "Cat"};
        
        Arrays.sort(aryAnimals);
         for (int i = 0; i < aryAnimals.length; i++){
             System.out.println(aryAnimals[i]);
         }
                
    
    }

}
