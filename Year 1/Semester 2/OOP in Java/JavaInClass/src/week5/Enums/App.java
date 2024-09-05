package Enums;
public class App {
public static void main(String[] args) throws Exception {
        
    String string = "123456789";
    System.out.println(string.substring(5));
    System.out.println(string.substring(5,7));

    Student s1 = new Student();
    s1.setName("Ronnie");
    // three overloads of study with different inputs
    s1.study();

    s1.study("Java");

    s1.study("Python", 5);

    // call coin enum and get the value it was constructed with
    System.out.println(Coin.NICKEL);
    System.out.println(Coin.NICKEL.getValue());

    // make an object of enum type coin
    Coin cn = Coin.NICKEL;
    System.out.println(cn);
    System.out.println(cn.getValue());

}
}


