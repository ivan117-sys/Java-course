import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // See Learn the Part for detailed instructions.
        
        int diceRoll;
        int score = 0;

        System.out.println("Lets play Rollin Java. Type anything to start");
        scan.nextLine();
        System.out.println("Great, here are the rules: \n");
        System.out.println("If you roll a 6, the game stops.");
        System.out.println("If you roll a 4, nothing happens");
        System.out.println("Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll: ");

        while(score < 3) {
            diceRoll = rollDice();
            System.out.print("You rolled " + diceRoll);
            scan.nextLine();

            if(diceRoll == 6) {
                System.out.println("End of the game");
                break;
            }

            if(diceRoll == 4) {
                System.out.println("Zero points keep rolling");
                continue;
            }

            score++;
            System.out.println("One point. keep rolling");

        }
        if(score >=3 ) {
            System.out.println("Wow, thats lucky. You win");
        } else {
            System.out.println("Tough luck, you lose :(");
        }
    
        scan.nextLine();

    }

   
  
  public static int rollDice() {

   int number = (int) (Math.random() * 6 + 1);
    return number;
  }

  
  
}
