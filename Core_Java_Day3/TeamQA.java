public class TeamQA {
    String name;
    int age;
    String gender;
    String designation;
    String project_name;

    public void trainee(String n, int a, String g, String d, String pn)
    {
        name = n;
        age = a;
        gender = g;
        designation = d;
        project_name = pn;
        System.out.println("employee_name : "+n);
        System.out.println("employee_age : "+a);
        System.out.println("employee_gender :" +g);
        System.out.println("employee_designation : "+d);
        System.out.println("project_name :"+pn);
    }
}
class Bob{
            public static void main(String[] args)
        {
        TeamQA employee = new TeamQA();
        employee.trainee("vaishali",21,"Female","QA_Trainee","training");
        }

        }
