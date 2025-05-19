
//Q1b-2: Write a Java program for getting different colors through ArrayList interface 
//and remove the 2nd element and color "Blue" from the ArrayList
package arraylist_and_linkedList;
import java.util.ArrayList;

public class RemoveColorsArrayList {
 public static void main(String[] args) {
     // Create an ArrayList of colors
     ArrayList<String> colors = new ArrayList<>();

     // Add colors to the list
     colors.add("Red");
     colors.add("Blue");
     colors.add("Green");
     colors.add("Yellow");
     colors.add("Purple");

     System.out.println("Original list: " + colors);

     // Remove 2nd element (index 1)
     if (colors.size() > 1) {
         colors.remove(1);
         System.out.println("After removing 2nd element: " + colors);
     }

     // Remove "Blue" by value (won't do anything if already removed above)
     colors.remove("Blue");
     System.out.println("After trying to remove 'Blue': " + colors);
 }
}
