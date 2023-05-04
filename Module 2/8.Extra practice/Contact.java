import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Contact {
  private String name;
  private String phoneNumber;
  private String birthDate;
  private int age;


  public Contact(String name, String phoneNumber, String birthDate) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.birthDate = birthDate;
    this.age = toAge(birthDate);
    
  }

  public Contact(Contact source) {
    this.name = source.name;
    this.phoneNumber = source.phoneNumber;
    this.birthDate = source.birthDate;
    

  }

  private int toAge(String birthdate) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
      LocalDate date = LocalDate.parse(birthdate, formatter);
      LocalDate dateNow = LocalDate.now();
      Period period = Period.between(date, dateNow);
      // int birthdate1 = Integer.parseInt(period);
     int year = period.getYears();
     return year;
    }

    public void setBirthDate(String date) {
      this.birthDate = date;
      setAge(toAge(date));
    }

    private void setAge(int birthdate) {
      this.age = birthdate;

    }
}