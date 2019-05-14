//***********************************************//
// Kordell Hutchins
// 3/12/2019
// COSC 236-004
// Due 3/26/2019
// Hutchins_Lab_07_01
//***********************************************//
//Importing packages
import java.util.Scanner;
public class Hutchins_Lab_07_01 {
  public static void main(String[] args) {
 //initializing scanner
 Scanner input = new Scanner(System.in); 
//Declaring Variable
 int num;
 //Displaying output
 System.out.println("Drawing triangles program.");
 System.out.println("===========================");
 System.out.print("How many stars/last row (5-21)? ");
 //Receiving input
 num = input.nextInt();
 System.out.println(" ");
//Determining if input is out of range of 5-21
 while (num < 5 || num > 21){
  System.out.print("Out of range. Reenter: ");
   num = input.nextInt();
 }
 //invese loop for Redundancy 
 while ( num >= 5 && num <= 21) {
   //Outer most loop
   for (int i = 0; i < num; i++) {
     //Inner most loop
     for (int j = 0; j <= i; j++) {
       System.out.print("*");
     }//End of inner most loop
     System.out.println(" ");
     }//End of outer most loop
System.out.print("How many stars/last row (5-21)? "); //Displaying output
num = input.nextInt();//Receiving input
//Determining if input is out of range of 5-21 
while (num < 5 || num > 21){
  System.out.print("Out of range. Reenter: ");
   num = input.nextInt();
 }
input.close();
}
}
}//End of program