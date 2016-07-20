package module08.flowerUtils;

import java.util.List;

public class FlowerCollections {
    public static String[] listToStringArray(List list) {
        String[] listToString = new String[list.size()];
        for (int i = 0; i < listToString.length; i++) {
            listToString[i] = "\n" + list.get(i).toString();
        }
        return listToString;
    }
}
