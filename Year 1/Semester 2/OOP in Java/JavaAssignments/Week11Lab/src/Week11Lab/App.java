package Week11Lab;
import java.util.function.BinaryOperator;



public class App {
    public static void main(String[] args) throws Exception {
    BinaryOperator<Integer> add = (numb1, numb2) -> numb1 + numb2;
    BinaryOperator<Integer> sub = (numb1, numb2) -> numb1 - numb2;
    BinaryOperator<Integer> div = (numb1, numb2) -> numb1 / numb2;
    BinaryOperator<Integer> mult = (numb1, numb2) -> numb1 * numb2;


    
    int num1 = Scan.scanNum();
    int num2 = Scan.scanNum();
    

    while (true){
    System.out.println("Enter +, -, *, /"); 
    String operation = Scan.scanOp();
    
    if(operation.equals("+")){
        System.out.println(add.apply(num1,num2));
        break;
    }
    if(operation.equals("-")){
        System.out.println(sub.apply(num1,num2));
        break;
    }
    if(operation.equals("*")){
        System.out.println(mult.apply(num1,num2));
        break;
    }
    if(operation.equals("/")){
        if(num2 ==0){
            System.out.println("You've tried to divide by 0, try again.");
            break;
        }
        else{
        System.out.println(div.apply(num1,num2));
        break;
        }
    }  
    }
    }
}

