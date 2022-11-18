package chapters.chapter_10.Exercises_10.E01;

import java.util.Date;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(System.currentTimeMillis());
    }
    public Time(long elapsedTime) {
        this((int)((elapsedTime/3_600_000) % 24),(int)((elapsedTime/60_000) % 60), (int)((elapsedTime/1_000) % 60));
    }

    public Time(int hour, int minute, int second) {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setTime(long elapsedTime) {
        hour=(int)((elapsedTime/3_600_000) % 24);
        minute=(int)((elapsedTime/60_000) % 60);
        second=(int)((elapsedTime/1_000) % 60);
    }
}


