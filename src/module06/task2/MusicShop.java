package module06.task2;

import java.util.ArrayList;
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
            throw new NotEnoughInstruments("not enough piano");
        }

        int orderGuitar = order.get(MusicalInstrument.GUITAR);
        int guitarInShop = musicalInstruments.get(MusicalInstrument.GUITAR);
        if (orderGuitar > guitarInShop) {
            throw new NotEnoughInstruments("not enough guitars");
        }

        int orderTrumpet = order.get(MusicalInstrument.TRUMPET);
        int trumpetInShop = musicalInstruments.get(MusicalInstrument.TRUMPET);
        if (orderTrumpet > trumpetInShop) {
            throw new NotEnoughInstruments("not enough trumpets");
        }

        musicalInstruments.put(MusicalInstrument.PIANO, pianoInShop - orderPiano);
        musicalInstruments.put(MusicalInstrument.GUITAR, guitarInShop - orderGuitar);
        musicalInstruments.put(MusicalInstrument.TRUMPET, trumpetInShop - orderTrumpet);

        List<MusicalInstrument> result = new ArrayList<>();
        for (int i = 0; i < orderPiano; i++) {
            result.add(new Piano());
        }
        for (int i = 0; i < orderGuitar; i++) {
            result.add(new Guitar());
        }
        for (int i = 0; i < orderTrumpet; i++) {
            result.add(new Trumpet());
        }
        return result;
    }
}