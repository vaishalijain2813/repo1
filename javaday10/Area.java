interface Rectangle
{
    void areaRect();
}
interface Square
{
    void area();
}
class Area implements Rectangle,Square{
    public void areaRect() {
        int length=10;
        int breadth=20;
        int area=length*breadth;
        System.out.println(area);
    }

    public void area() {
        int a=100;
        int area=a*a;
        System.out.println(area);
    }


    public static void main(String args[]) {
        Area obj = new Area();
        obj.areaRect();
        obj.area();
    }
}