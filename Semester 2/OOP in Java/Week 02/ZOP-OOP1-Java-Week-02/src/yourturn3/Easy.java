package yourturn3;

import java.util.Random;

public class Easy {

  /*⁡⁣⁢⁢ Read Me!⁡
    Use the debugger to pause at line 16 (put a breakpoint on the line with the comment) Now, notice the values that the three local int variables are assigned and try to guess what the program will print out.  Next, step through with the debugger to see if you were right.  
  
    Well done!  Now, keep doing it until you guess correctly 3 times in a row!
    
    */

  public static void main(String[] args)
  {

    //Add a breakpoint to the line indicated below. Next, step through the program with the debugger - guess what is going to happen next at each step.  When you have completed one run, run it a few more times...every time will be different!

    Random rnd = new Random(); //we will learn about this code soon---Promise!
    int num1 = rnd.nextInt(5); //add a breakpoint  here!  
    int num2 = rnd.nextInt(5);
    int num3 = rnd.nextInt(5);

    if (num1 > num2) {
      System.out.println("Zoinks!");
    }
    else if (num1 > num3) {
      System.out.println("Narf!");
    }
    else {
      System.out.println("Yikes!");
      if (num1 == 2 || num2 == 2 || num3 == 2) {
        System.out.println("Wow!");
      }
    }
    System.out.println("Yay!");
  }
}
