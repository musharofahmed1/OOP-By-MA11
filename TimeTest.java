import java.sql.Time;

import Time.Time1;

public class TimeTest {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour,int minute, int second){
        if(hour < 0|| hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60)
        {
            throw new IllegalAccessException("hour, minute and/or second was out of range")
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversalString(){
        return String.format("%d02d: %02d: %02d",hour, minute,second);
    }
      public String toString(){
            return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12:hour%12), minute,second(hour < 12 ? "AM" : "PM"));
        }

        public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();

        displayTime("After Time Object is Created", time);
        System.out.println();

        try{
            time.setTime(99,99,99);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        displayTime("After Calling set time with Individual values", time); 
    }

    public static void displayTime(String header, Time t){
        System.out.printf("%s%n UniversalTime: %s%n Standard Time: %s%n", header,t.toUniversalString(),t.String());
    }
}

}

