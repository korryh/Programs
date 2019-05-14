////////////////////////////////////
// Kordell Hutchins
// 4/6/2019
// COSC 236-004
// Due 4/10/2019
// Hutchins_Lab_08_02
///////////////////////////////////

//Importing packages
import java.io.*;
import java.util.*;
public class Hutchins_Lab_08_02 {
  public static void main(String[] args) {
    //Inititalizing print stream to the testoutput.txt file
    PrintStream outStream = null;
    //Checking file if redable and present
    try {
      outStream = new PrintStream(new File("testoutput.txt"));
      }
    catch (FileNotFoundException e) {
      System.out.println("Error opening the file testoutput.txt.");
      System.exit(0);
    }
    //Writing text to the testoutput.txt file
        outStream.println("Total Hours worked by Same Jones (id#101) = 42.75");
        outStream.println("Total Hours worked by Lisa Harris (id#102) = 55.75");
        outStream.println("Total Hours worked by Mike Brown (id#103) = 24.0");
        outStream.println("Total Hours worked by Simone Jackson (id#104) = 31.75");
        outStream.println("Total hours worked by Jason Miles (id#105) = 45.75");
      outStream.close();
    }
  }//End of Program

