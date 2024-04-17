public class App {
    public static void main(String[] args) throws Exception
    {
        Student s1 = new Student("Bart", 60);
        Student s2 = new Student("Lisa", 90);
        s1.setGpa(62);
        System.out.println(s1.getStudentNum());
        System.out.println(s2.getStudentNum());
    }
}
