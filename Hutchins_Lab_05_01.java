//*****************************//
// COSC236-004
// Name: Kordell Hutchins
// 2/26/19
// Due 3/05/19
//*****************************//

//importing package
import java.util.Scanner;
public class Hutchins_Lab_05_01 {
  public static void main(String [] args) {
    //Initializing Scanner
       Scanner input = new Scanner(System.in);
       //Declaring Variable
       char letter;
       //Getting input
      System.out.println("Enter a single uppercase letter and you will get the corresponding");
    System.out.print("digit on the telephone: ");
    letter = input.next().charAt(0);
    //if letter is either A, B, or C, then it corresponds with the digit 2
    if ( letter == 'A' || letter == 'B' || letter == 'C')
       System.out.println("The digit 2 corresponds to the letter " + letter + " on the telephone.");
    //if letter is either D, E,or F, then it corresponds with the digit 3
    else if (letter == 'D' || letter == 'E' || letter == 'F')
        System.out.println("The digit 3 corresponds to the letter " + letter + " on the telephone.");
    //If letter is either G, H, or I, then it corresponds with the digit 4
    else if (letter == 'G' || letter == 'H' || letter == 'I')
      System.out.println("The digit 4 corresponds to the letter " + letter + " on the telephone.");
    //If letter is either J, K, or L, then it corresponds with the digit 5
    else if (letter == 'J' || letter == 'K' || letter == 'L')
      System.out.println("The digit 5 corresponds to the letter " + letter + " on the telephone.");
    //If letter is either M, N, or O, then it corresponds with the digit 6
    else if (letter == 'M' || letter == 'N'|| letter == 'O')
      System.out.println("The digit 6 corresponds to the letter " + letter + " on the telephone.");
    //If letter is either P, R, or S, then it corresponds with the digit 7
    else if (letter == 'P' || letter == 'R' || letter == 'S')
      System.out.println("The digit 7 corresponds to the letter " + letter + " on the telephone.");
    //If letter is either T, U, or V, then it corresponds with the digit 8
    else if (letter == 'T'|| letter == 'U' || letter == 'V')
      System.out.println("The digit 8 corresponds to the letter " + letter + " on the telephone.");
    //If letter is either W, X, or Y, then it corresponds with the digit 9
    else if (letter == 'W' || letter == 'X' || letter == 'Y')
      System.out.println("The digit 9 corresponds to the letter " + letter + " on the telephone.");
    else
      //If the letter is any other letter than the ones above then ther is no digit
      System.out.println("There is no digit on the telephone that corresponds to " + letter);
  }
}//End of program