/////////////////////////
// Kordell Hutchins
// COSC 236 004 
// 5/7/2019
// Due 5/14/2019
// Hutchins_Lab_12_01
//////////////////////

//importing packages
import java.util.Scanner;
import java.util.Random;
public class Hutchins_Lab_12_01 {
  //Declaring class constants
  public static final int MIN = 1;
  public static final int MAX = 15;
  public static void main(String[] args) {
    int size;//Initializing variable
    Scanner input = new Scanner(System.in); //Initializing Scanner 
    System.out.printf("Enter size of Array ");//Displaying output
    size = input.nextInt();//Receiving input
    System.out.println();
    while(size <= 0) {//Verifying input was not a negative
      System.out.printf("ERROR! Should be positive. REENTER: ");
      size = input.nextInt();
    }
    int [] a = new int[size];//Declaring array
    randArray(a,size, MIN, MAX);//Method call randArray
    System.out.println("The orignal list is: ");//Displaying output
    printArray(a, size);//Method call printArray
      System.out.println("The sorted list is: ");//Displaying output
    sortArray(a, size);//Method call sortArray
    printArray(a,size);//Method call printArray
    }//EoM main method
  
  public static void randArray(int [] list, int size, int low, int high) {//Starting of randArray Method
    Random rand = new Random();//Declaring rand 
   for(int i = 0; i < size; i++){//Calculations
    list[i] = rand.nextInt(high-low+1)+low;
   }
  }//EoM of randArray
  
  public static void printArray(int [] list, int size){//Starting of printArray Method
   for (int i = 0; i < size; i++){//Calculations
   System.out.printf(list[i] + " ");//Displaying output
   }
   System.out.println();
  }//EoM of printArray
  
  public static void sortArray(int [] list, int size){//Starting of sortArray Method
 int temp;//declaring a temporary variable
 for(int pass = 0; pass < size-1; pass++){//Calculations using sort bubble technique
   for(int i = 0; i < size-1; i++){
     if(list[i] > list[i+1]){
       temp = list[i];
       list[i] = list[i+1];
       list[i+1] = temp;
     }
   }
 }
  }//EoM of sort Array
  }//EoF 