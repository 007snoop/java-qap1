public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(21,10,15);
        Time t2 = new Time(10, 20, 25);


        System.out.println(t1 + " First print");
        System.out.println(t2 + " First print");

        t1.counterUpSecond();
        t2.counterDownSecond();

        System.out.println(t1 + " Second print");
        System.out.println(t2 + " Second print");
    }
}
