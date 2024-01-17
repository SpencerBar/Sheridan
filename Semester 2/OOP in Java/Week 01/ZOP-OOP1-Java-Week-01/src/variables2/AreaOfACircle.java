package variables2;

/*⁡⁢⁣⁢READ ME ->⁡
 * 
 * Did you know that if you divide the circumference of a pumkin by it's diameter, you get Pumkin PI ?!!!!!!
 */

public class AreaOfACircle {
   public static void main(String[] args)
   {
      double radius = 10, area;
      area = Math.PI * Math.pow(radius,2);
      System.out.println("The area of the circule with a radius of " + radius + " is " + area);
      // The formula to calculate the area of a circle is PI *r *r   -- we would like to figure out the area of a circle with a radius of 10.  Let's use good variable names and print out our answer in a user-friendly fashion

   }
}
