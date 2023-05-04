public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 100;    //gryffindor points
        int ravenclaw = 500;    //ravenclaw points



        int margin = gryffindor - ravenclaw;

        if(margin >= 300) {
            System.out.println("Win the Championship");
        } else if (margin >= 0) {
            System.out.println("Gryffindor is second");
        } else if (margin >= -100) {
            System.out.println("Gryffindor is third!");
        } else if (margin < -100) {
            System.out.println("Gryffindor is fourth");
        }
        
    }
}
