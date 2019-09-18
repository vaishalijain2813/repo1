import java.util.List;
import java.util.Vector;

public class test3 {
    public static void main(String[] args) {
        Vector<String> v=new Vector<>();
        v.add("VJ1");
        v.add("VJ2");
        v.add("VJ3");
        v.add("VJ4");
    //capacity() tells us the no. of elements the vector is holding default its value is 10 and each time it exceeds its max value then it doubles its capacity Ex-if no. of elements becomes 11 then capacity of vector will become 20 and like this 40,80,160 etc
        System.out.println(v);
        System.out.println(v.capacity());
        //clone() ceates a clone of the original vector(v).
        Vector v1= (Vector) v.clone();
        System.out.println(v1);
        //ensureCapacity() method iis used to initialize the minimum capacity of a vector.
        v.ensureCapacity(40);
        System.out.println(v.capacity());
        //firstelement() is used to return the first element of the vector.
        System.out.println(v.firstElement());
        //trimToSize() is used to reduce the minimum capacity of vector to current size of the vector.
        v.trimToSize();
        System.out.println(v.capacity());
        //size() return the number of elements present in the vector.
        System.out.println(v.size());
    }
}
