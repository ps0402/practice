package practice.LinkedListPractice;


import java.util.LinkedList;

public class LinkedListPractice {
     private Node1 head;
     public LinkedListPractice()
     {
         head = null;
     }

     /*
     adds a node at the start of the list with the specified data
      */
    public void addToStart(String itemName, int ItemCount)
    {
        head = new Node1(itemName, ItemCount, head);
    }

    /*
    removes the current head of the list. returns true if the list contains at least one node,
    returns false otherwise.
     */

    public boolean deleteHeadNode()
    {
        if(head != null)
        {
            head = head.getLink();
            return true;
        } else
            return false;
    }

    /*
    returns the number of nodes in the list
     */
    public int size()
    {
        int count = 0;
        Node1 position = head;
        while(position != null)
        {
            count++;
            position = position.getLink();
        }
        return count;
    }

    /*
    finding the first node containing target, then returning the reference to said node.
    if nonexistent, null is returned.
     */
    public Node1 find(String target)
    {
        Node1 position = head;
        String itemAtPos;
        while (position != null)
        {
            itemAtPos = position.getItem();
            if(itemAtPos.equals(target))
                return position;
            position = position.getLink(); //HOW TO TRAVERSE A LINKED LIST
        }
        return null;
    }

    /*
    outputing your linkedList
     */
    public void outputList()
    {
        Node1 position = head;
        while(position != null)
        {
            System.out.println(position.getItem() + " " + position.getCount());
            position = position.getLink(); //TRAVERSING
        }
    }
    public boolean contains(String item)
    { return (find(item) != null); }

}
