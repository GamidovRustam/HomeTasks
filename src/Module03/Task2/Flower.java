package module03.task2;


import other.module08.flowerCollections.MyColors;
import other.module08.flowerCollections.MyFlowers;

public abstract class Flower {
    private MyFlowers name;
    private MyColors color;
    private int price;

    public Flower(MyFlowers name, MyColors color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-17s%-15d", name, color, price);
    }

    public MyFlowers getName() {
        return name;
    }

    public void setName(MyFlowers name) {
        this.name = name;
    }

    public MyColors getColor() {
        return color;
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
}
