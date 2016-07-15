package module08.flowerGUI;

import module08.flowerUtils.Flowers;
import module08.flower.Flower;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FlowerTables extends JTable {
    private final String[] COLUMN_NAMES = {"flower", "color", "price $"};
    private final Dimension TABLE_DIMENSION = new Dimension(220, 200);
    private JTable unsortedTable;
    private JTable emptyTable;
    private JTable sortedByPriceTable;
    private JTable sortedByNameTable;
    private JTable sortedByColorTable;

    public FlowerTables(List<Flower> flowerList) {
        unsortedTable = initJTable(flowerList);
        sortedByPriceTable = initJTable(Flowers.sortByPrice(flowerList));
        sortedByNameTable = initJTable(Flowers.sortByName(flowerList));
        sortedByColorTable = initJTable(Flowers.sortByColor(flowerList));
        List<Flower> emptyList = new ArrayList<>(flowerList.size());
        emptyTable = initJTable(emptyList);
    }

    private JTable initJTable(List<Flower> list) {
        String[][] newData = listToTwoDimensionalArray(list);
        JTable newTable = new JTable(newData, COLUMN_NAMES);
        newTable.setPreferredScrollableViewportSize(TABLE_DIMENSION);
        newTable.setFillsViewportHeight(true);
        JScrollPane jsp = new JScrollPane(newTable);
        add(jsp);
        return newTable;
    }

    private String[][] listToTwoDimensionalArray(List<Flower> coll) {
        String[][] data = new String[coll.size()][COLUMN_NAMES.length];

        for (int i = 0; i < data.length; i++) {
            data[i] = new String[]{coll.get(i).getName(),
                    coll.get(i).getColor(),
                    String.valueOf(coll.get(i).getPrice())};
        }
        return data;
    }

    public JTable getUnsortedTable() {
        return unsortedTable;
    }

    public void setUnsortedTable(JTable unsortedTable) {
        this.unsortedTable = unsortedTable;
    }

    public JTable getEmptyTable() {
        return emptyTable;
    }

    public void setEmptyTable(JTable emptyTable) {
        this.emptyTable = emptyTable;
    }

    public JTable getSortedByPriceTable() {
        return sortedByPriceTable;
    }

    public void setSortedByPriceTable(JTable sortedByPriceTable) {
        this.sortedByPriceTable = sortedByPriceTable;
    }

    public JTable getSortedByNameTable() {
        return sortedByNameTable;
    }

    public void setSortedByNameTable(JTable sortedByNameTable) {
        this.sortedByNameTable = sortedByNameTable;
    }

    public JTable getSortedByColorTable() {
        return sortedByColorTable;
    }

    public void setSortedByColorTable(JTable sortedByColorTable) {
        this.sortedByColorTable = sortedByColorTable;
    }
}



