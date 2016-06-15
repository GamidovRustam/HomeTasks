package module06.task2;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MusicShop {
    private Map<String, Integer> musicalInstruments;

    public Map<String, Integer> getMusicalInstruments() {
        return musicalInstruments;
    }

    public void setMusicalInstruments(Map<String, Integer> musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
    }

    public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order) throws NotEnoughInstruments {
        int orderPiano = order.get(MusicalInstrument.PIANO);
        int pianoInShop = musicalInstruments.get(MusicalInstrument.PIANO);
        if (orderPiano > pianoInShop) {
            throw new NotEnoughInstruments("not enough instruments");
        }
        musicalInstruments.put(MusicalInstrument.PIANO, pianoInShop - orderPiano);

        int orderGuitar = order.get(MusicalInstrument.GUITAR);
        int guitarInShop = musicalInstruments.get(MusicalInstrument.GUITAR);
        if (orderGuitar > guitarInShop) {
            throw new NotEnoughInstruments("not enough instruments");
        }
        musicalInstruments.put(MusicalInstrument.GUITAR, guitarInShop - orderGuitar);

        int orderTrumpet = order.get(MusicalInstrument.TRUMPET);
        int trumpetInShop = musicalInstruments.get(MusicalInstrument.TRUMPET);
        if (orderTrumpet > trumpetInShop) {
            throw new NotEnoughInstruments("not enough instruments");
        }
        musicalInstruments.put(MusicalInstrument.TRUMPET, trumpetInShop - orderTrumpet);


        List<MusicalInstrument> result = new ArrayList<>();
        for (int i = 0; i < orderPiano; i++) {
            result.add(new Piano());
        }

        return result;
//        Map<String, Integer> result = new HashMap<>();
//        result.put(MusicalInstrument.PIANO,order.get(MusicalInstrument.PIANO));
//        result.put(MusicalInstrument.GUITAR,order.get(MusicalInstrument.GUITAR));
//        result.put(MusicalInstrument.TRUMPET,order.get(MusicalInstrument.TRUMPET));
//
//        return result;
//    }
    }
}
