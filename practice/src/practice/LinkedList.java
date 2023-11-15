package practice;


//linked list practice
    /*
    each value is placed in a node. they are linked together.
    every node has a VALUE and an ADDRESS(of the next node)
    in Java, we create objects. every object has a reference of the next object, and the last one has the reference null.

    The first class we need is a node class, which has data(int) and the next node.
    Then we need a linkedList class
    Then a class with a main method using your operations

    */
public class LinkedList
{
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        } else {
            Node n = head;
            while (n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void show(){
        Node node = head;
        while(node.next!=null){
            System.out.println(node.data);
            node = node.next;
        }
    }

}
