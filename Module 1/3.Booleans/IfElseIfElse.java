public class IfElseIfElse {
    public static void main(String[] args) {

        String weather = "rainy";

        if( weather.equals("sunny")) {
            System.out.println("It's a nice day for a walk.");
        } else if (weather.equals("rainy")) {

            System.out.println("Bring an umbrella!");
        } else {
                System.out.println("Not sure what to do in this weather.");

        }
     

        int score = 85;

        // 80 and above: System.out.println("You got an A!");
        // 70 and above: System.out.println("You got a B!");
        // 60 and above: System.out.println("You got a C.");
        // 50 and above: System.out.println("You got a D.");
        // Otherwise: System.out.println("You failed :(");

        String jobTitle = "manager";

        // CEO: System.out.println("You're the boss!");
        // manager: System.out.println("You're in charge of a team.");
        // Otherwise: System.out.println("You're an employee.");

        char grade = 'B';

        // A: System.out.println("Excellent work!");
        // B: System.out.println("Good job!");
        // C: System.out.println("You did okay.");
        // D: System.out.println("Hey, you still passed!");
        // Otherwise: System.out.println("You failed :(");
        
    }
}
