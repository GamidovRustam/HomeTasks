package module06.task2;

import java.util.Map;

class Runner {
    public static void main(String[] args) throws module03.task3.NotEnoughInstruments {
        MusicShop shop = new MusicShop();
        shop.setAssortment();
        try {
            Map<MusicalInstruments, Integer> order = shop.makeOrder();
            shop.prepareInstruments(order);
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
