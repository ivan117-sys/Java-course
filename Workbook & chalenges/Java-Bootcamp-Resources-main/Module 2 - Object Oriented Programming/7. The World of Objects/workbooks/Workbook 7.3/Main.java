 public class Main {
  
    public static void main(String[] args) {

        
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);

        person.setNumber(10);
        
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getNumber() + "\n");

    }
  
  
}
