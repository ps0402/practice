package practice.LinkedListPractice;

public class LinkedListDemo {
    public static void main(String[] args)
    {
        LinkedListPractice list = new LinkedListPractice();
        list.addToStart("Apples", 1);
        list.addToStart("Bananas", 2);
        list.addToStart("Cantaloupes", 3);
        System.out.println("List has " + list.size() + " nodes.");

        list.outputList();

    }
}
