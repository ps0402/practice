package practice;

public class RecursionPractice {
    public static void main(String[] args){
        /*
        6. If your program produces an error message that says stack overflow,
        what is a  likely source of the error?
            ANSWER: a recursive method going infinitely and creating too many "pages"

         */
        writeVertical(1234);
        asterisks(5);
        reverse(1234);
        numsLeadingUp(10);
        reverseNumsLeadingUp(10);
        cheers(3);
        cheersIterative(3);


    }

    public static void writeVertical(int n){
        if(n<10){       //if n is less than ten, then just write the num to the screen
            System.out.println(n + "\n");
        } else {        //if n is bigger than 10, output all the digits except the last, then output the last
            writeVertical(n/10);
            System.out.println(n%10);
        }
    }

    /*
    a recursive method with one int parameter that writes to the screen the num of asterisks (*) given
    by the argument. Output should be all on one line and assume argument is positive.
     */
    public static void asterisks(int n){
        if(n==1){
            System.out.print("*\n");
        } else {
            System.out.print("*");
            asterisks(n-1);

        }
    }
    /*
    write a recursive void method that has one parameter which is a pos integer. when called,
    the method writers the argument backwards to the screen on one line (given 1234, print 4321)
     */
    public static void reverse(int n){
        if(n<10){
            System.out.print(n + "\n");
        } else{
            System.out.print(n%10);
            reverse(n/10);
        }
    }
    /*
    write a recursive method that takes a single positive int argument and writes
    1, 2, 3.. n onto the screen (counting up)
     */
    public static void numsLeadingUp(int n){
        if(n==1){
            System.out.print(n+ "\n");
        } else {
            reverseNumsLeadingUp(n-1);
            System.out.print(n);

        }
    }
    /*
    write a recursive method that takes a single positive int argument and writes
    n... 3, 2, 1 onto the screen (counting down)
     */
    public static void reverseNumsLeadingUp(int n){
        if(n==1){
            System.out.print(n + "\n");
        } else {
            System.out.print(n);
            reverseNumsLeadingUp(n-1);
        }
    }

    /*
    write an iterative version of "cheers method" below
     */
        public static void cheers(int n)  {     //recursive version given by txtbook
            if (n == 1)  {
                System.out.println("Hurray");
            }  else  {
                System.out.println("Hip");
                cheers(n-1);
            }
        }
    public static void cheersIterative(int n)  {     //recursive version given by txtbook
        for (int i = 1; i < n; i++) {
            System.out.println("Hip");
            if(i==n-1){
                System.out.println("Hooray");
                break;
            }
        }

    }

}
