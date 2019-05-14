//*******************************************/
// COSC 236 004
// Kordell Hutchins
// 2/26/19
//Due 3/11/19
//******************************************/
//Importing packages
import java.util.Scanner;
public class Hutchins_HW_02_03 {
  public static void main(String [] args) {
  //Declaring Variable
    double num, result;
  //Declaring Scanner
    Scanner input = new Scanner(System.in);
  //getting input
  System.out.print("Enter a Number:  ");
  num = input.nextDouble();
//determining the output  
  if (num < 100) {
    //if num < 100, then result = 3*num and print the result
    result = 3*num;
    System.out.printf("The result is: 3 x " + num + " = " + "%.1f\n", result);
  }
  else {
    //If num >= 100, then result = 5*num and print the result
    result = 5*num;
      System.out.printf("The result is: 5 x " + num + " = " + "%.1f\n", result);
  }
  }//End of program
}