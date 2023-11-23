import java.util.Arrays;
public class homework4
{
    public static void main(String[] args)
    {
      /*
      problem 1: create a recursive method to print all permutations of a given string

      */
        String input = "abc";
        permute(input, 0, input.length()-1);

    }

    public static void permute(String input, int start, int end)
    {
        if(start == end)
        {
            System.out.println(input);
        }
        else
        {
            for (int i = start; i <= end; i++) {
                input = swap(input, start, i);
                permute(input, start+1, end);
                input = swap(input, start, i);
            }
        }
    }
    public static String swap(String str, int y, int z)
    {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[y];
        charArray[y] = charArray[z];
        charArray[z] = temp;
        return String.valueOf(charArray);
    }


}
