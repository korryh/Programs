//*******************************************/
// COSC 236 004
// Kordell Hutchins
// 2/19/19
//Due 2/26/2019
//******************************************/
//importing packages
import java.util.Scanner;
public class Hutchins_Lab_04_04 {
  public static void main(String [] args){
    //Assinging variables and initializing input
 Scanner input = new Scanner(System.in);
    double test1_score, test2_score, final_score, assignments, total_score;
    //Prompting user with a question
 System.out.println("Please enter three test scores and assignment score, seperate each by spaces:");
 //Receiving input
 test1_score = input.nextDouble();
 test2_score = input.nextDouble();
 final_score = input.nextDouble();
 assignments = input.nextDouble();
//Calculation of total_score
 total_score = .15 * test1_score + .15 * test2_score + .40 * final_score + .30 * assignments;
 //Posting results
 System.out.printf("The average score is: " + "%.2f\n", total_score);
  }
}