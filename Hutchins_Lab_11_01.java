///////////////////////////////
// Kordell Hutchins
// 4/27/2019
// COSC 236 004
// Due 4/30/2019
// Hutchins_Lab_11_01
//////////////////////////////


//Importing package
import java.util.Random;
public class Hutchins_Lab_11_01 {
  //Declaring Constants
  public static final int ROW = 5;
  public static final int COL = 4;
  public static final int MIN = 0;
  public static final int MAX = 30;
  public static void main(String[] args) {
    int [][] a = new int [ROW] [COL];//Initializing the array
   //initializing variable
    int largest;
    int smallest;
    int sum;
    randArray(a,MIN,MAX);//Method calling a void type array
    printArray(a,ROW,COL);//Method calling a void type array
    largest = findMaxArray(a,ROW,COL);//Method calling a returning type array
    System.out.println("The max value for the entire matrix is: " + largest);//displaying output
    System.out.println();
    smallest = findMinArray(a,ROW,COL);//Method calling a 
        System.out.println("The min value for the entire matrix is: " + smallest);
   System.out.println();
        sum = sumArray(a, ROW,COL);
    System.out.println("The sum for the entire matrix is: " + sum); 
  }
 
  public static void randArray (int[][] matrix, int low, int up) {//Method of randArray
   Random rand = new Random();//Initializing rand as random delcaration
   //Calculations
    for (int r = 0; r < ROW; r++){
      for(int c = 0; c < COL; c++)
        matrix[r][c] = rand.nextInt(up-low+1)+low;
    }
        
  }
  
  public static void printArray(int[][] matrix, int row, int col) {//Method of printArray
    //Calculations
    for(int r = 0; r < row; r++) {
      for(int c = 0; c < col; c++)
        System.out.printf("%5d", matrix[r][c]);
      System.out.println();
    }
  }
  public static int findMaxArray(int[][] matrix, int row, int col){//Method of findMaxArray
   int max = matrix[0][0];//Assigning max to the first element in the matrix array
   //Calculations
   for(int r = 0; r < row; r++){
     for(int c = 0; c < col; c++){
       if(matrix[r][c] > max)
         max = matrix[r][c];
     }
   }
     return max;//retunring max value
  }
  public static int findMinArray(int[][] matrix, int row, int col) {//Method of findMinArray
   int min = matrix[0][0];//Assinging min to the first element in the matrix array
   //Calculations
   for(int r = 0; r < row; r++){
     for(int c = 0; c < col; c++) {
       if(matrix[r][c] < min)
         min = matrix[r][c];
     }
   }
   return min;//Returning min value
  }
  public static int sumArray(int[][] matrix, int row, int col){//Method of sumArray
   int sum = 0;//Assigning sum to integer 0
   //Calculations
     for(int r = 0; r < row; r++){
     for(int c = 0; c < col; c++) {
       sum = sum+matrix[r][c];
     }
     }
     return sum;//Returning sum value
  }
}//End of Program
