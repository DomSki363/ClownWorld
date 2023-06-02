package Schachbrett1;

import javax.swing.*;
import java.awt.*;

public class Field extends JButton {
    private final int row;
    private final int column;


    public Field (int column, int row){
        this.row = row;
        this.column = column;
        int index = row *8 +column;
        Color color1 = new Color(185,139,98);
        Color color2 = new Color(230,215,180);
        this.setBackground(((index + Math.floor(index / 8))% 2 == 0)? color1 : color2);
        this.addActionListener(new FieldActionListener(this));
        this.setBorderPainted(false);
    }
    public int getXPos(int widthPerCell){return column+widthPerCell;}
    public int getYPos(int heigthPerCell){return column+heigthPerCell;}
}
