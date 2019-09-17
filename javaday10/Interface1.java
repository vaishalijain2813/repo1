interface test{
     int a = 10;

    void display();
}


class Interface1 implements test
{

    public void display()
    {
        System.out.println("vaishali");
    }


    public static void main (String[] args)
    {
        Interface1 t = new Interface1();
        t.display();
       // a=10;
        System.out.println(a);
    }
}