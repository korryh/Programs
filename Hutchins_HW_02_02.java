//*******************************************/
// COSC 236 004
// Kordell Hutchins
//2/26/19
//Due 3/11/19
//******************************************/
//Importing package
import java.util.Scanner;
public class Hutchins_HW_02_02 {
  public static void main(String [] args) {
//Declaring variable and Scanner
    Scanner input = new Scanner(System.in);
     int num;
     //Getting input
     System.out.print("Enter an Integer:  ");
     num = input.nextInt();
     
     
     //Computing answer
     if (num % 2 == 0)
       //if num % 2 == 0, then it will be even
       System.out.println("Even");
     else
       //if num % 2 != 0, then it will be odd
       System.out.println("Odd");
  }
}//End of program