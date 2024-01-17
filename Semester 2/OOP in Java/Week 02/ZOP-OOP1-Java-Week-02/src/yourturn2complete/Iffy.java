package yourturn2complete;

import java.util.Random;

public class Iffy {

  public static void main(String[] args)
  {
    //don't worry about these three lines of code...we will learn about Random numbers soon!
    Random rnd = new Random();
    int num1 = rnd.nextInt(5);
    int num2 = rnd.nextInt(5);

    System.out.println("The first number is " + num1);
    System.out.println("The second number is " + num2);

    //⁡⁢⁣⁢ Part A:⁡  write an if statement  (below) so that, if num1 is greater than num2, it will print the first number is larger than the second number.  If it is not greater, don't print anything

    // ⁡⁢⁣⁢Part B:⁡  change your code from PARTA so that you can use an if/else statement that will print either "the first number is larger" or "the first number is not larger"

    // ⁡⁢⁣⁢Part C: ⁡ further change your code so that the output will be 1 of three statemtents, based on the values of num1 and num2:
    //     --The first number is larger
    //     --The second number is larger
    //     --The two numbers are the same!

    if (num1 > num2) {
      System.out.println("The first number is larger!");
    }
    else if (num1 < num2) {
      System.out.println("The first second number is larger!");
    }
    else {
      {
        System.out.println("The numbers are equal!");
      }
    }

  }
}
