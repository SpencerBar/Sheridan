package yourturn3complete;

public class MyRectangle {
    public static void main(String[] args) {
        int width = 5;
        int length = 6;

        int area = length * width;
        System.out.println(area);

        //Part B
        String output = "The area of the rectangle with a width of " + width + " cm and a length of " + length
                + " cm is " + area + " square cm";
        System.out.println(output);
    }
}
