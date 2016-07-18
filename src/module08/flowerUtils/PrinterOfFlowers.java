package module08.flowerUtils;

import module08.flower.Flower;

import java.util.Collection;

public class PrinterOfFlowers {
    public static void print(Collection<Flower> flowers) {
        System.out.println(String.format("%-15s%-15s%-15s", "flower", "color", "price $"));
        System.out.println("--------------------------------------");
        flowers
                .forEach(System.out::println);
        System.out.println("--------------------------------------\n\n");
    }

    public static void print(String[] flowers) {
        System.out.println(String.format("%-15s%-15s%-15s", "flower", "color", "price $"));
        System.out.println("--------------------------------------");
        for (int i = 0; i< flowers.length; i++) {
            flowers[i].toString();
        }
        System.out.println("--------------------------------------\n\n");
    }
}
