package yourturn4complete;

public class Start {
    public static void main(String[] args)
    {
        //Write a loop that will print out 0 -> 9:   0,1,2,3,4,5,6,7,8,9,
        for (int i = 0; i < 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println();

        //Write a loop that will print out 10-->1:   10,9,8,7,6,5,4,3,2,1,
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }
        System.out.println();
        //write a loop that will print out 2,4,6,8
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i + ", ");
        }
        System.out.println();
        //write nested loops that will print out:
        //          000
        //          111
        //          222
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(row);
            }
            System.out.println();
        }
        System.out.println();

        //write nested loops that will print out:
        //          012
        //          012
        //          012
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
        System.out.println();
    }
}
