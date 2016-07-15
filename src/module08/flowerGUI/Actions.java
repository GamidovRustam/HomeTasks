package module08.flowerGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actions implements ActionListener{
    private WindowContent wc;

    public Actions(WindowContent wc){
        this.wc = wc;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String clickedButtonLabel = clickedButton.getText();
        if (clickedButtonLabel == "Sort by price") {
            wc.getCardLayout().show(wc.getSortedTableCards(), "price");
        }
        if (clickedButtonLabel == "Sort by name") {
            wc.getCardLayout().show(wc.getSortedTableCards(), "name");
        }
        if (clickedButtonLabel == "Sort by color") {
            wc.getCardLayout().show(wc.getSortedTableCards(), "color");
        }
    }

    public WindowContent getWc() {
        return wc;
    }

    public void setWc(WindowContent wc) {
        this.wc = wc;
    }
}
