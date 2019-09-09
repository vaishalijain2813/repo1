public class Field
{
    int length;
    int breadth;
    int area;
    Field()
    {
        length=20;
        breadth=30;
        area=length*breadth;
        System.out.println("Area of field:"+area);
    }
    public static void main(String[] args) {
        Field f = new Field();
    }
}
