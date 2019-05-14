//*****************************//
// COSC236-004
// Name: Kordell Hutchins
// 2/26/19
// Due 3/05/19
//*****************************//
//importing packages
import java.util.Scanner;
public class Hutchins_Lab_05_02 {
  public static void main(String [] args) {
    //initializing scanner
    Scanner input = new Scanner(System.in);
    //declaring variables
    double test1_score, test2_score, final_score, assignments, total_score;
    char grade;
    //Prompting user with a question
 System.out.println("Please enter three test scores and assignment score, seperate each by spaces:");
 //Receiving input
 test1_score = input.nextDouble();
 test2_score = input.nextDouble();
 final_score = input.nextDouble();
 assignments = input.nextDouble();
//Calculation of total_score
 total_score = .15 * test1_score + .15 * test2_score + .40 * final_score + .30 * assignments;
 //Calulation of grade
 if (total_score >= 90)
   grade = 'A';
 else if (total_score < 90 && total_score >= 80)
   grade = 'B';
 else if (total_score < 80 && total_score >= 70)
   grade = 'C';
 else if (total_score < 70 && total_score >= 60)
   grade = 'D';
 else
   grade = 'F';
 //Posting results
 System.out.printf("score = " + "%.2f", total_score); 
 System.out.println(" and letter grade = " + grade + ".");

  } 
  }
