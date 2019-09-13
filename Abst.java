abstract class Calculate
{

    abstract void area();

}
class Rectangle extends Calculate
{
    void area()
    {
        int length=10;
        int  breadth=20;
        int area= length*breadth;
        System.out.println("Area" +area);
    }
}
class Square extends Calculate
{
    int a=10;
    int sq= a*a;
    void area(){
        System.out.println("Square"+sq);

    }

}



class Abst {
    public static void main(String s[])
    {
        Calculate c = new Rectangle();
        c.area();
        Calculate b = new Square();
        b.area();
    }



}
