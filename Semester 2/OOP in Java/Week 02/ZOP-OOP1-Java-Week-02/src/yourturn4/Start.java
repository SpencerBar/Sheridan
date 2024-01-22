package yourturn4;

public class Start {
    public static void main(String[] args)
    {
        //Write a loop that will print out 0 -> 9:   0,1,2,3,4,5,6,7,8,9,
        for (int i = 0; i <=9; i++){
            System.out.println(i);
        }

        //Write a loop that will print out 10-->1:   10,9,8,7,6,5,4,3,2,1,

        for (int i = 10; i <=0; i--){
            System.out.println(i);
        }
        //write a loop that will print out 2,4,6,8
        for (int i = 0; i <=8; i +=2) {
            System.out.println(i);
        }
        //write nested loops that will print out:
        //          000
        //          111
        //          222
        int j = 0;
        do{System.out.println(j);}while(j<=2);
        //write nested loops that will print out:
        //          123
        //          123
        //          123

    }
}
