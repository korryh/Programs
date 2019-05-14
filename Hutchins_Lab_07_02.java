//***********************************************//
// Kordell Hutchins
// 3/12/2019
// COSC 236-004
// Due 3/26/2019
// Hutchins_Lab_07_02
//***********************************************//
//Importing packages
import java.util.Scanner;
public class Hutchins_Lab_07_02 {
  public static void main(String[] args) {
      //Initializing Scanner
      Scanner input = new Scanner(System.in);
      //Declaring variables
      int counter = 1;
      int input_num;
      int num = 0;
      int even = 0;
      int odd = 0;
      //Displaying output
  System.out.print("How many numbers in input? ");
  //Receiving input
  input_num = input.nextInt();

   //Setting the loop to exit once the counter is greater than input number
    while( counter <= input_num) {
      //Receiving input
       num = input.nextInt();
       //Checking if the input is within acceptable range
       while (num < 0 || num > 100){
   System.out.print("ERROR! Valid range 0 - 100. REENTER: ");
   num = input.nextInt();
    }  
       //If input is even
      if (num % 2 == 0) {
       counter++;
       even++;
      }
      //If input is odd
      else
      {
       counter++;
       odd++;
      }
    }
    //Putting the total output
    System.out.println("You entered " + odd + " odd numbers and " + even + " even numbers.");
    
  }
  }
