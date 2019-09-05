public class QAref
{
    String name;
    int age;
    String gender;
    String designation;
    String project_name;
    public void perform()
    {
        System.out.println("employee_name : "+name);
        System.out.println("employee_age : "+gender);
        System.out.println("employee_gender :" +gender);
        System.out.println("employee_designation : "+designation);
        System.out.println("project_name :"+project_name);
    }
    public static void main(String[] args)
    {
        QAref ob1=new QAref();
        ob1.name="vaishali";
        ob1.age=21;
        ob1.gender="Female";
        ob1.designation="Quality_Analyst_Trainee";
        ob1.project_name="Training";
        ob1.perform();
    }

}
