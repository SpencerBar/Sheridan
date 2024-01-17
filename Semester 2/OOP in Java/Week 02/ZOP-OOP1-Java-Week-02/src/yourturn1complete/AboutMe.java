package yourturn1complete;

/* ⁡⁢⁣⁢Read Me!!!⁡
    When we debug this, notice that the windows to the left show the entire stack (Call Stack) and the contents of the current stack frame (Variables)

    All local variables will show up in the Variables window (the current stack frame)
    
    Notice that we can even manually change the value of a variable, while the program is running!

    Notice that our primitives store values (80, 29200), but our String has all sorts of extra stuff (click to open up the name variable)

    Let's set a breakpoint in the first line of the method and step through our code with the debugger

 */

public class AboutMe {
    public static void main(String[] args)
    {
        int age = 80;
        String name = "Rich";
        int numDays = age * 365;

        String output = "Hello!  My name is " + name;
        output = output + ".  I am " + age + " years old.\n";
        output = output + "That is " + numDays + " days!";
        System.out.println(output);
    }
}
