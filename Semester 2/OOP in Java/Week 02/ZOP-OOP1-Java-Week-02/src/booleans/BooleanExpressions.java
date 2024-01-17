package booleans;

public class BooleanExpressions {
  //step through, one line at a time, with the debugger

  public static void main(String[] args)
  {
    //Let's use the debugger - What prints?  Careful, a couple are tricky...
    int num1 = 6;
    System.out.println(num1);
    System.out.println("num1");
    System.out.println(num1 + 4 + "num1");
    System.out.println("num1" + num1 + 4);

    boolean myBoolean = true;
    System.out.println(myBoolean);

    System.out.println(num1 > 5); //<-- this is a boolean expression!  The JVM evaluates this expression and returns either a true or a false

    System.out.println(num1 < 5);

    System.out.println(num1 == 6); //<-- this is how we ask if two things are equal - Why do you suppose we can't use a single = sign?  Let's find out!
    System.out.println(num1 == 4);

    boolean num1GreaterThan5 = (num1 > 5); // <--   we can also place the result of a boolean expression into a boolean variable for safe keeping
    System.out.println(num1GreaterThan5);

    num1--;
    num1GreaterThan5 = (num1 > 5); //<-- asking the same questions here but now, num1 is 5 and 5 is NOT greater than 5!  The JVM returns false
    System.out.println(num1GreaterThan5);

    // ⁡⁢⁣⁢hmm...what if we want to know if one number is equal to OR greater? ⁡ We don't have that funny greater than or equal to symbol on our keyboard..

    System.out.println(6 >= 6);
    System.out.println(6 >= 5);
    System.out.println(6 >= 7);

    System.out.println(6 <= 6);
    System.out.println(6 <= 5);
    System.out.println(6 <= 7);

    //What if I just want to know if two numbers are not equal?

    //Introducing NOT! The symbol for NOT is quite exciting!  It is !

    myBoolean = true;
    System.out.println(myBoolean);
    System.out.println(!myBoolean);
    System.out.println(!!myBoolean);
    System.out.println(!!!!!!!!!!!!!!!!!!!!!!!myBoolean);

    //we can also assign the new value back into the variable:
    myBoolean = !myBoolean;
    System.out.println(myBoolean);

    //we can also use not when testing if things are NOT equal

    System.out.println(5 == 5);
    System.out.println(5 != 5);
  }
}
