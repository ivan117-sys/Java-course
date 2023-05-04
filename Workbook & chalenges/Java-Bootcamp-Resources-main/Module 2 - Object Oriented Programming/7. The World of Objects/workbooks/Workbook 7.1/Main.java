import java.util.Arrays;

public class Main {
   
    public static void main(String[] args) {

        String[] array = {"Croatian"};

        Person josip = new Person();

        josip.name = "Josip";
        josip.nationality = "Croatian";
        josip.dateofBirth = "02.01.1994";
        josip.passport = new String[] {josip.name, josip.nationality};


        System.out.println(josip.name);
        System.out.println(josip.nationality);
        System.out.println(josip.dateofBirth);
        System.out.println(Arrays.toString(josip.passport));
        System.out.println(josip.seatNumber);
    }

    

}
