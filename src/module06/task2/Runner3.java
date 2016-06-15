package module06.task2;

import module06.task1.chekInput.CheckInput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner3 {
    public static void main(String[] args) throws Module03.Task3.NotEnoughInstruments {
        MusicShop shop = new MusicShop();
        CheckInput checkInput = new CheckInput();

        Map<String, Integer> asortiment = new HashMap<>();
        asortiment.put(MusicalInstrument.PIANO, 3);
        asortiment.put(MusicalInstrument.GUITAR, 8);
        asortiment.put(MusicalInstrument.TRUMPET, 6);

        shop.setMusicalInstruments(asortiment);

        System.out.println("Make an order:");

        Map<String, Integer> order = new HashMap<>();

        int orderPiano = checkInput.ifNegativeValueInt();
        order.put(MusicalInstrument.PIANO, orderPiano);

//        try {
//            if (order.get(MusicalInstrument.PIANO) >= orderPiano) {
//                order.put(MusicalInstrument.PIANO, orderPiano);
//            }
//        }catch (NotEnoughInstruments e){
//            System.out.println("We cant complete the order. There is " + e.getMessage());
//        }

        int orderGuitar = checkInput.ifNegativeValueInt();
            order.put(MusicalInstrument.GUITAR, orderGuitar);

        int orderTrumpet = checkInput.ifNegativeValueInt();
        order.put(MusicalInstrument.TRUMPET, orderTrumpet);

        try {
            shop.prepareInstruments(order);
            System.out.println("Your order: ");
            System.out.println("Piano - " + order.get(MusicalInstrument.PIANO));
            System.out.println("Guitars - " + order.get(MusicalInstrument.GUITAR));
            System.out.println("Trumpets - " + order.get(MusicalInstrument.TRUMPET));
        } catch (NotEnoughInstruments e) {
            System.out.println("We cant complete the order. There is " + e.getMessage());
        }
    }
}


//        List<MusicalInstrument> list;
//        try {
//            list = shop.prepareInstruments(order);
//            for (MusicalInstrument instrument : list) {
//                System.out.println(instrument);
//            }
//        } catch (NotEnoughInstruments e) {
//            System.out.println("We cant complete the order. There is " + e.getMessage());
//        }




//}
