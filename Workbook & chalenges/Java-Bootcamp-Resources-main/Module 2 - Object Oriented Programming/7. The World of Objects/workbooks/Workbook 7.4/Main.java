 public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5); 
         boolean passport = person.applyPassport();

         person.chooseSeat();

         if(passport == true) {

            System.out.println("Congratulations " + person.getName() + ". Your passport was approved!");
         } else {

            System.out.println("We are sorry " + person.getName() + ". We cannot process your application.");

         }

        

        person.setSeatNumber(10);
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

        Person twin = new Person(person);
        twin.setName("Jad Slim");
        twin.setSeatNumber(3);

        System.out.println("Name: " + twin.getName() + "\n" +
        "Nationality: " + twin.getNationality() + "\n" + 
        "Date of Birth: " + twin.getDateOfBirth() + "\n" + 
        "Seat Number: " + twin.getSeatNumber() + "\n");
   

    }
  
  
}
