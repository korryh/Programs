///////////////////////////////
// Kordell Hutchins
// 4/17/2019
// COSC 236 004
// Due 4/23/2019
// Hutchins_Lab_10_01
//////////////////////////////

//Importing packages
import java.util.Arrays;
import java.util.Random;
public class Hutchins_Lab_10_01 {
  //Declaring classs constans
  public static final int SIZE = 15;
  public static final int MAX = 100;
  public static final int MIN = 0;
  public static void main (String[] args) {
   int [] cool = new int[SIZE];//Declaring an array
   //Declaring variables
   int max = 0;
   int min = 0;
   randArray(cool, MIN, MAX);//Method calling randArray and attaching the array cool, const MIN and MAX
   printArray(cool);//Method calling printArray and attaching the array cool
   max = maxArray(cool, SIZE);//Method calling maxArray in an expression to return data to the variable max
    min = minArray(cool, SIZE);//Method calling minArray in an expression to return data to the variable min
    //Displaying output
    System.out.println("The Maximum element in the array is: " + max);
    System.out.println("The Minimum element in the array is: " + min);
    System.out.println("The Difference betweeen Max value " + max + " and the Min value " + min + " = "+ (max - min));
    
  }
  //Method minArray
  public static int minArray(int [] list, int size) {
      int min = list[0];
      //Calculating the min of the elements of the array
    for(int i = 0; i < size; i++){
    if (list[i] < min)
      min = list[i];
    }
      return min;
  }
  //Method for maxArray
  public static int maxArray(int [] list, int size){
    int max = 0;//Declaring variable
    //Calculating the max of the elements of the array
    for(int i = 0; i < SIZE; i++) {
      if (list[i] > max)
        max = list[i];
    }
    return max;
            }
  //Method for printArray
  public static void printArray(int [] list){
    //Printing out the elements in the array   
    for(int i = 0; i < SIZE; i++)
   System.out.printf(list[i] + " ");
       System.out.println();
  }
  //Method for randArray
public static void randArray(int[] list, int low, int high) {
  Random rand = new Random();//initializing rand for randomization
  for(int i = 0; i < SIZE; i++)
    list[i] = rand.nextInt(high-low+1)+low;//inputing new elements for the array
}

}//End of Program