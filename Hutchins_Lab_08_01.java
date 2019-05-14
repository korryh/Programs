////////////////////////////////////
// Kordell Hutchins
// 4/6/2019
// COSC 236-004
// Due 4/10/2019
// Hutchins_Lab_08_01
////////////////////////////////////

//importing packages
import java.io.*;
import java.util.Scanner;
public class Hutchins_Lab_08_01 {
  public static void main(String[] args) {
   //Initializing the file 
    File someFile = new File("input.txt");
    Scanner inputFile = null;
   //Delcaring variaibles
    float dynum = 0;
    float sum = 0;
    int num = 1;
    //File checking to verify the file is present and properly working
    boolean fileOpened = true;
    try{
      inputFile = new Scanner(someFile);
  }
    catch (FileNotFoundException e) {
      System.out.println("--- FIle Not Found! ---");
      fileOpened = false;
    }
   //Reading the file for numbers and ignoring letters and spaces
    while (inputFile.hasNext() && num <=11){
      //finding a number in the file
      if(inputFile.hasNextInt()){
        dynum = inputFile.nextInt();
      System.out.println("Number # " + num + " is: " + dynum);
      num++;
       sum += dynum;
    }
      //finding anything else in the file
      else { 
        inputFile.next();       
  }
 
     
    }
    //The average of the numbers in the file
 System.out.printf("The average of " + (num-1)  + " numbers/file = " + "%.2f\n", sum/(num-1));
  }
}//End of Program
 
    
    