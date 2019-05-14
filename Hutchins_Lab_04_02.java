//*******************************************/
// COSC 236 004
// Kordell Hutchins
// 2/19/19
//Due 2/26/2019
//******************************************/
//importing packages
import java.util.Scanner;

public class Hutchins_Lab_04_02 {
  //Assigning a constant 
   public static final double PI = 3.14159265;
  public static void main (String [] args) {
    //Assigning variables
    Scanner input = new Scanner(System.in);
      double dmeter, price, size, ppinch;
      //Prompting the user with the question
   System.out.println("Please enter the diameter of the pizza and its price, seperated by space:");
   //Receiving input from user
   dmeter = input.nextDouble();
   price = input.nextDouble();
   //Calculating with formulas 
   size = (PI * (dmeter * dmeter))/ 4;
   ppinch = price / size;
   //Displaying the output for the results
   System.out.printf("The size of the pizza with a diameter (in inches) of " +  "%.2f\n", dmeter  );
   System.out.printf("is " + "in square inches " + "%.2f\n", size );
   System.out.printf("The price per square inch for the same pizza is $" + "%.2f\n", ppinch );
  }
}