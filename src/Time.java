public class Time {
    // attributes 
    private int hour;
    private int minute;
    private int second;

    // constructors 

    public Time(int hour, int minute, int second) { 
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    // getters 
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    // setters
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    @override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second) ;
    }
}
