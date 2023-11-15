package practice.LinkedListPractice;

public class Node1
{ //creating my own node

    private String item;
    private int count;
    private Node1 link;

    public Node1(String newItem, int newCount, Node1 linkVal)
    {
        setData(newItem, newCount);
        link = linkVal;
    }

    public void setData(String newItem, int newCount)
    {
        item = newItem;
        count = newCount;
    }

    public void setLink(Node1 newLink){ link = newLink; }
    public String getItem(){ return item; }
    public int getCount(){ return count; }
    public Node1 getLink(){ return link; }

}
