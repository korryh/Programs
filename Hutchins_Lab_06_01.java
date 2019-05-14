//*************************************//
// COSC 236 004
// Date 3/5/19
// Kordell Hutchins
// Due 3/12/19
// Hutchins_Lab_06_01
//************************************//
  import java.util.Scanner;
public class Hutchins_Lab_06_01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //declaring variables
    int studId;
    int counter = 0;
    double test1_score, test2_score, final_score, assignments, total_score, class_avg;
    double class_total = 0;
    char grade;
    //Prompting user with a question
    System.out.print("Enter student id# (0 to stop): ");
    studId = input.nextInt();
    while( studId != 0) {
 System.out.println("Please enter three test scores and assignment score, seperate each by spaces:");
 //Receiving input
 test1_score = input.nextDouble();
 test2_score = input.nextDouble();
 final_score = input.nextDouble();
 assignments = input.nextDouble();
//Calculation of total_score
 total_score = .15 * test1_score + .15 * test2_score + .40 * final_score + .30 * assignments;
 class_total += total_score;
 counter++;
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
 System.out.print("For test#1 = " + test1_score + " , test#2 = " + test2_score + " , final = " + final_score );
 System.out.print(" , and assignments = " + assignments);
 System.out.printf(" total score = " + "%.2f", total_score); 
 System.out.println(" and letter grade = " + grade + ".");
 System.out.println();
 System.out.print("Enter student id# (0 to stop): ");
    studId = input.nextInt();
    }
    class_avg = class_total / counter;
    //Posting the results
    System.out.println("=======================");
    System.out.printf("Class average is " + "%.2f\n", class_avg);
    }
}