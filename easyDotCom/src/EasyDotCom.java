public class EasyDotCom {

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
