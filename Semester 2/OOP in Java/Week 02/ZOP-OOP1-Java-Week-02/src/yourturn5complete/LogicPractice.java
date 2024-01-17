package yourturn5complete;

import java.util.Random;

public class LogicPractice {
    public static void main(String[] args)
    {
        Random rnd = new Random();

        double priceOfCake = rnd.nextDouble() * 10;
        boolean isVIPMember = rnd.nextBoolean();
        int numCakesPurchased = rnd.nextInt(10) + 1;

        //Write the code to figure out what to charge the customer, based on the following:

        //1. If the customer purchases <3 cakes, the customer pays full price 
        //2. If the customer purchases between 3 and 5 (inclusive) cakes, we give them 5% off of their purchase
        //3. If the customer purchases 6 or more cakes, they get 10% off of all cakes.
        //4. Print out the subtotal of what the customer owes and why
        //5. If the customer is a VIPMember, take 15% off the entire order and print out why.  If not, just print out the cost of the entire order and remind the customer that they could have gotten 15% off if they were a VIPMember
        //6. run it through the debugger a few times and guess what's going to happen next!

        double orderTotal = priceOfCake * numCakesPurchased;
        System.out.println("Cost of " + numCakesPurchased + " cakes: $" + orderTotal);
        if (numCakesPurchased > 2 && numCakesPurchased < 6) {
            orderTotal = orderTotal * .95;
            System.out.println("less 5% discount: $" + orderTotal);
        }
        else if (numCakesPurchased > 5) {
            orderTotal = orderTotal * .90;
            System.out.println("less 10% discount: $" + orderTotal);
        }
        if (isVIPMember) {
            orderTotal = orderTotal * .85;
            System.out.println("Applying VIP Discount!");
        }
        else {
            {
                System.out.println(" Note that you could have saved 15% if you were a VIP Member");
            }
        }
        System.out.println("Total cost: $" + orderTotal);
    }
}
