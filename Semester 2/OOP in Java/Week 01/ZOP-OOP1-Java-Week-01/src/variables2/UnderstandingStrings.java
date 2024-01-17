package variables2;

//walk through with the debugger -this time, we will add our own breakpoint at line 9 

public class UnderstandingStrings {

    public static void main(String[] args)
    {
        int length = 20;
        int width = 10;

        int areaOfRectangle = length * width;
        System.out.println(areaOfRectangle);

        System.out.println("areaOfRectangle");

        System.out.println("The area of the rectangle is " + areaOfRectangle); //when we use a plus sign with ints, java does math.  However, when we introduce a String (of characters), Java doesn't perform math, it performs 'concatenation'.   Contactenation just means that we will treat everything as if it is a String of characters and, wherever we see a plus sign, we will join those strings of characters together.

        String message ="Hi" + " " + "there " + (45 + 99);
        System.out.println(message); //notice that, as soon as Java encountered the first String ("Hi"), it treated everything that came after it as String as well.  No more math.

        String output = "The area of the recatangle with length of " + length + " and width of " + width + " is " + areaOfRectangle;
        System.out.println(output);

        /*
         * Huh?  What do you notice about the String type that is dIfFeRenT?
         * 
         * Correct! The String type starts with a capital.  This is significant
         * Let's continue below:
         * 
         */

        length = 50;
        length = 100;
        length = 2147483647;
        //long len = 2147483647353L;
        
        System.out.println(length); //as we change the value of our int, does it take any more bits to store it in memory?

        //No, we can store any int in those 32 bits -> from -2147483648 to 2147483647.  The storage requirements for any primitive variable does not change, regardless of the value stored in it.  Remember that we know a variable is primitive because its type starts with a lower case -> int, double, boolean, char etc

        //However, let's look at this one:

        String myString = "acb";
        myString = "abcdef";
        myString = "abcdefghijklmnopqrstuvwxyz";
        System.err.println(myString);
        //Java requires 16 bits to store each character.  So, as the length of the String changes, number of bits of memory required change too.  Huh.  But I guess this is ok because, looking at the String type, it does NOT start with a lower case letter.  String starts with a Capital!  This means that String is not a primitive.  This will beome IMPORTANT soon!

    }
}