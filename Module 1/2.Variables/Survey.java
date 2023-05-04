import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {

        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        System.out.println("Welcome. Thank you for taking the survey");

        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        System.out.println("\nWhat is your name?");
        counter++;
        String name = scanner.nextLine();

        System.out.println("\nHow much money do you spend on coffee?");
        counter++;
        double coffeePrice = scanner.nextDouble();

        System.out.println("\nHow much money do you spend on fast food?");
        counter++;
        double foodPrice = scanner.nextDouble();


        System.out.println("\nHow many times a week do you buy coffee?");
        counter++;
        int coffeeAmount = scanner.nextInt();

        System.out.println("\nHow many times a week do you buy fast food?");
        counter++;
        int foodAmount = scanner.nextInt();

        scanner.close();

        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("\nThank you " + name + " for answering all " + counter + " questions");
        System.out.println("Weekly, you spend $" + (coffeeAmount * coffeePrice) + " on coffee");
        System.out.println("Weekly, you spend $" + (foodAmount * foodPrice) + " on food");

    }
}
