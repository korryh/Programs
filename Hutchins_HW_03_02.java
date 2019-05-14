//***********************************************//
// Kordell Hutchins
// 3/12/2019
// COSC 236-004
// Due 4/10/2019
// Hutchins_HW_03_02
//***********************************************//
//Importing packages
import java.util.Scanner;
public class Hutchins_HW_03_02 {
  public static void main(String[] args){
    //declaring variables
    int num;
    //initializing scanner
    Scanner input = new Scanner(System.in);
    //Prompting output
 System.out.print("Enter a number from 1-10; (>= 11 to stop): ");
 //Recieving input
 num = input.nextInt();
 //Using while to determine the output based on input
 while(num <= 10 && num >= 1) {
   System.out.print("Enter a number from 1-10; (>= 11 to stop): ");
   //Recieving the user's input again
 num = input.nextInt();
 }
 //Displaying the output once the loop is done
 System.out.println("You entered number " + num + " to stop");
  }
}