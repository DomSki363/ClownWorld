package Schachbrett1;

import javax.swing.*;
import java.awt.*;

public class Board implements Runnable{


    private JPanel Brett;
   public static final int WIDTH =1200;
    public static final int HEIGHT=1200;

    public static final Field[] fields = new Field[64];
    public JPanel genereteScreen(){
    JPanel panel = new JPanel(new GridLayout(8,8));

    for (int y=0; y<8; y++) {
        for (int x = 0; x < 8; x++) {
        Field f = new Field(x, y);
            panel.add(f);
        }
    }


    return panel;
    }
    @Override
    public void run() {
        showGUI();
    }
    private void showGUI(){
        JFrame frame = new JFrame("schachbrett");
        frame.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        JPanel cp = genereteScreen();
        PiecePanel pp = new PiecePanel();
        frame.setLayeredPane(pp);
        frame.setContentPane(cp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Board());
    }
}
