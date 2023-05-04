public class Biography {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.2 to access the link).


        // name (text)
        // age (whole number)
        // country (text)
        // sport (text)
        // hours (whole number)
        // game (text)
        // subject (text)
        // grade (character)

        String name = "Ivan";
        int age = 33;
        String country = "Croatia";
        String sports = "fotball";
        int hours = 1;
        String game = "chess";
        String subject = "English";
        char grade = 'A';
     
        // System.out.println("My name is " + name". I'm <age> years old", "and I'm from <country>" );
        // System.out.println("My favourite sport is <sport>. I play for <hours> hours a day");
        // System.out.println("When I'm tired, I like to play <game>.");
        // System.out.println("In school, my favourite subject was <subject>, I scored a <grade>.");

        System.out.println("My name is " + name + ". I'm " + age + " years old, and I'm from " + country );
        System.out.println("My favorite sport is " + sports + ". I play for " + hours + " hour a day");
        System.out.println("When I'm tired, I like to play " + game + ".");
        System.out.println("In school, my favorite subject was " + subject + ", I scored a " + grade + ".");

        // Compare your result to what's on Learn the Part.
    }
}
