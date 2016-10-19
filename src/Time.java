/**
 * Created by opilane on 19.10.2016.
 */
public class Time {
    public static void main(String[] args) {
        int hour = 15;
        int minute = 12;
        int second = 10;
        System.out.print("The current time is ");
        System.out.println(hour + ":" + minute + ":" + second );
        int midnight;
        int fullday = 86400;
        int remaining;
        midnight = (hour * 60 * 60 )+ (minute * 60) + second; // päevas on 86400 sekundit
        remaining = fullday - midnight;
        System.out.println("seconds passed since midnight " + midnight);
        System.out.println("seconds remaining  " + remaining);
        System.out.print("Percent of the day that has passed: ");
        System.out.println(midnight * 100 / fullday);


    }

}
