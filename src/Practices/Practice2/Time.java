package Practices.Practice2;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public String toStandard() {

        String period = (hour >= 12) ? "PM" : "AM";
        int standardHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        return standardHour + ":" + minute + ":" + second + period;
    }

    public void add(Time t) {
        this.second += t.second;
        this.minute += t.minute + this.second / 60;
        this.hour += t.hour + this.minute / 60;
        this.second %= 60;
        this.minute %= 60;
        this.hour %= 24;
    }

    public static void main(String[] args) {
        Time t = new Time(23, 5, 6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());

        Time t2 = new Time(4, 24, 33);
        t.add(t2);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
    }
}
