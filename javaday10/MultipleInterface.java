interface Printable{
        void print();
        }
interface Showable{
    void show();
}
class MultipleInterface implements Printable,Showable{
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Hii");}

    public static void main(String args[]){
        MultipleInterface obj = new MultipleInterface();
        obj.print();
        obj.show();
    }
}