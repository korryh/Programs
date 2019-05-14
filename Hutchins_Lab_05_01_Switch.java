//*****************************//
// COSC236-004
// Name: Kordell Hutchins
// 2/26/19
// Due 3/05/19
//*****************************//
import java.util.Scanner;
public class Hutchins_Lab_05_01_Switch {
  public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    char letter;
    
    System.out.println("Entera single uppercase letter and you will get the corresponding");
    System.out.print("digit on the telephone: ");
    letter = input.next().charAt(0);
    
    switch (letter) {
    case 'A':
    case 'B':
    case 'C':
    System.out.println("The digit 2 corresponds to the letter " + letter + " on the telephone.");
    break;
    case 'D':
    case 'E':
    case 'F':
      System.out.println("The digit 3 corresponds to the letter " + letter + " on the telephone.");
    break;
    case 'G':
    case 'H':
    case 'I':
        System.out.println("The digit 4 corresponds to the letter " + letter + " on the telephone.");
    break;
      case 'J':
      case 'K':
      case 'L':
          System.out.println("The digit 5 corresponds to the letter " + letter + " on the telephone.");
    break;
      case 'M':
      case 'N':
      case 'O':
          System.out.println("The digit 6 corresponds to the letter " + letter + " on the telephone.");
    break;
      case 'P':
      case 'R':
      case 'S':
          System.out.println("The digit 7 corresponds to the letter " + letter + " on the telephone.");
    break;
      case 'T':
      case 'U':
      case 'V':
       System.out.println("The digit 8 corresponds to the letter " + letter + " on the telephone.");
    break;
      case 'W':
      case 'X':
      case 'Y':
          System.out.println("The digit 9 corresponds to the letter " + letter + " on the telephone.");
    break;
      default:
        System.out.println("There is no digit on the telephone that corresponds to " + letter);
    }
  }
}