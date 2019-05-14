//*******************************************/
// COSC 236 004
// Kordell Hutchins
// 2/26/19
//Due 3/11/19
//******************************************/
//Importing packages
  import java.util.Scanner;
public class Hutchins_HW_02_01 {
  public static void main(String [] args) {
   //Declaring Variables
    Scanner input = new Scanner(System.in);
    double BMI;
    //Prompt the user on the screen
    System.out.print("Enter BMI:");
    BMI = input.nextDouble();
    //Output is less than 18.5
    if (BMI < 18.5) 
      System.out.println("You entered BMI of "+ BMI + " and your Body Mass index is underweight");
    //Output is between 18.5 and 25
    else if (BMI >= 18.5 && BMI < 25)
      System.out.println("You entered BMI of "+ BMI + " and your Body Mass index is normal");
    //Output is between 25 and 30
    else if (BMI >= 25 && BMI < 30)
      System.out.println("You entered BMI of "+ BMI + " and your Body Mass index is overweight");
    else 
      //Output is greater than 30
      System.out.println("You entered BMI of "+ BMI + " and your Body Mass index is obese");
    
    
  }
}//End of Program