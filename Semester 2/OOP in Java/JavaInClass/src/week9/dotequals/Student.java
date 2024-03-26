package dotequals;

public class Student {
    private String name;
    private int studentNumber;

    public Student(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber()
    {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber)
    {
        this.studentNumber = studentNumber;
    }

    public String getName()
    {
        return name;
    }
    public void compareObjects(Object o2)
    {
        if(this.equals(o2))
        {
         if (this.hashCode() == o2.hashCode())
        {
            System.out.println("Objects are equal");
        }   
        }
        else
        {
            System.out.println("Objects are not equal");
        }
    }
           
    
  
    @Override
    public boolean equals(Object object)
    {
        Student otherStudent = ((Student) object);
        
        return this.studentNumber == ((Student) object).getStudentNumber() && this.getName() == otherStudent.getName();
    
    }
  
    @Override
    public int hashCode()
    {
        int total = 0;
        for(int i =0; i< this.name.length(); i++)
        {
           total += (int) this.name.charAt(i) * (i +1);
        }
        return (9934/this.getStudentNumber()+total * 993456);
    }
}
