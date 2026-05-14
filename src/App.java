public class App {
    public static void main(String[] args) {
        // Test 1: A normal afternoon clock at 3:45 PM
        DigitalClock clock1 = new DigitalClock(3, 45, true);
        System.out.println(clock1);

        // Test 2: Crossing noon (AM -> PM)
        // Starts at 11:58 AM, ticks 5 times -> should be 12:03 PM
        DigitalClock clock2 = new DigitalClock(11, 58, false);
        for (int i = 0; i < 5; i++) {
            clock2.tick();
        }
        System.out.println(clock2);

        // Test 3: Crossing midnight (PM -> AM)
        // Starts at 11:58 PM, ticks 5 times -> should be 12:03 AM
        DigitalClock clock3 = new DigitalClock(11, 58, true);
        for (int i = 0; i < 5; i++) {
            clock3.tick();
        }
        System.out.println(clock3);

        // Test 4: 12:59 PM -> 1:00 PM (NO AM/PM swap on 12 -> 1)
        DigitalClock clock4 = new DigitalClock(12, 59, true);
        clock4.tick();
        System.out.println(clock4);

        // Test 5: Defensive constructor with too-large values
        // hours 15 -> 12, minutes 75 -> 59
        DigitalClock clock5 = new DigitalClock(15, 75, false);
        System.out.println(clock5);

        // Test 6: Defensive constructor with negative values
        // hours -3 -> 1, minutes -10 -> 0
        DigitalClock clock6 = new DigitalClock(-3, -10, true);
        System.out.println(clock6);

        // Test 7: Minute padding -- single-digit minutes display as "05" not "5"
        DigitalClock clock7 = new DigitalClock(7, 5, false);
        System.out.println(clock7);

        // Test 8: 24-hour format conversions
        DigitalClock noon = new DigitalClock(12, 0, true);
        DigitalClock midnight = new DigitalClock(12, 0, false);
        DigitalClock fivePM = new DigitalClock(5, 0, true);
        DigitalClock sevenAM = new DigitalClock(7, 0, false);
        System.out.println("Noon in 24-hr: " + noon.getHoursIn24Format());
        System.out.println("Midnight in 24-hr: " + midnight.getHoursIn24Format());
        System.out.println("5 PM in 24-hr: " + fivePM.getHoursIn24Format());
        System.out.println("7 AM in 24-hr: " + sevenAM.getHoursIn24Format());
    }
}
