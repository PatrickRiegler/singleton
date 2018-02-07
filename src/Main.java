public class Main {
    public static void main(String[] args) {
        //Incrementer myInc = new Incrementer();
        Incrementer.increaseIncrementer();
        int cnt = Incrementer.getCount();
        System.out.println("counter: "+cnt);

        Incrementer.increaseIncrementer();
        Incrementer.increaseIncrementer();

        int cnt2 = Incrementer.getCount();
        System.out.println("counter: "+cnt2);


    }
}
