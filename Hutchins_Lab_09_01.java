/////////////////////////////////////////////
// Kordell Hutchins
// 4/9/2019
// COSC 236 004
// Due 4/16/2019
// Hutchins_Lab_09_01
////////////////////////////////////////////
//importing packages
import java.util.Scanner;
public class Hutchins_Lab_09_01 {
  //Declaring a constant
public static final double TAX = .05;
  public static void main(String[] args) {
  //declaring a double
    double sales;
    //Initializing Scanner
    Scanner input = new Scanner(System.in);
    System.out.printf("Enter Total Sale: "); // Displaying output
    sales = input.nextFloat();//Recieving input
    sales = findTotalBill(sales); //Calling the method through an expression
  System.out.printf("The Customer's total bill is " + "%.2f\n",sales );//Displaying output
  input.close();
  }//End of Main method
  
  public static double findTotalBill( double x) { //Starting a value-returing method of double
    //Initializing variables
    double sales_tax;
    double total_bill;
    //Appplying calculations
    sales_tax = x * TAX; 
      total_bill = x + sales_tax;
        return total_bill;//Returing value  
  }//End of findTotalBill Method
  
}//End of program