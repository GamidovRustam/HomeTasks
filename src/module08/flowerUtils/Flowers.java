package module08.flowerUtils;

import module08.flower.Flower;

import java.util.Comparator;
import java.util.List;

public class Flowers {
    public static List<Flower> sortByPrice(List<Flower> coll) {
        if (coll.isEmpty()) {
            throw new NullPointerException("Can't sortByColor empty collection!");
        }

        for (int i = 1; i < coll.size() - 1; i++) {
            for (int j = coll.size() - 1; j >= i; j--) {
                if (coll.get(j-1).getPrice() > coll.get(j).getPrice()){
                    Flower temp = coll.get(j-1);
                    coll.set(j-1, coll.get(j));
                    coll.set(j, temp);
                }
            }
        }
        return coll;
    }

    public static  List<Flower>  sortByColor(List<Flower> coll) {
        coll.sort(new Comparator<Flower>() {
            @Override
            public int compare(Flower o1, Flower o2) {
                return ((Comparable) o1).compareTo(o2);
            }
        });
        return coll;
    }

    public static List<Flower> sortByName(List<Flower> coll) {
        coll.sort(new Comparator<Flower>() {
            @Override
            public int compare(Flower o1, Flower o2) {
                return o1.compareName(o2);
            }
        });
        return coll;
    }

    public static int compareName(String s1, String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        int lim = Math.min(len1, len2);
        char v1[] = s1.toCharArray();
        char v2[] = s2.toCharArray();

        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;
    }

    public static int compareNameIgnoreCase(String s1, String s2){
        return s1.compareToIgnoreCase(s2);
    }
}
