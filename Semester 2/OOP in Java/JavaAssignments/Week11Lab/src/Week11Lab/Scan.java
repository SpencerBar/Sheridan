package Week11Lab;
import java.util.Scanner;


public class  Scan {
    public static int scanNum(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    int num1 = scan.nextInt();
    scan.close();
    return num1;
    }
    public static String scanOp(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter +, -, *, /");
        String oper = scan.nextLine();
        scan.close();
        return oper; 
    }
}
