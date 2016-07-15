package module08;

import module08.flowerUtils.MyColors;
import module08.flowerGUI.FlowerTables;
import module08.flowerGUI.WindowContent;
import module08.flower.*;

import java.util.*;
import java.util.List;

public class RunnerGUI {
    public static void main(String[] args) {
        List<Flower> flowers = new ArrayList<>();
        flowers.add(new Rose(MyColors.BLUE, 19));
        flowers.add(new Aster(MyColors.INDIGO, 17));
        flowers.add(new Tulip(MyColors.RED, 11));
        flowers.add(new Chamomile(MyColors.YELLOW, 9));
        flowers.add(new Rose(MyColors.YELLOW, 19));
        flowers.add(new Tulip(MyColors.GREEN, 16));
        flowers.add(new Chamomile(MyColors.ORANGE, 14));
        flowers.add(new Rose(MyColors.RED, 22));

        FlowerTables flowerTables = new FlowerTables(flowers);
        WindowContent windowContent = new WindowContent(flowerTables);
        windowContent.run();
    }
}
