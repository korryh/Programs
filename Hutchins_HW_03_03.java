//***********************************************//
// Kordell Hutchins
// 3/12/2019
// COSC 236-004
// Due 4/10/2019
// Hutchins_HW_03_03
//***********************************************//

public class Hutchins_HW_03_03 {
  public static void main(String[] args){
  //Outer most loop. Going to create 4 rows
    for (int i = 0; i < 4; i++){
      //Inner most loop. Going to print "*" 5 times per row
      for (int j=1; j <=5; j++){
        System.out.print("*");
    }//End of inner loop
      System.out.println(" ");
      System.out.println(" ");// Provide spacing between each row
    }//End of outer loop
  }
}//End of program