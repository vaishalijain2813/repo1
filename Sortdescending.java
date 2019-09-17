import java.util.*;
public class Sortdescending
{
        public static void main(String[] args)
        {

            List<Integer> numbers = new ArrayList<Integer>();
            numbers.add(1);
            numbers.add(97);
            numbers.add(71);
            numbers.add(97);
            numbers.add(74);
            numbers.add(47);
            System.out.println(numbers);
            /* Sorted List in reverse order*/
            System.out.println("ArrayList in descending order:");
            Collections.sort(numbers, Collections.reverseOrder());
                System.out.print(numbers);
            }
        }




