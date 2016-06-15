package module06.task2;

import module06.task1.chekInput.CheckInput;

import java.util.HashMap;
import java.util.Map;

public class Runner3 {
    public static void main(String[] args) throws Module03.Task3.NotEnoughInstruments {
        String there = "There is just ";
        String orderAgain = "left in shop. Please order again:";

        MusicShop shop = new MusicShop();
        CheckInput checkInput = new CheckInput();

        Map<String, Integer> asortiment = new HashMap<>();
        asortiment.put(MusicalInstrument.PIANO, 6);
        asortiment.put(MusicalInstrument.GUITAR, 12);
        asortiment.put(MusicalInstrument.TRUMPET, 15);

        shop.setMusicalInstruments(asortiment);

        Map<String, Integer> order = new HashMap<>();
        System.out.println("How many piano you want to order:");
        int orderPiano = checkInput.ifNegativeValueInt();
        while (orderPiano > asortiment.get(MusicalInstrument.PIANO)) {
            System.out.println(there + asortiment.get(MusicalInstrument.PIANO) + " piano " + orderAgain);
            orderPiano = CheckInput.ifNegativeValueInt();
        }
        order.put(MusicalInstrument.PIANO, orderPiano);

        System.out.println("now, order guitars:");
        int orderGuitar = checkInput.ifNegativeValueInt();
        while (orderGuitar > asortiment.get(MusicalInstrument.GUITAR)) {
            System.out.println(there + asortiment.get(MusicalInstrument.GUITAR) + " guitar " + orderAgain);
            orderGuitar = CheckInput.ifNegativeValueInt();
        }
        order.put(MusicalInstrument.GUITAR, orderGuitar);

        System.out.println("and the trumpets:");
        int orderTrumpet = checkInput.ifNegativeValueInt();
        while (orderTrumpet > asortiment.get(MusicalInstrument.TRUMPET)) {
            System.out.println(there + asortiment.get(MusicalInstrument.TRUMPET) + " trumpet " + orderAgain);
            orderTrumpet = CheckInput.ifNegativeValueInt();
        }
        order.put(MusicalInstrument.TRUMPET, orderTrumpet);

        try {
            shop.prepareInstruments(order);
            System.out.println("Your order: ");
            System.out.println("Piano - " + order.get(MusicalInstrument.PIANO));
            System.out.println("Guitars - " + order.get(MusicalInstrument.GUITAR));
            System.out.println("Trumpets - " + order.get(MusicalInstrument.TRUMPET) + "\n");
            System.out.println("Please, send the 500K dollars to my credit card and I'll deliver your instruments to yor home))");
        } catch (NotEnoughInstruments e) {
            System.out.println("We cant complete the order. There is " + e.getMessage());
        }
    }
}
