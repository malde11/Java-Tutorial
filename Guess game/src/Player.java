public class Player {

    int number = 0;

    public void guess() {

        number = (int) (Math.random() * 10);
        System.out.println("Ich tippe auf die Zahl: " + number);

    }


}
