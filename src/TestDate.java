public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();

        date.setDate(4, 2, 19);
        System.out.println(date);

        int day = date.getDay();
    }
}
