public class MovieTest {

    public static void main(String[] args) {

        Movie one = new Movie();
        one.title   = "Von der Krise verweht";
        one.genre   = "Tragisch";
        one.rating  = -2;

        Movie two = new Movie();
        two.title   = "Vier Deadlines und ein Todesfall";
        two.genre   = "Komödie";
        two.rating  = 5;
        two.showMovie();

        Movie three = new Movie();
        three.title     = "Byte Club";
        three.genre     = "Tragisch, aber letzendlich aufbauend";
        three.rating    = 127;

    }


}
