package variables2;

/* ⁡⁣⁢⁢Read Me!  ->⁡
 * 
 * Debug the code, one line at a time
 */

public class StringStuff {
   public static void main(String[] args)
   {
      int a = 19;
      double b = 5.5;
      String myString = "Try to take over the world, Pinky";
      System.out.println(a);
      System.out.println(myString.toLowerCase());
      System.out.println(myString.contains("Brain"));

      System.out.println(a + myString);
      System.out.println(myString + b);

      String concatenatedString = a + myString + b;
      System.out.println(concatenatedString);

      String string2 = myString + a + b;
      System.out.println(string2);

      // int sum = a + b; //Why can't we do this?  How could we fix it?

   }
}
