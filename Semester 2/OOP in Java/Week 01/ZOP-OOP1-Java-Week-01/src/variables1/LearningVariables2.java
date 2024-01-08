package variables1;

//walk through with the debugger

public class LearningVariables2 {
    public static void main(String[] args)
    {

        //ok, you guys are so smart...riddle me this:
        int num1 = 1;
        int num2 = num1;
        //what will print below and why?
        num1 += num2;
        System.out.println(num1);
        num2 += num1;
        System.out.println(num2);

        //but what about this???

        num1 = num2++;
        System.out.println(num1);
        System.out.println(num2);

        //oh, but what about this???

        num1 = ++num2;
        System.out.println(num1);
        System.out.println(num2);

        /* It turns out that putting the ++ BEFORE the variable name (we call this prepending), the variable will be incremented BEFORE the expression is evaluated.  Putting the ++ AFTER the variable name will evaluate the expression and THEN increment the varaible.   Confused?  I know I certainly find prepending to be needlessly confusing when reading code so I never do it.  However, it is valid and you should at least understand what is happening. */

        /*Just like writing a book, everyone has their own style when they code.  Your style will evolve and develop over your career.  I still make changes to the way I do things and I'm old as dirt!  If I can give you one piece of advice about style, it would be to base your style choices on writing the cleanest, most readable code possible.  Programmers that write clean, easily maintainable code get hired faster, make more money, and get promoted */

        boolean myBoolean = true;
        System.out.println(myBoolean); // what other value do you think myBoolean might have?

        //Once you've run this program, go ahead and uncomment the line below (get rid of the //)
        //int num3 = 4.5; //uh oh!  Type mismatch???  Turns out that you can't store a decimal number in an int.  Go ahead and change the 'int' to 'double' - That will fix things up

        //System.out.println(num3);
    }
}
