public class Incrementer {

    private static Incrementer myIncrementer = null;
    private static int count = 0;

    private Incrementer() {

    }

    public static Incrementer getInstance() {
        if(myIncrementer == null) {
            myIncrementer = new Incrementer();
        }
        return myIncrementer;
    }

    public static void increaseIncrementer() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
