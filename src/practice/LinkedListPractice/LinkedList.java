package practice.LinkedListPractice;

public class LinkedList<T extends PubliclyCloneable > implements Cloneable{
    private class Node<T> {
        private T data;
        private Node<T> link;

        public Node() {
            data = null;
            link = null;
        }

        public Node(T newData, Node<T> linkVal) {
            data = newData;
            link = linkVal;
        }
    }

    private Node<T> head;

    public LinkedList() {
        head = null;
    }

    /*
    produces another linkedList, but it is not a deep copy. throws a nullpointerexception if
    the other list is null
     */
    public LinkedList(LinkedList<T> other)
    {
        if(other == null)
        {
            throw new NullPointerException();
        }
        if(other.head == null)
        {
            throw new NullPointerException();
        }
        else
            head = copyOf(other.head);
    }
    public LinkedList<T> clone()
    {
        try
        {
            LinkedList<T> copy = (LinkedList<T>)super.clone();
            if(head == null)
                copy.head = null;
            else copy.head = copyOf(head);
            return copy;
        }
        catch (CloneNotSupportedException e)
        {
            return null;
        }
    }
    private Node<T> copyOf(Node<T> otherHead)
    {
        Node<T> position = otherHead;   //moves down others list
        Node<T> newHead;    //will point to head of the copy list
        Node<T> end = null;     //positioned at the end of new growing list

        //create first node:
        newHead = new Node<T> ((T)(position.data).clone(), null);
        end = newHead;
        position = position.link;
        while(position!= null)
        {   //cop node at position to the end of new list
            end.link = new Node<T> ((T)(position.data).clone(), null);
            end = end.link;
            position = position.link;
        }
        return newHead;
    }
    public boolean equals(Object otherObject)
    {
        if(otherObject == null)
        {
            return false;
        }
        else if(getClass() != otherObject.getClass())
            return false;
        else {
            LinkedList<T> otherList = (LinkedList<T>)otherObject;
            return  true;
        }
    }
}
