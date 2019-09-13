public class Employee {

    private int emp_id;
    private String name;
    private double salary;
    private int age;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>18 && age<60) {
            this.age = age;
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }





}
