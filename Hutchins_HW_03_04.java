//***********************************************//
// Kordell Hutchins
// 3/12/2019
// COSC 236-004
// Due 4/10/2019
// Hutchins_HW_03_04
//***********************************************//
//Importing packages
import java.util.Scanner;
public class Hutchins_HW_03_04 {
  public static void main(String[] args) {
   //Initializing scanner
    Scanner input = new Scanner(System.in);
   //Declaring Variable
    char ans;
  //Setting the loop statement that executes before the prompt
    do{
     System.out.println("Towson University is a wonderful school!");
     System.out.println("Do you want to hear it again?");
     //Recieving user input
     ans = input.next().charAt(0);
   }while (ans == 'Y' || ans == 'y');//Determine the continuation of the loop by the input
  }
}