/////////////////////////////////////////////
// Kordell Hutchins
// 4/12/2019
// COSC 236 004
// Due 5/1/2019
// Hutchins_HW_04_01
////////////////////////////////////////////

import java.util.*;
import java.util.Arrays; //importing packages
public class Hutchins_HW_04_01 {
  public static final int MAX = 7;
  public static void main(String[] args) {
    //Declaring variables and arrays
    int [] age = {11, 12, 9, 30, 90, 71, 72, 84};
    int indexAns;
    int numAns;
    int sumArray = 0;
    int avg;
    Scanner input = new Scanner(System.in);
    //Displaying output
    System.out.printf("Array age is: ");
        System.out.printf("[");
        //Displaying the contents of the array
    for (int i = 0; i < MAX; i++){
      if (i == MAX){
        break;
      }
      System.out.printf(age[i] +", ");
    }
     System.out.printf(age[7] +"]");//Displaying the last element of the array
     System.out.println(" ");
     //New Line
     System.out.printf("Enter the number to seach the index: ");
     numAns = input.nextInt();
    System.out.println();
     indexAns = Arrays.binarySearch(age,numAns);//Entering the index for the search in a variable
     System.out.println("The key " + numAns + " is  found in the element with index " +  indexAns);//Displaying output
     Arrays.sort(age);//Sorting the array in accending order
     //Dislaying output
     System.out.printf("The sorted array age is: ");
     System.out.printf("[");
     //Displaying the contents of the array
        for (int i = 0; i <= MAX; i++){
      if (i == 7){
        break;
      }
      System.out.printf(age[i] +", ");
    }
         System.out.printf(age[7] +"]");//Displaying the last element in the array
    System.out.println(" ");
    //Calculating the total of the array
    for(int i = 0; i <= MAX; i++){
     sumArray += age[i];  
    }
    
    avg = sumArray/8;//finding the average of the array
    Arrays.fill(age,avg); //Changing all the elements in the array to the average
    //Displaying output
    System.out.printf("Array age (after .fill) shows the average age of : ");
    System.out.printf("[");
    //Displaying the contents of the elements inside the array
        for (int i = 0; i <= MAX; i++){
      if (i == 8){
        break;
      }
      System.out.printf(age[i] +", ");
    }
         System.out.printf(age[7] +"]");//Displaying the last element of the array
         System.out.println(" ");
  }
}