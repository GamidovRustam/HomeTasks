package module06.task2;

import java.util.HashMap;
import java.util.Map;

import static module06.task1.userInput.UserInput.*;

class Runner {
    public static void main(String[] args) throws module03.Task3.NotEnoughInstruments {
        final String THERE_JUST = "There is just ";
        final String ORDER_AGAIN = " left in shop. Please order again:";
        final String THERE = "There is ";
        final String HOW_MANY = " in shop. How many you want to order:";


        MusicShop shop = new MusicShop();
//  setting starter assortment in shop
        Map<String, Integer> assortment = new HashMap<>();
        assortment.put(MusicalInstrument.PIANO, 6);
        assortment.put(MusicalInstrument.GUITAR, 12);
        assortment.put(MusicalInstrument.TRUMPET, 15);

        shop.setMusicalInstruments(assortment);

        try {
            Map<String, Integer> order = new HashMap<>();
        System.out.println(THERE + assortment.get(MusicalInstrument.PIANO) + " piano" + HOW_MANY);
        int orderPiano = inputPositiveOrZeroInt();
        while (orderPiano > assortment.get(MusicalInstrument.PIANO)) {
            System.out.println(THERE_JUST + assortment.get(MusicalInstrument.PIANO) + " piano" + ORDER_AGAIN);
            orderPiano = inputPositiveOrZeroInt();
        }
        order.put(MusicalInstrument.PIANO, orderPiano);

        System.out.println(THERE + assortment.get(MusicalInstrument.GUITAR) + " guitars" + HOW_MANY);
        int orderGuitar = inputPositiveOrZeroInt();
        while (orderGuitar > assortment.get(MusicalInstrument.GUITAR)) {
            System.out.println(THERE_JUST + assortment.get(MusicalInstrument.GUITAR) + " guitars" + ORDER_AGAIN);
            orderGuitar = inputPositiveOrZeroInt();
        }
        order.put(MusicalInstrument.GUITAR, orderGuitar);

        System.out.println(THERE + assortment.get(MusicalInstrument.TRUMPET) + " trumpet" + HOW_MANY);
        int orderTrumpet = inputPositiveOrZeroInt();
        while (orderTrumpet > assortment.get(MusicalInstrument.TRUMPET)) {
            System.out.println(THERE_JUST + assortment.get(MusicalInstrument.TRUMPET) + " trumpet" + ORDER_AGAIN);
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


// lines 27, 35, 43, 50, 51, 52//
//"magic numbers" - the names of instruments can be replaced with constants PIANO, GUITAR, TRUMPET//

//"boat anchor" - the exception NotEnoughInstruments will never throws because input values are checks by Input class methods//

//хорошо было бы в выводе, перед тем как спрашивать сколько гитар вы хотите купить, сообщить о том, сколько их вообще есть)//

//there, orderAgain - it should be constants//

//много повторяющихся частей кода. Нужно рефакторить - выносить в методы, использовать Enum...
