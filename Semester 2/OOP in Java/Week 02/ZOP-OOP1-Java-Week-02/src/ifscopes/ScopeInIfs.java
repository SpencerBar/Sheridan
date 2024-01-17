package ifscopes;

public class ScopeInIfs {

  public static void main(String[] args)
  {
    int num1 = 7;
    int num2 = 8;

    if (num1 > num2) {
      System.out.println(num1);
      int abc = 100;
      System.out.println(abc);
    }
    else if (num1 < num2) {
      System.out.println(num1);
      System.out.println(abc);
    }
    else {
      System.out.println(num1);
      System.out.println(abc);
    }
    System.out.println(num1);
    System.out.println(abc);

    // ⁡⁢⁣⁢hmmmm...what have we learned? ⁡
    /* ⁡⁢⁢⁢Answer:⁡
      Variables only have scope (only exist) in the code block they were declared in.
    
      Since num1 and num2 were declared at the main method code block level, they have scope (exist) in all parts of the main method
    
      However, since abc was declared inside the first codeblock of the if statement, it only has scope in that codeblock.
      
      Variables exist within the code block they were declared in (including any code block's inside of that code block)
    */

  }
}
