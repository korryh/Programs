////////////////////////////
// Kordell Hutchins
// COSC 236 004
// 4/17/2019
// Due 4/23/2019
// Hutchins_Lab_10_02
////////////////////////////
//importing packages
import java.util.Scanner;
public class Hutchins_Lab_10_02 {
public static final int SIZE = 8;//Declaring a constant
  public static void main(String[] args) {
    
int [] value = new int[SIZE];//Initializing the array
promptUser(value);//Method calling promptUser with the "value" array
System.out.println("The Elements in your array are: ");//Displaying output
printArray(value);//Method calling printArray with the "value" array
  }
  //Method promptUser
  public static void promptUser(int[] list){
    Scanner input = new Scanner(System.in);//Initialzing Scanner 
   System.out.println("Enter in 8 integer values");//Displaying output
   for (int i = 0; i < SIZE; i++)
     list[i] = input.nextInt();//Reciving user input and inputing it in the array
input.close();  
  }
  //Method printArray
  public static void printArray(int[] list) {
   for (int i = 0; i < list.length; i++)
     System.out.print(list[i]+ " ");//Displaying the elements in the array
   System.out.println();
  }
}//End of Program