package shortcutifs;

public class ShortcutIfs {
    public static void main(String[] args)
    {
        double num1 = 4.5;
        double num2 = 7;
        String output = "";

        if (num1 + num2 > 10) {
            output = "Zoinks";
        }
        else {
            output = "Narf!";
        }
        System.out.println(output);

        // String output2 = "";
        // output2 = (num1 + num2 > 10) ? "Zoinks!" : "Narf";  //this is exactly the same as the code above!
        // System.out.println(output2);

        //we could even go one step further and eliminate the variable
        // System.out.println((num1 + num2 > 10) ? "Zoinks" : "Narf");
    }
}
