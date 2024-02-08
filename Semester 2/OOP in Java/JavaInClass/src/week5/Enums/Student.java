package Enums;

public class Student {
private String name;

public String getName()
{
return name;
}

public void setName(String name)
{
this.name = name;
}

public void study()
{
System.out.println(name + " is studying");
}

//let's overload study to study a particular subject
public void study(String sub)
{
System.out.println(name + " is studying "+ sub);
}
//let's further overload study so we can also choose how many hours to study
public void study(String sub, int hours)
{
System.out.println(name + " is studying " + sub + " for " + hours+ " hours");
}
public void study(String sub1,String sub2)
{
System.out.println(name + " is studying " + sub1 + " and " + sub2);
}

}