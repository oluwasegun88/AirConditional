package chapter8;

public class Time {
    private int minute;
    private int second;
    private int hour;

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public Time(int minute, int second, int hour) {
        validate(minute, second, hour);

        this.second = second;
        this.minute = minute;
        this.hour = hour;

    }

    private void validate(int minute, int second, int hour) {
        validateSecond(second);
        validateMinute(minute);
        validateHour(hour);
    }

    private void validateSecond(int second) {
        if(second < 0 || second > 59) throw new IllegalArgumentException(String.format("second entered is %s, please entered seconds between 0 and 59", second));
    }

    private void validateMinute(int minute) {
        if(minute < 0 || minute > 59) throw new IllegalArgumentException(String.format("minute entered is %s, please entered seconds between 0 and 59", minute));
    }

    private void validateHour(int hour) {
        if(hour < 0 || hour > 23) throw new IllegalArgumentException(String.format("hour entered is %s, please entered seconds between 0 and 59", hour));
    }
}
