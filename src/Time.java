/**
 * Created by opilane on 19.10.2016.
 */
public class Time {
    public static void main(String[] args) {
        int hour = 15;
        int minute = 18;
        int second = 35;
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.print(second);
        System.out.println(":");
        int midnight;
        int fullday = 86400;
        int remaining;
        midnight = (hour * 60 * 60 )+ (minute * 60) + second; // päevas on 86400 sekundit
        remaining = fullday - midnight;
        System.out.println("seconds since midnight " + midnight);
        System.out.print("seconds remaining in the day " + remaining);

    }

}
