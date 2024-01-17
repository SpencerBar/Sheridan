package sentinel;

import java.util.Random;

public class Sentinel {
    public static void main(String[] args) {
        Random rnd = new Random(); //don't worry about this - we will learn about it soon!!!
        System.out.println(rnd.nextInt(100));

        // We would like to write a loop that will keep looping, picking a random number between 1-100 each time and that will keep looping until that random number is a 7.  Then we want to print out how many times it took to get a 7

        /*  Hint: 
        int count = 0;
        while (rnd.nextInt(100) != 7) {
            count++;
        }
        System.out.println("It took " + count + " tries to get a 7");
         */

    }

}
