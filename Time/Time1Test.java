package Time;

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
