//Q1b.1: Write a Java program for getting different colors through ArrayList interface 
//and search whether the color "Red" is available or not
package arraylist_and_linkedList;


import java.util.ArrayList;

public class ColorSearchArrayList {
 public static void main(String[] args) {
     // Create an ArrayList of colors
     ArrayList<String> colors = new ArrayList<>();

     // Add colors to the list
     colors.add("Blue");
     colors.add("Green");
     colors.add("Red");
     colors.add("Yellow");
     colors.add("Purple");

     // Print the list
     System.out.println("Colors in the ArrayList: " + colors);

     // Search for the color "Red"
     if (colors.contains("Red")) {
         System.out.println("The color 'Red' is available in the list.");
     } else {
         System.out.println("The color 'Red' is NOT available in the list.");
     }
 }
}
