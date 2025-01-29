public class Date {
    // attributes
    private int day;
    private int month;
    private int year;

    // constructors
    public Date() {
        this.day = 01;
        this.month = 01;
        this.year = 1990;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // getter
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    // setters
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @override
    public String toString() { 
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
