package practice.Midterm2Sample.Closet;

public interface ClosetInterface {
    boolean put(Clothes clothes);

    Clothes retrieve(String clothesName);

    String[] toArray();

    int getSize();
}