package module06.task2;

import java.util.HashMap;
import java.util.Map;

import static module06.task1.userInput.UserInput.*;

class Runner {
    public static void main(String[] args) throws Module03.Task3.NotEnoughInstruments {
        String there = "There is just ";
        String orderAgain = "left in shop. Please order again:";

        MusicShop shop = new MusicShop();
//  setting starter assortment in shop
        Map<String, Integer> assortment = new HashMap<>();
        assortment.put(MusicalInstrument.PIANO, 6);
        assortment.put(MusicalInstrument.GUITAR, 12);
        assortment.put(MusicalInstrument.TRUMPET, 15);

        shop.setMusicalInstruments(assortment);

        try {
            Map<String, Integer> order = new HashMap<>();
        System.out.println("How many piano you want to order:");
        int orderPiano = inputPositiveOrZeroInt();
        while (orderPiano > assortment.get(MusicalInstrument.PIANO)) {
            System.out.println(there + assortment.get(MusicalInstrument.PIANO) + " piano " + orderAgain);
            orderPiano = inputPositiveOrZeroInt();
        }
        order.put(MusicalInstrument.PIANO, orderPiano);

        System.out.println("now, order guitars:");
        int orderGuitar = inputPositiveOrZeroInt();
        while (orderGuitar > assortment.get(MusicalInstrument.GUITAR)) {
            System.out.println(there + assortment.get(MusicalInstrument.GUITAR) + " guitar " + orderAgain);
            orderGuitar = inputPositiveOrZeroInt();
        }
        order.put(MusicalInstrument.GUITAR, orderGuitar);

        System.out.println("and the trumpets:");
        int orderTrumpet = inputPositiveOrZeroInt();
        while (orderTrumpet > assortment.get(MusicalInstrument.TRUMPET)) {
            System.out.println(there + assortment.get(MusicalInstrument.TRUMPET) + " trumpet " + orderAgain);
            orderTrumpet = inputPositiveOrZeroInt();
        }
        order.put(MusicalInstrument.TRUMPET, orderTrumpet);

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

// lines 27, 35, 43, 50, 51, 52
//"magic numbers" - the names of instruments can be replaced with constants PIANO, GUITAR, TRUMPET

//"boat anchor" - the exception NotEnoughInstruments will never throws because input values are checks by Input class methods