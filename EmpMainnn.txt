public class EmpMain {

    public static void main(String s[])
    {
        Employee e = new Employee();
        e.setEmp_id(101);
        e.setName("Akanksha");
        e.setSalary(1000.0);
        e.setAge(55);
        System.out.println(e.getEmp_id());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
        System.out.println(e.getAge());
    }
}
