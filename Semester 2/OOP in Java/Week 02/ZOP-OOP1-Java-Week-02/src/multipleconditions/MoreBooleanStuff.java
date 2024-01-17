package multipleconditions;

public class MoreBooleanStuff {

  public static void main(String[] args)
  {
    int num1 = 5;
    int num2 = 7;
    int num3 = 2;

    System.out.println(num1 == num2);
    System.out.println(num1 != num2);

    //what if I want to evaluate a bunch of stuff?  For example, if you are right-handed AND you have brown eyes, stand up!

    //What if I want to know if num1 is less than num2 and num1 not equal to num3?

    //  The AND operator to the resque!  Java uses && to represent AND.  Anywhere you see &&, you can replace that with the word AND in your brain.

    System.out.println();
    System.out.println(num1 < num2);
    System.out.println(num1 != num2);

    System.out.println(num1 < num2 && num1 != num3); //<--with this && (and), we now have 2 boolean expresssions, one on each side of the &&.  Both of those expressions must be true in order for the JVM to return true.

    num3 = 5;
    System.out.println(num1 < num2 && num1 != num3); //<-- notice that num1 is still less than num2 (true) but num1 is equal to num3 so that side will be false.  true&&false = false;

    System.out.println("\n    AND  && Table");
    System.out.println("true && true -> " + (true && true));
    System.out.println("true && false -> " + (true && false));
    System.out.println("false && true -> " + (false && true));
    System.out.println("false && false -> " + (false && false));

    //same thing holds true for OR -- we use || to represent OR in Java

    System.out.println("\n     OR  || Table");
    System.out.println("true || true -> " + (true || true));
    System.out.println("true || false -> " + (true || false));
    System.out.println("false || true -> " + (false || true));
    System.out.println("false || false -> " + (false || false));

    //let's try some with the debugger!

    System.out.println(num1 > num2 || num1 == 5); //once we hit the breakpoint, we can highlight boolean expressions, right click, and have VS code evaluate those expressions for us!

    //We can also build our own watch expressions - let's do it now!
    num1 = 4;

    System.out.println(num1 > num2 || num1 == 5);
  }
}
