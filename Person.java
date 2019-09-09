import java.awt.image.ShortLookupTable;

public class Person
{
    String name;
    int age;
    Person(String nm,int a)
    {
        name=nm;
        age=a;
    }
    public static void main(String[] args)
    {
        Person p=new Person("VAISHALI",21);
        int diff=100-p.age;
                System.out.println("Square of diff:"+(diff*diff));
    }
}
