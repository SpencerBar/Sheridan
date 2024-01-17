package yourturnforsupersmartypants;

import java.util.Random;

public class PartB {
    public static void main(String[] args)
    {
        //create an int variable called myInt and assign it a random value by calling the getRandomNumber method that I have written for you.
        //Determine if the value of myInt is even or odd.  There are at least three ways to do this.  Can you think of one?

        int myInt = getRandomNumber();
        System.out.println(myInt);

        if ((double) myInt / 2 == myInt / 2) {
            System.out.println("Even!");
        }
        else {
            {
                System.out.println("Odd!");
            }
        }

        //or:

        System.out.println(((double) myInt / 2 == myInt / 2) ? "Even" : "Odd");

        //or

        System.out.println((myInt % 2 == 0) ? "Even" : "Odd");

    }

    public static int getRandomNumber()
    {
        return new Random().nextInt(10) + 1;
    }
}
