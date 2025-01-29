public class Date {
    // attributes
    private int day;
    private int month;
    private int year;

    // constructors
    public Date(int day, int month, int year) {
        this.day = 1;
        this.month = 1;
        this.year = 1900;
    }

    @override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
