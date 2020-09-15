import java.util.Scanner;
/**
 * tells the user which number is bigger
 * @author Liana Bazzarella
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user to enter the first integer
    System.out.println("Please enter an integer:");

    //declare and initialize variable to store integer one
    int integerOne = input.nextInt();

    //ask the user to enter the second integer
    System.out.println("Please enter another integer:");

    //declare and initialize variable to store integer two
    int integerTwo = input.nextInt();
    
    // tells the user what number is the biggest
    if( integerOne > integerTwo ){
      System.out.println("The biggest number is " + integerOne + ".");
    } else if( integerOne < integerTwo ){
      System.out.println("The biggest number is " + integerTwo + ".");
    } else {
      // tells the user there is no biggest number
      System.out.println("There is no biggest number.");
    }
  }
}
