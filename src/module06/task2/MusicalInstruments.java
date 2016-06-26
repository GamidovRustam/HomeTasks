package module06.task2;

public enum  MusicalInstruments {
    PIANO, GUITAR, TRUMPET;

    @Override
    public String toString() {
        String s;
        if (this == PIANO) {
            s = "Piano";
        } else if (this == GUITAR) {
            s = "Guitar";
        } else {
            s = "Trumpet";
        }
        return s;
    }
}

