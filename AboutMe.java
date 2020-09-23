/*
 * Programmer:BrennenDodman
 * Date:9/22/2020
 * Purpose:to Demonstrate that I know how to use variables
 */

public class AboutMe {
    public static void main (String [] args) {
        // Declaring the variables
    	String myName = "Brennen.";
    	int myAge = 16;
    	double myHeightInMetres = 1.92024;
        // Print the values
        System.out.println("Hi, my name is " + myName);
        System.out.println("I am " + myAge + " years old.");
        System.out.println("My height is " + myHeightInMetres + " m.");
        // Change the variable 
        myAge = 32;
      	myHeightInMetres = 2.58376;
        // Print the new values
        System.out.println("Some time passes...");          
        System.out.println("I am now " + myAge + " years old.");
        System.out.println("I have grown and I am " + myHeightInMetres + " m tall.");
    }
}
