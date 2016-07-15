package module08;

import module08.flowerUtils.Flowers;
import module08.flowerUtils.MyColors;
import module08.flowerUtils.PrinterOfFlowers;
import module08.flower.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Runner {
    public static void main(String[] args) {
        List<Flower> tulips = new ArrayList<>();
        tulips.add(new Tulip(MyColors.VIOLET,15));
        tulips.add(new Tulip(MyColors.RED,12));
        tulips.add(new Tulip(MyColors.YELLOW,17));
        tulips.add(new Tulip(MyColors.ORANGE,14));
        tulips.add(new Tulip(MyColors.GREEN,11));

        System.out.println("List of tulips before sorting:\n");
        PrinterOfFlowers.print(tulips);
        Flowers.sortByColor(tulips);
        System.out.println("Tulips sorted by color position in rainbow:\n");
        PrinterOfFlowers.print(tulips);

        List<Flower> roses = new LinkedList<>();
        roses.add(new Rose(MyColors.BLUE, 23));
        roses.add(new Rose(MyColors.ORANGE, 27));
        roses.add(new Rose(MyColors.BLUE, 21));
        roses.add(new Rose(MyColors.GREEN, 25));
        roses.add(new Rose(MyColors.YELLOW, 19));

        System.out.println("List of roses before sorting:\n");
        PrinterOfFlowers.print(roses);
        Flowers.sortByPrice(roses);
        System.out.println("Roses sorted by price:\n");
        PrinterOfFlowers.print(roses);

        List<Flower> flowers = new ArrayList<>();
        flowers.add(new Rose(MyColors.BLUE, 19));
        flowers.add(new Aster(MyColors.INDIGO, 17));
        flowers.add(new Tulip(MyColors.RED, 11));
        flowers.add(new Chamomile(MyColors.YELLOW, 9));
        flowers.add(new Rose(MyColors.BLUE, 19));

        System.out.println("Flower bouquet before sorting:\n");
        PrinterOfFlowers.print(flowers);
        System.out.println("Bouquet sorted by name:\n");
        Flowers.sortByName(flowers);
        PrinterOfFlowers.print(flowers);
    }
}
