package module08.flowerGUI;

import javax.swing.*;
import java.awt.*;

public class WindowContent extends JPanel {
    private BorderLayout baseLayout = new BorderLayout();
    private JPanel basePanel = new JPanel(baseLayout);
    private CardLayout cardLayout = new CardLayout();
    private JPanel sortedTableCards = new JPanel(cardLayout);

    public WindowContent(FlowerTables flowerTables) {
        JPanel labelPanel = new JPanel();
        GridLayout labelLayout = new GridLayout();
        JLabel unsortedTableLabel = new JLabel(String.format("%40s", "Unsorted table"));
        JLabel emptyLabel = new JLabel(" ");
        JLabel sortedTableLabel = new JLabel(String.format("%32s", "Sorted table"));
        labelLayout.setColumns(3);
        labelPanel.setLayout(labelLayout);
        labelPanel.setMinimumSize(new Dimension(650, 200));
        labelPanel.add(unsortedTableLabel, labelLayout, 0);
        labelPanel.add(emptyLabel, labelLayout, 1);
        labelPanel.add(sortedTableLabel, labelLayout, 2);

        JPanel buttonsPanel = new JPanel();
        GridLayout buttonsLayout = new GridLayout();
        JButton sortByPriceButton = new JButton("Sort by price");
        JButton sortByNameButton = new JButton("Sort by name");
        JButton sortByColorButton = new JButton("Sort by color");
        Actions actions = new Actions(this);
        sortByPriceButton.addActionListener(actions);
        sortByNameButton.addActionListener(actions);
        sortByColorButton.addActionListener(actions);
        buttonsPanel.setLayout(buttonsLayout);
        buttonsLayout.setRows(3);
        buttonsLayout.setVgap(10);
        buttonsLayout.setHgap(5);
        buttonsPanel.add(sortByPriceButton);
        buttonsPanel.add(sortByNameButton);
        buttonsPanel.add(sortByColorButton);

        JPanel card1 = new JPanel();
        card1.add(flowerTables.getEmptyTable());
        card1.setVisible(true);

        JPanel card2 = new JPanel();
        card2.add(flowerTables.getSortedByPriceTable());
        card2.setVisible(true);

        JPanel card3 = new JPanel();
        card3.add(flowerTables.getSortedByNameTable());
        card3.setVisible(true);

        JPanel card4 = new JPanel();
        card4.add(flowerTables.getSortedByColorTable());
        card4.setVisible(true);

        sortedTableCards.add(card1, "empty");
        sortedTableCards.add(card2, "price");
        sortedTableCards.add(card3, "name");
        sortedTableCards.add(card4, "color");
        sortedTableCards.setVisible(true);

        basePanel.add(labelPanel, baseLayout.NORTH);
        basePanel.add(flowerTables.getUnsortedTable(), baseLayout.WEST);
        basePanel.add(sortedTableCards, baseLayout.EAST);
        basePanel.add(buttonsPanel, baseLayout.CENTER);
    }

    public void run(){
        JFrame jf = new JFrame();
        jf.setTitle("Sorting flower table");
        jf.setMinimumSize(new Dimension(650,200));
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(basePanel);

    }

    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public void setCardLayout(CardLayout cardLayout) {
        this.cardLayout = cardLayout;
    }

    public JPanel getBasePanel() {
        return basePanel;
    }

    public void setBasePanel(JPanel basePanel) {
        this.basePanel = basePanel;
    }

    public JPanel getSortedTableCards() {
        return sortedTableCards;
    }

    public void setSortedTableCards(JPanel sortedTableCards) {
        this.sortedTableCards = sortedTableCards;
    }
}
