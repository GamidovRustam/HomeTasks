package module08.flower;

import module08.flowerUtils.MyColors;

public abstract class Flower implements Comparable<Flower> {
    private String name;
    private MyColors color;
    private int price;

    public Flower(MyColors color, int price) {
        this.name = this.getClass().getSimpleName();
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return String.valueOf(color);
    }

    public void setColor(MyColors color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-17s%-15d", name, color, price);
    }

    @Override
    public int compareTo(Flower o) {
        return color.compareTo(o.color);
    }

    public int compareName(Flower o) {
        return name.compareTo(o.name);
    }
}
