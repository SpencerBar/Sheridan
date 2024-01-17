package yourturn1complete;

/**
 * @author Rich Smith
 */
public class SecondsInAYear {
    public static void main(String[] args) {
        int numDays = 365;
        int numHours = numDays * 24;
        int numMinutes = numHours * 60;
        int numSeconds = numMinutes * 60;

        String output = "There are " + numSeconds + " seconds in a year";
        System.out.println(output);
    }
}
