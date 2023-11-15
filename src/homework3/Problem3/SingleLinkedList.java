package homework3.Problem3;

public class SingleLinkedList {
    // do not add member variables
    private ListNode head;
    private int size;

    public SingleLinkedList() {
        // all functions in this class assume using a "dummy" node
        head = new ListNode();  // the "dummy" node
    }

    // copy constructor
    public SingleLinkedList(SingleLinkedList list) {
        // TODO: your code here
        // This needs to be a "deep copy" which means creating a copy of the other list.
        // e.g. "this.head = list.head" -> this is NOT a deep copy
    }

    public int removeAllOf(int valueToRemove) {
        // TODO: your code here
        return -1; // TODO: replace this with your code
    }

    // reverse the linked list nodes iteratively (no recursion)
    public void reverse() {
        // TODO: your code here
        // do not create any new node
        // do not use any collection such as array. check with the instructor if not sure
    }

    public SingleLinkedList(int[] dataArray) {
        this(); // what does this do?
        if (dataArray == null) {
            return;
        }
        ListNode ptr = head;
        for (int data : dataArray) {
            ptr.next = new ListNode(data);
            ptr = ptr.next;
            size++;
        }
    }

    public void add(int val) {
        size++;
        ListNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new ListNode(val);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head.next;
        while (ptr != null) {
            builder.append(ptr.val).append(ptr.next == null ? " -> end" : " -> ");
            ptr = ptr.next;
        }
        builder.append(String.format(", size=%d", size));
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SingleLinkedList)) {
            return false;
        }

        SingleLinkedList otherList = (SingleLinkedList) obj;

        if (this.size != otherList.size) {
            return false;
        }
        ListNode n1 = head.next;
        ListNode n2 = otherList.head.next;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return (n1 == null && n2 == null);
    }

    public int getSize() {
        return size;
    }
}