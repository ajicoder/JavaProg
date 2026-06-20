import java.util.ArrayList;

public class mango {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    String color;
    String type;
    String taste;
    String store;
    int price;
    public static void main (String[] args) {

        mango m1 = new mango();
        m1.setColor("Yellow");
        m1.setTaste("Sweet");
        m1.setType("Long");
        m1.setStore("Costco");
        m1.setPrice(10);

        mango m2 = new mango();
        m2.setColor("Green");
        m2.setTaste("Sweet");
        m2.setType("Round");
        m2.setStore("Indian Shop");
        m2.setPrice(5);

        mango m3 = new mango();
        m3.setColor("Yellow");
        m3.setTaste("Sweet");
        m3.setType("Round");
        m3.setStore("Indian Shop");
        m3.setPrice(5);

        mango m4 = new mango();
        m4.setColor("Yellow");
        m4.setTaste("Sweet");
        m4.setType("Round");
        m4.setStore("Indian Shop");
        m4.setPrice(5);

        ArrayList<mango> box = new ArrayList<>();

        box.add(m1);
        box.add(m2);
        box.add(m3);
        box.add(m4);
        int tp;
        tp = 0;
        for (mango m : box) {
            tp = tp + m.getPrice();
        }
        System.out.print(tp);










    }
}
