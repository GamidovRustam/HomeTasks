package module06.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner3 {
    public static void main(String[] args) {
        MusicShop shop = new MusicShop();

        Map<String, Integer> asortiment = new HashMap<>();
        asortiment.put(MusicalInstrument.PIANO, 3);
        asortiment.put(MusicalInstrument.GUITAR, 8);
        asortiment.put(MusicalInstrument.TRUMPET, 6);

        shop.setMusicalInstruments(asortiment);

        Map<String, Integer> order = new HashMap<>();
        order.put(MusicalInstrument.PIANO, 3);
        order.put(MusicalInstrument. GUITAR, 3);
        order.put(MusicalInstrument.TRUMPET, 2);

        List<MusicalInstrument> list;
        try {
            list = shop.prepareInstruments(order);
            for (MusicalInstrument instrument : list) {
                System.out.println(instrument);
            }
        } catch (NotEnoughInstruments e) {
            System.out.println("We cant complete the order. There is " + e.getMessage());
        }

    }

//        try {
//            shop.prepareInstruments(order);
//            System.out.println("Your order: ");
//            System.out.println("Piano - " + order.get(MusicalInstrument.PIANO));
//            System.out.println("Guitars - " + order.get(MusicalInstrument.GUITAR));
//            System.out.println("Trumpets - " + order.get(MusicalInstrument.TRUMPET));
//        } catch (NotEnoughInstruments e) {
//            System.out.println("We cant complete the order. There is " + e.getMessage());
//        }
    }
//}
