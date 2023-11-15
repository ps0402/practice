package homework2.Problem3;


public class MovieComedy extends Movie {
    private final int lateFeePerDayInDollar = 3;

    public MovieComedy(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
    }

    public MovieComedy(MovieComedy anotherMovie) {
        // homework
        // tip: use the 'super' keyword
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // TODO: add your code
        return -1; // TODO: place holder. Replace with your code.
    }
}