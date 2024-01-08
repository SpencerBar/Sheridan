package variables1;

public class LearningVariables1 {
   public static void main(String[] args)
   {

      /*  ⁡⁣⁡⁢⁣⁢<-⁡ ⁡⁢⁣⁢Click on the little arrow to the right of the line number ⁡!⁡
      
        This is a comment!  Comments are ignored by the compiler and are areas where we can write notes to ourselves.  In java, there are two kinds of comments.  There is a mult-line comments like this one that we contain using a / followed by a * at the beginning and a * followed by a / at the end.  These comments can span multiple line breaks
       
        If you have set VSCode up as recommended in this course, these multi-line comments will always be collapsed when you open your files.  ⁡⁢⁣⁢Just click on the arrow to expand them!⁡
       */

      // This is also a comment in Java.  This is known as a single-line comment.  Any letters after the // are considered comments until the line break

      // Here's a useful trick.  We can use <CTRL /> to toggle a single-line comment on and off.  Try it on this line.  If you press <CTRL />VSCode will remove the // at the beginning and if you press <CTRL /> again, it will toggle it back into a comment.

      //Let's use the debugger to freeze our program at line 20 and step through it together.  We'll learn more about the Debugger soon!   For now, think of the debugger as a combination freeze ray and X-Ray machine!  J⁡ust click on the Debug word right under our class header⁡

      int myFirstVariable = 3; //this line is declaring our very first variable!  This is an int variable called num1 that contains 3 --   We say that 'int' is the type, 'num1' is the variable name, and '3' is the value contained within the variable --Notice the little red dot to the left of the line number - This is called a breakpoint and tells the debugger to freeze our program.  If everything is going to plan, this line should now be highlighted in yellow - this yellow bar tells us that the program is currently frozen on this line.  You should also notice a small, floating toolbar has appeared at the top.  We can move to the next line of our code by clicking on the down arrow in this toolbar.  Go ahead and try it!  Every time you click the down arrow, the JVM will execute the next line of code!

      //Notice that, before we can use a variable, we must say what kind of variable it is (in this case, int).  This is known as declaring a variable.  If we place our cursor over the variable name (myFirstVariable), the debugger will tell us what its current value is (3)

      System.out.println(myFirstVariable); // What do you suppose will print?   Notice that we can hover our cursor over the variable name and get its value

      System.out.println("myFirstVariable"); // What do you think this line will print?  --- Anything in contained within " " prints out literally what is in the quotes.  We actually call this String Literals!  So num1 is the variable that contains the value 3 and "num1" is literally the string of characters: num1.  We call this a String literal containing "num1"   

      myFirstVariable = 2;
      System.out.println(myFirstVariable); //what happened here?  We can replace the values inside of our variables.  The original 3 is gone and has been replaced with 2

      myFirstVariable = myFirstVariable + 4;
      System.out.println(myFirstVariable); //we can also perform math operations

      myFirstVariable = myFirstVariable + 1;
      System.out.println(myFirstVariable); // here, we are adding 1 to num1

      myFirstVariable++; //this is another way to tell java to add 1 to a variable.  think of it as a bit of a shortcut.
      System.out.println(myFirstVariable);

      myFirstVariable--; //by the way, we can deduct 1 from num1 the same way
      System.out.println(myFirstVariable);

      myFirstVariable += 3; //hmmm what do you suppose this will do?
      System.out.println(myFirstVariable); //it adds 3 to num1;

      // We can have many variables and we can have them interact:

      int mySecondVariable = 4; //notice that, before we could use num2, we had to declare its type.  We would say that we are "declaring a variable of type int, called mySecondVariable and assigning it a value 0f 4"

      System.out.println(mySecondVariable);

      mySecondVariable = myFirstVariable; //here, we are taking the value that was in num1 and putting it into the num2 variable
      System.out.println(myFirstVariable);
      System.out.println(mySecondVariable);

      //let's try some stuff together!
   }
}
