package practice.Midterm2Sample.Closet;

public class Clothes {
    private String name;

    public Clothes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "name='" + name + '\'' +
                '}';
    }

}