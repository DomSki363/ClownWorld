package Schachbrett1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FieldActionListener implements ActionListener {

    final Field self;
    final Color origColor;
    final Color selectedColor;
    private int clickCount = 0;

    public FieldActionListener(JButton self) {
        this.self = (Field) self;
        this.origColor = self.getBackground();
        this.selectedColor = new Color(220, 196, 49);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (clickCount % 2 == 0) {
            self.setBackground(this.selectedColor);
        } else {
            self.setBackground(this.origColor);



        }
        clickCount++;
    }
}