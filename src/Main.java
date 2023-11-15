import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        int[] data = new int[] {5, 4,1, 3, 2,};
        //{2, 2} -> true
        //{1, 2, 1} -> true
        //{1, 2, 3, 4} -> false
        //{5, 6, 6, 7, 6, 6, 5} ->true
        //{} -> true
        //{1, 2, 3, 3, 1} - >false

        //System.out.printf("\n" + isSymmetrical(data));

        System.out.printf("\n" + foo(data));
        System.out.printf("\n" + Arrays.toString(primeFactors(6300)));

    }



//for midterm practice


    public static int foo( int[] input) {
        if (input.length == 0 ) {
            return -1;
        }

        int idx = 0;
        for (int i = 1; i < input.length; i++) {
            if (input[idx] > input[i]) {
                  idx = i;
            }
        }
        return idx;
    }

    public static boolean isSymmetrical(int[] data) {
        if (data.length == 0)
            return true;
        boolean symmetricCheck = false;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == data[data.length-1-i]){
                symmetricCheck = true;
            } else {
                symmetricCheck = false;
                break;
            }
        }
        return symmetricCheck;
    }
    public static int[] primeFactors(int num) {    // TODO: fix this line so code compiles - 5pt
        // TODO: add your solution - 20 pt
        return null;    // TODO: placeholder. replace with your code
    }

    //linked list practice
    /*
    each value is placed in a node. they are linked together.
    every node has a VALUE and an ADDRESS(of the next node)
    in Java, we create objects. every object has a reference of the next object, and the last one has the reference null.

    The first class we need is a node class, which has data(int) and the next node.
    Then we need a linkedList class
    Then a class with a main method using your operations

    */




}