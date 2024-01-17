package yourturn1complete;

public class HowLongToEarth {

   public static void main(String[] args)
   {
      double solMetersPerSecond = 299792458; //speed of light in meters per second
      double solKMPerSecond = solMetersPerSecond / 1000; //speed of light in km per second
      double solKmMinute = solKMPerSecond * 60; //speed of light in km per minute
      double distanceToEarth = 150000000; //distance to Earth in km

      double timeToEarth = distanceToEarth / solKmMinute;
      System.out.println("It takes " + timeToEarth + " minutes for light to reach the Earth from the Sun!"); // how could I have done this better???
   }
}
