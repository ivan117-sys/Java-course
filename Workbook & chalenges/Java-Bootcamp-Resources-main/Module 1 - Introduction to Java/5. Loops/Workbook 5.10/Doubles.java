public class Doubles {
    public static void main(String[] args) {

   //      See Learn the Part for instructions.
       
        int dice1 = rollDice();
        int dice2 = rollDice();

        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2 + "\n");

        while(dice1 != dice2) {

            dice1 = rollDice();
            dice2 = rollDice();
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
        }

        if(dice1 == dice2) {
            System.out.print("You rolled doubles");
        }

    }

    public static int rollDice() {

        int number = (int)(Math.random()*6+1);
        return number;
    }

}





