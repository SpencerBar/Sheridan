package dotequals;

import java.util.Arrays;

public class Start {
    public static void main(String[] args)
    {

        Student s1 = new Student("Bart", 1);
        Student s2 = new Student("Bart", 1);

        System.out.println(s1 == s2); 

        System.out.println(s1.equals(s2));

        Student s3 = new Student("Lisa", 5);
        Student s4 = new Student("Millhouse", 4);
        
        s1.compareObjects(s2);
        s3.compareObjects(s4);
    
        
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

    }
}
