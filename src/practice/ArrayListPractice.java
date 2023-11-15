package practice;
import java.util.ArrayList;

public class ArrayListPractice
{
    public static void main(String[] args)
    {

        /*

        you can declare an ArrayList by specifying the type once or twice. type must be OBJECT, so if
        you need int you must use Integer.
        You can also choose to set your initial capacity if you want.

         */
        ArrayList<Integer> intList = new ArrayList<Integer>(20);
        ArrayList<String> stringList = new ArrayList<>();

        //new values cannot be added with the set method, you must use .add
        //values are added in consecutive order, so starting at index 0
        intList.add(1);
        intList.add(2);
        intList.add(3);


        /*

        to access elements of an array, you need to use the set and get methods provided by the class

         */
        int index = 1;
        intList.set(index, 10);

        String temp = stringList.get(index);
        System.out.println(temp);

        //size() method RETURNS size of list
        System.out.println(intList.size());
    }
}
