package yourturnforsupersmartypants;

import java.util.Random;

public class PartA {
    public static void main(String[] args)
    {
        //debug this program 5 times and guess what will print, based on the values of num1 and num2 which will be random.  If you get it right 3 times in a row, you are a smartypants!!!

        int num1 = new Random().nextInt(5); //don't worry about how these lines work.  We'll learn about it soon!
        int num2 = new Random().nextInt(5);

        int answer = (num1 > num2) ? method1(num1) : method2(num2);
        System.out.println(answer);

        if (answer != 9 && num1 + num2 > 5) {
            num1++;
        }
        else if (num2 == 3 || num1 == 3) {
            num1++;
        }
        else {
            {
                num2 += 2;
            }
        }
        answer += num1 + num2;
        System.out.println(answer);
    }

    public static int method1(int arg1)
    {
        return arg1 * 2;
    }

    public static int method2(int arg1)
    {
        return arg1 * 3;
    }
}
