public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.5).

        System.out.print("Here are the scores: <score elements>");

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");

        int[] numbers = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};

        

        for(int i = 0; i < numbers.length; i++) {
            
            if(numbers[i] > highScore) {
                highScore = numbers[i];
            }

            System.out.print("Numbers are " + numbers[i]);
        }

        System.out.print("highscore is" + highScore);
        
    }  
    
    public static int randomNumber() {
       int number = (int) (Math.random() * 49999 + 1);

       return number;
    }

}
