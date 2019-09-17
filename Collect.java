import java.util.Collections;
import java.util.*;


public class Collect {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("manual");
        list.add("api");
        System.out.println("list 1:"+list);


        List<String> list2 = new ArrayList<String>();
        list2.add("10");
        list2.add("20");
        list2.add("java");
        list2.add("api");
        System.out.println("list 2"+list2);

        //containsAll() method
        System.out.println("\nDoes set 1 contains set 2: "
                + list.containsAll(list2));


        //replaceAll()method
        String s1="India is a best country";
        String replaceString=s1.replaceAll("a","e");//replaces all occurrences of "a" to "e"
        System.out.println("replace all method" +replaceString);


        //equals() method
        String str1 = new String("HELLO");
        String str2 = new String("HELLO");
        System.out.println(str1.equals(str2));


        //addAll() method
        list.addAll(list2);
        System.out.println("ArrayList1 after addAll:"+list);




        //reatainAll()
        list2.retainAll(list);
        System.out.println(list2);


        //removeAll()
        list2.removeAll(list2);
        System.out.println(list2);

    }
}
