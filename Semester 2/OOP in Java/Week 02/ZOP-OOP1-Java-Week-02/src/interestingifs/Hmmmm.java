package interestingifs;

public class Hmmmm {
    public static void main(String[] args)
    {
        //let's step through this with the debugger
        int num1 = 5;
        int num2 = 4;

        //This is a nested if...just follow the same rules and you will get the right answer
        if (num1 == 5) {
            if (num2 == 4) {
                System.out.println("Zoinks!");
            }
        }

        //this code does the exact same thing!
        if (num1 == 5 && num2 == 4) {
            System.out.println("Zoinks!");
        }

        // Let's try a hard one
        if (num1 == 5 && num2 != 4) {
            System.out.println("Zoinks");
        }
        else if (num1 + num2 == 9) {
            num1 = 10;
            if (true && !false && num1 == 5) {
                System.out.println("Yikes");
            }
            else {
                System.out.println("Ruhruoh");
            }
        }
        else {
            System.out.println("Narf!");
        }
        System.out.println(num1);

    }
}
