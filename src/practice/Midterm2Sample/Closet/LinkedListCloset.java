package practice.Midterm2Sample.Closet;

public class LinkedListCloset implements ClosetInterface {
    public class ClothesListNode {
        private Clothes clothes;
        private ClothesListNode next;

        public ClothesListNode(Clothes clothes) {
            this.clothes = clothes;
            next = null;
        }

        public ClothesListNode() {
            next = null;
        }
    }


    private ClothesListNode head;

    private int size;

    private final int capacity;


    public LinkedListCloset(int capacity) {
        head = new ClothesListNode();
        size = 0;
        this.capacity = capacity;
    }

    @Override
    public boolean put(Clothes item) {
        if (size == capacity) {
            return false;
        }
        /*
        O(1) steps to put an item in the closet
         */
        ClothesListNode newNode = new ClothesListNode(item);
        newNode.next = head.next;
        head.next = newNode;
        size++;
        return true;
    }

    @Override
    public Clothes retrieve(String clothesName) {
        if (size == 0) {
            return null;
        }
        int numOfChecks = 0;
        ClothesListNode ptr = head;
        Clothes ret = null;
        while (ptr.next != null) {
            numOfChecks++;
            if (ptr.next.clothes.getName().equals(clothesName)) {
                ret = ptr.next.clothes;
                ptr.next = ptr.next.next;
                size--;
                break;
            }
            ptr = ptr.next;
        }
        System.out.println("num of checks: " + numOfChecks + " when retrieving " + clothesName);
        return ret;
    }

    @Override
    public String[] toArray() {
        String[] ret = new String[size];
        ClothesListNode ptr = head;
        int idx = 0;
        while (ptr.next != null) {
            ret[idx] = ptr.next.clothes.getName();
            idx++;
            ptr = ptr.next;
        }
        return ret;
    }

    @Override
    public int getSize() {
        return size;
    }
    public Clothes getLeastWorn() {
        Clothes ret = null;
        if (size == 0) {
            return null;
        }
        ClothesListNode ptr = head;
        while (ptr.next != null) {
            ptr.next = ptr.next.next;

                return ptr.next.clothes;

        }
        return null;
    }
}