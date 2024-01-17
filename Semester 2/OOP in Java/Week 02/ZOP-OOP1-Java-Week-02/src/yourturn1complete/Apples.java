package yourturn1complete;

import javax.swing.JOptionPane;

/**
 * @author Rich Smith
 */
public class Apples {

    public static void main(String[] args) {
        int numApples = 680;
        int numBaskets = numApples / 50;

        String output = "You will need " + numBaskets + " baskets.";

        int numApplesLeft = numApples - numBaskets * 50;
        output = output + "  You will have " + numApplesLeft + " apples left";
        System.out.println(output);
        JOptionPane.showMessageDialog(null, output); //a fancy way to print to a dialog box
    }
}
