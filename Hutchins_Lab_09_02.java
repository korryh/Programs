/////////////////////////////////////////////
// Kordell Hutchins
// 4/9/2019
// COSC 236 004
// Due 4/16/2019
// Hutchins_Lab_09_01
////////////////////////////////////////////
//Importing packages
import java.util.Scanner;
public class Hutchins_Lab_09_02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); //Initializing Scanner
  //Declaring variables
    int num;
  int sumNum;
    System.out.printf("Enter a Positive Integer: "); //Displaying output
  num = input.nextInt();//Recieving input
  //Checking if input is out of the appropriate range
  while (num < 0){
    System.out.println(" ");
   System.out.printf("ERROR! Should be positive! Reenter: ");
   num = input.nextInt();
  }
  
  sumNum = sum(num); //Calling the "sum" method
  System.out.println("The sum of all integers between 1 and " + num + " is "+ sumNum);//Displaying output
  input.close();
  }//End of method
  
  //Start of "sum" method
  public static int sum(int x){
  int total_sum = 0;//declaring variable
  //Calculations  
  for (int i = 1; i <=x; i++){
    total_sum += i;
  }
  return total_sum;//returning variable
}
}