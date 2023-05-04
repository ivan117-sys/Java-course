public class ReturnValues {
  public static void main(String[] args) {
  double area1 = calculateArea(2.3, 3.6);
  double area2 = calculateArea(1.6, 2.4);

  double area3 = calculateArea(2.6, 4.2);

  calculateArea(-5, 2.3);

  String englishExplanition = explainArea("English");
  String frenchExplanition = explainArea("French");
  String spanishExplanition = explainArea("Spanish");
  String italianExplanition = explainArea("Italian");



  }
  public static double calculateArea(double length, double width) {
    if(length < 0 || width < 0) {
      System.out.println("Invalid dimensions");
      System.exit(0);
    }
    double area = length * width;
    return area; 

  }
  public static String explainArea(String language) {
    switch (language) {
      case "English": return "Area equals length * width";
      case "French": return "La surface est egale a la longueur * la largeur";
      case "Spanish": return "area es igual a largo * ancho";
      default: return "Language not available";
    }
  } 

  
}

// English "Area equals length * width"

// French "La surface est egale a la longueur * la largeur"

// Spanish "area es igual a largo * ancho"