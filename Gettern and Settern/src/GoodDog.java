public class GoodDog {

    private int size;



    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }


    void bark() {

        if (size > 60) {
            System.out.println("Wuff Wuff!");
        } else if (size > 14) {
            System.out.println("Wau Wau!");
        } else {
            System.out.println("Jip Jip!");
        }

    }

}
