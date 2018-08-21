public class GuessGame {

    Player p1;
    Player p2;
    Player p3;


    public void startGame() {

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int tipp1 = 0;
        int tipp2 = 0;
        int tipp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int endNumber = (int) (Math.random() * 10);
        System.out.println("Ich denke mir eine Zahl zwischen 0 und 9 aus...");

        while (true) {

            System.out.println("Die zu ratene Zahl ist: " + endNumber );

            p1.guess();
            p2.guess();
            p3.guess();

            tipp1 = p1.number;
            System.out.println("Spieler eins tippte: " + tipp1 );

            tipp2 = p2.number;
            System.out.println("Spieler zwei tippte: " + tipp2 );

            tipp3 = p3.number;
            System.out.println("Spieler drei tippte: " + tipp3 );

            if (tipp1 == endNumber) {
                p1isRight = true;
            }

            if (tipp2 == endNumber) {
                p2isRight = true;
            }

            if (tipp3 == endNumber) {
                p3isRight = true;
            }


            if (p1isRight || p2isRight || p3isRight) {

                System.out.println("Wir haben einen Gewinner!!");
                System.out.println("Spieler eins hat richtig geraten? " + p1isRight );
                System.out.println("Spieler zwei hat richtig geraten? " + p2isRight );
                System.out.println("Spieler drei hat richtig geraten? " + p3isRight );

            } else {

                System.out.println("Die Spieler müssen es erneut versuchen");

            }


        }


    }


}
