package otherTests;


public class Jedi {

    private String name;
    private int childrenNumber;
    private boolean isOnDarkSide;

    public int getChildrenNumber() {
        return childrenNumber;
    }

    public boolean isOnDarkSide() {
        return this.isOnDarkSide;
    }

    Jedi(String name, int childrenNumber, boolean isOnDarkSide){

        this.name = name;
        this.childrenNumber = childrenNumber;
        this.isOnDarkSide = isOnDarkSide;
    }

    public String getName(){
        return this.name;
    }

}
