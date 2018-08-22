import java.io.*;

public class GameHelper {

    public String getUserInsert(String prompt) {

        String insertCell = null;
        System.out.println(prompt + " ");

        try {

            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));

            insertCell = is.readLine();

            if (insertCell.length() == 0 ) return null;

        }catch (IOException e) {

            System.out.println("IOException: " + e);

        }

        return insertCell;
    }


}
