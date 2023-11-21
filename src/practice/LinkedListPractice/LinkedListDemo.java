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
        if(list.contains("Cantaloupes"))
            System.out.println("List has cantaloupes");

        list.deleteHeadNode();
        if(list.contains("Cantaloupes"))
            System.out.println("List has cantaloupes");
        else
            System.out.println("no cantaloupe");

        while(list.deleteHeadNode())
            ; //empty loop body. this just empties the list. the body is empty because the method
        //deleteHeadNode performs an action on the list and returns a boolean
        System.out.println("Start of list");
        list.outputList();
        System.out.println("End of list");


        list.addToStart("apple pie", 1);

        list.addToStart("hot dogs", 12);
        list.addToStart("mustard", 1);

        list.outputList();
        System.out.println("List has at least 1 node? T/F " + list.isEmpty());

        list.clear();
        System.out.println("List has at least 1 node? T/F " + list.isEmpty());

        for (int i = 0; i < 3; i++) {
            System.out.println("");
        }

        System.out.println("LIST 2: Inner Node Class");
        LinkedList2 list2 = new LinkedList2();
        list2.addToStart("Candy");
        list2.addToStart("Chocolate");
        list2.addToStart("Wine");
        System.out.println("List has " + list2.size() + " nodes.");
        list2.outputList();




    }
}
