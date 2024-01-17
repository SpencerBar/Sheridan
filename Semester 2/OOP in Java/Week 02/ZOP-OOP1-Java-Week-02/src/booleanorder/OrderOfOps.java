package booleanorder;

public class OrderOfOps {

  public static void main(String[] args)
  {
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(true && !false); //<--aha!  Order of operations (BNAO) makes a difference

    //how about...
    System.out.println(!(true && !false));

    System.out.println(true && false || true);
    System.out.println(true && false || false);

    //OK, you guys are so smart...try to figure out what will print in each of these:

    System.out.println("What prints???");
    System.out.println(true || false && true);
    System.out.println(!(true || false) && true);
    System.out.println((true || false) || !true);
    System.out.println(false || false || false && true);
    System.out.println(!(!true || false) && !false && true);
    //ok, you get the idea.

    System.out.println("What prints?");
    int num1 = 7;
    int num2 = 10;

    System.out.println(num1 > num2 || num1 + num2 == 17);
    System.out.println(num1 > num2 || !(num1 + num2 == 17));
    System.out.println(num1 > num2 && num1 + num2 != 17);
    System.out.println(!(num1 > num2) && num1 + num2 == 17);

  }
}
