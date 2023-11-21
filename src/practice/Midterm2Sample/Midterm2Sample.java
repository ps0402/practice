package practice.Midterm2Sample;

import java.util.ArrayList;
import java.util.List;

public class Midterm2Sample {
    public static void main(String[] args)
    {
        /*
        System.out.println(fib(5));
        System.out.println(fib(10));
        System.out.println(fib(6));
        System.out.println(fib(12));




        List<Integer> list = new ArrayList<>(10);
        verticalNumber(5678, list);
        for (Integer val : list){
            System.out.println(val);
        }


        int[] data = new int[] {2,3,5,6,8,9};
        int target = 8;
        int n = binarySearch(data, target);
        System.out.println(n);


        printInReverseWithoutLoop(node);

         */
    }
    public static int binarySearch(int[] data, int target) {
        if (data.length == 0) {
            return -1;
        }
        return binarySearch(data, target, 0, data.length - 1);
    }

    private static int binarySearch(int[] data, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (data[mid] == target) {
            return mid;
        }
        if (target > data[mid]) {
            return binarySearch(data, target, mid + 1, end);
        }
        return binarySearch(data, target, start, mid - 1);
    }
    private static void verticalNumber(int num, List<Integer> result) {
        int lastDigit = num % 10;
        result.add(lastDigit);
        if (num / 10 != 0) {

            verticalNumber(num / 10, result);
        }
        //result.add(lastDigit);
    }

    public static Integer fib(Integer n) {
        if(n<= 1)
        {
            return n;
        } else
            return (fib(n-1) + fib(n-2));
    }
    public class ListNode<T> {
        public T val;
        public ListNode<T> next;

        public ListNode() {}

        public ListNode(T val) {
            this.val = val;
        }
    }
    public void printInReverseWithoutLoop(ListNode<String> node) {
        ListNode head = new ListNode();
        head = new ListNode<>(node.val);
        if(head != null || head.next!= null)
        {
            printInReverseWithoutLoop(head.next);
            head.next.next = head;
            head.next = null;
            System.out.println();
        }


    }
}
