public class RandomNumbers {
    public static void main(String[] args) {
        
        // The instructions for this workbook are on Learn the Part (Workbook 6.14)

        int number = randomNumber();
      int[][] array = new int[100][10];
      
      for(int i = 0; i < array.length; i++) {
        for(int j = 0; j < array[i].length; j++) {
            array[i][j] = randomNumber();
        }
      } 


      print2DArray(array);

    }

    public static int randomNumber() {
        double randomNumber = Math.random()*100;
        return (int)randomNumber;
    }

    public static void print2DArray(int[][] numbers) {

        for (int i = 0; i < numbers.length; i++ ) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
