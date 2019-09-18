import java.util.*;

 class IteratorInterface {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("vaishali");
        arr.add("iti");
        arr.add("sanya");
        arr.add("meenu");

        //By iterator interface

        System.out.println(" By Iterator interface");
        Iterator itr = arr.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
          //By for each loop
        System.out.println();
            System.out.println("By for each loop");
            for(String str: arr)
            {
                System.out.println(str);
            }

            //By ListIterator interface
        System.out.println();
            System.out.println("By ListIterator interface");

        ListIterator<String> list1=arr.listIterator(arr.size());
        while(list1.hasPrevious())
        {
            String str=list1.previous();
            System.out.println(str);
        }
        System.out.println();
        System.out.println("By for loop");
        for(int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }
        System.out.println();
        System.out.println("By for each method");

        arr.forEach(d->{
            System.out.println(d);
        });
        System.out.println();
        System.out.println("By for each remaining method");
        Iterator<String> it=arr.iterator();
        it.forEachRemaining(m->
        {
            System.out.println(m);
        });




    }
}
