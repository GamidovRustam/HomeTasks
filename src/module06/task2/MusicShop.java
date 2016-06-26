package module06.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static module06.task1.userInput.UserInput.inputPositiveOrZeroInt;

public class MusicShop {
    private static Map<MusicalInstruments, Integer> assortment;

    public Map<MusicalInstruments, Integer> getAssortment() {
        return assortment;
    }

    public void setAssortment() {
        this.assortment = new HashMap<>();
        System.out.println("[Administrator part]");
        for (MusicalInstruments m : MusicalInstruments.values()) {
            System.out.println("Set the quantity of " + m.toString() + ":");
            assortment.put(m, inputPositiveOrZeroInt());
        }
    }

    public Map makeOrder() {
        final String THERE = "There is ";
        final String HOW_MANY = " in shop. How many you want to order:";
        final String THERE_JUST = "There is just ";
        final String ORDER_AGAIN = " left in shop. Please make order again:";

        Map<MusicalInstruments, Integer> order = new HashMap<>();
        System.out.println("[Customer part]");
        for (MusicalInstruments m : MusicalInstruments.values()) {
            System.out.println(THERE + assortment.get(m) + " " + m.toString() + HOW_MANY);
            int orderInstr = inputPositiveOrZeroInt();
            while (orderInstr > assortment.get(m)) {
                System.out.println(THERE_JUST + assortment.get(m) + " " + m.toString() + ORDER_AGAIN);
                orderInstr = inputPositiveOrZeroInt();
            }
            order.put(m, orderInstr);
        }
        return order;
    }

    public List<MusicalInstrument> prepareInstruments(Map<MusicalInstruments, Integer> order) throws NotEnoughInstruments {
        List<MusicalInstrument> result = new ArrayList<>();

        for (MusicalInstruments m : MusicalInstruments.values()) {
            int orderInstrument = order.get(m);
            int instrumentInShop = assortment.get(m);

            if (orderInstrument <= instrumentInShop) {
                assortment.put(m, instrumentInShop - orderInstrument);
            } else {
                throw new NotEnoughInstruments("not enough " + m.toString());
            }
            for (MusicalInstruments n : MusicalInstruments.values()) {
                for (int i = 0; i < orderInstrument; i++) {
                    switch (n) {
                        case PIANO:
                            result.add(new Piano());
                            break;
                        case GUITAR:
                            result.add(new Guitar());
                            break;
                        case TRUMPET:
                            result.add(new Trumpet());
                            break;
                        default:
                            System.out.println("Can't find required type of instrument");
                            break;
                    }
                }
            }
        }
        System.out.println("\n" + "Your order: ");
        for (MusicalInstruments m : MusicalInstruments.values()) {
            System.out.println(m.toString() + " - " + order.get(m));
        }
        return result;
    }
}

