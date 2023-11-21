package practice.LinkedListPractice;

public class LinkedList2 {

    public class Entry
    {
        private String item;
        private int count;
        public Entry()
        {
            item = null;
            count = 0;
        }
        public Entry(String newItem, int count)
        {
            this.item = newItem;
            this.count = count;
        }
    }

    private class Node
    {
        private String item;
        private Node link;

        public Node()
        {
            item = null;
            link = null;
        }

        public Node(String newItem, Node linkVal)
        {
            item = newItem;
            link = linkVal;
        }
    } //end of node inner class

    private Node head;  //class variable
    private Entry entry;
    public LinkedList2()
    {
        head = null;
        entry = null;
    }

    /*
    adds a node at the start of the list with the specified data. the added node will be first
    in the list.
     */
    public void addToStart(String itemName)
    {
        head = new Node(itemName, head);
    }


    /*
    deletes head node
     */
    public boolean deleteHeadNode()
    {
        if(head!= null)
        {
            head = head.link;
            return true;
        }
        else return false;
    }
    public int size()
    {
        int count = 0;
        Node position = head;
        while(position != null)
        {
            count++;
            position = position.link; //TRAVERSING LIST
            //notice that we have direct access to inner class variables such as link
        }
        return count;
    }
    public boolean contains(String itemName)
    {
        return(find(itemName) != null);
    }
    /*
    finds the first node containing the target item and returns a reference to tht node. if the
    target is not in the list, null is returned
     */
    public Node find(String target)
    {
        Node position = head;
        String itemAtPos;
        while(position != null)
        {
            itemAtPos = position.item;
            if(itemAtPos.equals(target))
            {
                return position;
            }
            else position = position.link;
        }
        return null;
    }
    public void outputList()
    {
        Node position = head;
        while(position!=null)
        {
            System.out.println(position.item);
            position = position.link;
        }
    }
    public boolean isEmpty()
    {
        return (head==null);
    }
    public void clear()
    {
        head = null; //this is much more simple than my own clear method because once the first
        //connecting node is gone, so is the rest of the list.
    }
    public Node startNode()
    {
        return head;
    }
}
