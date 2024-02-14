package yourturn1;
import java.util.Random;
public class Start {
    public static void main(String[] args)
    {
        //⁡⁢⁣⁢Part A
        
        int[] intArray = new int[10];
        //Make an array of ints that can hold 10 ints
        for (int i : intArray){
            System.out.println(i);
        }
        
        intArray[2] = 7;
        // make the int at floor 3 equal to your favourite number

        //loop through and print out your array again!
        for (int i : intArray){
            System.out.println(i);
        }

        //Now, use a loop and the Random class to make each int in the array a random int from 0 to 9  (Hint: Remember that the Random class has a method called nextInt that will return a random int from 0 to what ever int you pass into it)
        for (int i= 0;i <intArray.length;i++){
            Random rand = new Random();
            int randomNum = rand.nextInt(0,10);
            intArray[i] = randomNum;
        }
        //now print out your array again
        for (int i : intArray){
            System.out.println(i);
        }
        //Next, write code to print out the largest int in the array every time
        int largest = intArray[0];
        for (int i : intArray){
            if (largest<i){
                largest = i;
            }   
        }
        System.out.println(largest);
        //Now, ask yourself if your solution would have worked if all of the ints were negative
        //should yes
        //write code to figure out the average of the array of ints
        int total = 0;
        for (int i : intArray){
            total += i;
        }
        double average = total / intArray.length;
        System.out.println(average);
        //open the Learing Arrays class and follow the directions

        //⁡⁢⁣⁢Part B⁡

        //Make a String array that holds your favourite 5 movies, using the shortcut { } to insert them right into the array!

        //Print out all of your favourite movies using a loop

        //Print out all of your favourite movies backwards (using a loop)

        //for the super-smarty pants only:  print out your favourite movies (using a loop) in the following order:   1st in list, last in list, 2nd in list 2nd from last in the list, middle of the list

        // ⁡⁢⁣⁢Part C⁡ - go to the LearningArrays Class and follow the instructions there

    }
}
