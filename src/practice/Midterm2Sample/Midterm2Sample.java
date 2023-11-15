package practice.Midterm2Sample;

public class Midterm2Sample {
    public static void main(String[] args)
    {
        System.out.println(fib(100));
    }
    public static Integer fib(Integer n) {
        if(n<= 1)
        {
            return n;
        } else
            return (fib(n-1) + fib(n-2));
    }
}
