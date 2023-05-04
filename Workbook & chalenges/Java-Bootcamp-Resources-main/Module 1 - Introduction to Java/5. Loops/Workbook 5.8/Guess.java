import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);
       
       //See Learn the Part for detailed instructions.

       int guess = scan.nextInt();
       int number = 4;

       while (number != guess) {
        System.out.print("Guess again: " + guess);
        guess = scan.nextInt();
       }

       if (number == guess) {
        System.out.println("You got it");
       }
        
        scan.close();
    }

}
