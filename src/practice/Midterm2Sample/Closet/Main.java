package practice.Midterm2Sample.Closet;

public class Main {
    public static void main(String[] args) {
        //  LinkedListCloset closet = new LinkedListCloset(10);
        LinkedListCloset closet1 = new LinkedListCloset(15);

        closet1.put(new Clothes("red hoodie"));
        closet1.put(new Clothes("ice racing logo t-shirt"));
        closet1.put(new Clothes("white jacket"));

        Clothes clothes = closet1.retrieve("red hoodie");
        closet1.put(clothes);
        clothes = closet1.retrieve("white jacket");
        closet1.put(clothes);
        closet1.retrieve("black pants");
        clothes = closet1.retrieve("white jacket");
        closet1.put(clothes);

        System.out.println(closet1.getLeastWorn());




        /*
        put all the clothes into the closet
        String[] clothes1 = getClothes();
        for (int i = 0; i < clothes1.length; i++) {
            closet.put(new Clothes(clothes1[i]));
        }

        // what's in the closet? in what order?
        System.out.println(Arrays.toString(closet.toArray()));

        Clothes redHoodie = closet.retrieve("red hoodie");
        closet.put(redHoodie);

        System.out.println(Arrays.toString(closet.toArray()));  //??

        redHoodie = closet.retrieve("red hoodie");
                 */



    }

    private static String[] getClothes() {
        String[] clothesNames = {
                "red hoodie", "green Columbia", "Apexiel hoodie",
                "'Maximum effort' shirt", "white jacket",
        };

        return clothesNames;
    }
}