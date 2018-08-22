public class EasyDotCom {

  public static void main(String[] args) {

      int numberofHits = 0;

      GameHelper helper = new GameHelper();
      EasyDotCom theDotCom = new EasyDotCom();

      int randomNumber = (int) (Math.random() * 5);
      int[] location = {randomNumber, randomNumber + 1, randomNumber + 2};

      theDotCom.setCelllocation(location);
      boolean alive = true;

      while (alive == true) {

          String tipp = helper.getUserInsert("Geben Sie eine Zahl ein: ");
          String result = theDotCom.checkMe(tipp);

          numberofHits++;

          if (result.equals("Killed!")) {

              alive = false;

              System.out.println("Sie haben " + numberofHits + " Versuche benötigt.");
          }

      }

  }

  int[] celllocation;
  int numberofHits;

  public void setCelllocation(int[] location) {
        celllocation = location;
  }

  public String checkMe(String stringTipp) {

        int tipp = Integer.parseInt(stringTipp);
        String result = "No Hit!";

        for (int cell : celllocation) {

            if (tipp == cell) {

                result = "Hit!";

                numberofHits++;

                break;
            }
        }

        if (numberofHits == celllocation.length) {
            result = "Killed!";
        }

        System.out.println(result);


        return result;
  }

}
