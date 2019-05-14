//*************************************//
// COSC 236 004
// Date 3/5/19
// Kordell Hutchins
// Due 3/12/19
// Hutchins_Lab_06_02
//************************************//
//importing packages
import java.util.Scanner;
public class Hutchins_Lab_06_02 {
  public static void main(String[] args) {
   //Initializing scanner
    Scanner input = new Scanner(System.in);
    //declaring variables
    int counter = 0;
    int even = 0;
    int odd = 0;
    int num;
    int input_num;
    //Prompting with priming read
    System.out.print("How many numbers in input? ");
    input_num = input.nextInt();
    //Prompting with output
    System.out.println("Enter " + input_num + " integers:");
    while( counter != input_num) {
      //Receiving input
      num = input.nextInt();
      //Determinging if the variable is even or not
      if (num % 2 == 0) {
       counter++;
       even++;
      }
      else
      {
       counter++;
       odd++;
      }
    }
    //Putting the total output
    System.out.println("You entered " + odd + " odd numbers and " + even + " even numbers.");
  }
}//End of program
