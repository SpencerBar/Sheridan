package breakcontinue;

public class Start {
    public static void main(String[] args)
    {
        System.out.println("Print out 0 through 9");

        /*  Hint:
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
        */

        System.out.println("\nHmmm...what if we want to not print out 5?");

        /* Hint:
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + ", ");
        }
         */

        System.out.println("\nHmmm...what if we want to stop printing after 5?");

        /* Hint
        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.print(i + ", ");
        }
         */

        //So, continue jumps immediately to the boolean condition, break jumps immediately to the line after the end of the loop

        //hmmm...just something to think about.  return will exit the entire method!  We'll learn more about it later
        // System.out.println("Exiting the entire method!");
        // for (int i = 0; i < 10; i++) {
        //     if (i == 6) {
        //         return;
        //     }
        //     System.out.print(i + ", ");
        // }
    }
}
