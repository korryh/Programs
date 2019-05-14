//*******************************************/
// COSC 236 004
// Kordell Hutchins
// 2/19/19
//Due 2/26/2019
//******************************************/
//importing package
import java.util.Scanner;

public class Hutchins_Lab_04_01 {
  public static void main (String [] args) {
    //Declaring variables and input
     double len, wid, peri, area;
     Scanner input = new Scanner(System.in);
  //Asking the user to input data
 System.out.println("Enter diameter and price of pizza, seperated by a space:");
 //Recieveing input from user
 len = input.nextDouble();
 wid = input.nextDouble();
 //Calculations
 peri = 2 * (len + wid);
 area = len * wid;

//Output 
 System.out.printf("The perimeter of the rectangle with the length in yards is " + "%.2f\n", len);
 System.out.printf("and the width = " + "%.2f\n", wid);
 System.out.printf("will be " + "%.2f\n", peri);
 System.out.printf("The area of the rectangle with the length in yards, " + "%.2f\n", len);
 System.out.printf("the width in yards, " + "%.2f\n", wid); 
 System.out.printf("So the area will be " + "%.2f\n", area);
  }
}//End of Program