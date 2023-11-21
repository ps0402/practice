package practice.Midterm2Sample.Closet;

import java.security.InvalidParameterException;

public class ArrayCloset implements ClosetInterface {
    private Clothes[] items;

    private int size;

    public ArrayCloset(int capacity) {
        if (capacity <= 0) {
            throw new InvalidParameterException("invalid capacity: " + capacity);
        }
        items = new Clothes[capacity];
    }

    @Override
    public boolean put(Clothes clothes) {
        /*
        where to put the new item so that it's fast to retrieve?
        Option 1: into a sorted array (when to do this?)
        Option 2: into the front of the array (when to do this?)
         */
        return false;
    }

    @Override
    public Clothes retrieve(String name) {
        /*
        how fast is this function?
         */
        return null;
    }

    @Override
    public String[] toArray() {
        return new String[0];
    }

    @Override
    public int getSize() {
        return 0;
    }
}