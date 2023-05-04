import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the hangman game");

            
        
        
            int misses = 0;
            while(misses < 6) {

                System.out.println(gallows[0]);
                
                
            String word = chooseWord(words);
            int wordLength = word.length();
            char[] missedGuesses = new char[6];
            

            char[] placeholder = new char[wordLength] ;
            System.out.print("Word: ");
            for(int j = 0; j < wordLength; j++) {
                placeholder[j] = '_';
               
                System.out.print(" " + placeholder[j]);
              
            }
            
           
            for (int i = 0; i < missedGuesses.length; i++) {
                System.out.print(missedGuesses[i]);
            }
        
            System.out.println("\n\nMisses: ");
            System.out.println("\nGuess: ");
            
            
            char guess = scan.next().charAt(0);
            boolean Correctguess = checkGuess(word,guess);
            
            System.out.println(Correctguess);
            if(!Correctguess){
                
                missedGuesses[misses] = guess;
                misses++;   
                
            }
        }
   

        scan.close();
      
    }

    public static String chooseWord(String[] words) {

       int randomNumber = (int)(Math.random() *63) + 1;
     

       

        return words[randomNumber];
    }

    public static boolean checkGuess(String word, char guess) {

        boolean thisGuess = false;

        for(int i = 0; i < word.length(); i++){
            if(guess == word.charAt(i)) {
                thisGuess = true;
                return thisGuess;

            }
        }
            return thisGuess;
    }

 }





