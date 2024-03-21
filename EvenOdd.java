/**
* This program is used to find the result if your number is even or odd and tells you   
*
* @author Frankie Fox
* @version 1.0
* @since   2024-20-03
*/
import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        //Thi is the type userNumString is
        String userNumString = "";
        //This is the while loop that is used and if q is selected it will quit
        while (!userNumString.equals("q")) {
            Scanner sc = new Scanner(System.in);
            //This print out to the user asking to enter in a number or q to quit
            System.out.print(" Please enter your number or q to quit: ");
            //Turns userNumString into a string 
            userNumString = sc.nextLine();
            //This is the action of clicking q where the program will break
            if (userNumString.equals("q")) {
                //This prints out you have escaped the loop
                System.out.println("You have escaped the loop.");
                break;
            }
            else {
                //This tries int userNum to an integer 
                try {
                    int userNum = Integer.valueOf(userNumString);
                    //This checks if your number is even
                    if (userNum % 2 == 0) {
                    //This prints out that your number is even
                        System.out.println("Your number is even. ");

                    } else {
                        //This checks if your number is odd
                        if (userNum % 2 != 0) {
                        //This prints your number is odd
                            System.out.println("Your number is odd.");

                        }
                    }//This is the try catch that catches any strings that are not q and gives back an error
                } catch (Exception e) {
                    //This prints error when it is given a string
                    System.out.println("Error: Invalid input entered.");
                    break;
                }
            }
            
            sc.close();
        }
    }
}
    

