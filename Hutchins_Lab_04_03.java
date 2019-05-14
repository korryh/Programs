//*******************************************/
// COSC 236 004
// Kordell Hutchins
// 2/19/19
//Due 2/26/2019
//******************************************/ 
//importing packages
import java.util.Scanner;
public class Hutchins_Lab_04_03 {
  public static void main(String [] args) {
    //Assinging variables and initiating user input
    Scanner input = new Scanner(System.in);
     int num1, num2, ans1, ans2;
    double ans3;
    //Prompting the user with the question
    System.out.println("Please enter the first and second number, sepearted by a space in between");
    num1 = input.nextInt();
    num2 = input.nextInt();
   //Calculations 
    ans1 = num1 % num2;
    ans2 = num1 / num2;
    ans3 = (double) num1 / num2;
    //Prompting results
    System.out.println("First number is " + num1 + ". Second number is " + num2 + ".");
    System.out.println( num1 + " modulo " + num2 + " equals " + ans1);
    System.out.println( num1 + " divided by " + num2 + " using integer division equals " + ans2);
    System.out.printf( num1 + " divided by " + num2 + " using floating-point division equals " + "%.2f\n", ans3);
  }
}