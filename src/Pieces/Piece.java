package Pieces;
import Schachbrett1.Field;
import com.kitfox.svg.SVGDiagram;
import com.kitfox.svg.SVGUniverse;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.io.File;

public abstract class Piece extends JLabel {
    private final File f;
    private final Team team;
    private Field currentField;

    public Piece(String pathtoImgFile, Team team, Field startField) {
        f = new File(pathtoImgFile);
        this.team = team;
    this.currentField = startField;
    }

    @Override
    protected void paintComponent(Graphics g) {
        SVGUniverse svgUniverse = new SVGUniverse();
        try {
            SVGDiagram diagram = svgUniverse.getDiagram(svgUniverse.loadSVG(f.toURI().toURL()));
            try {

            AffineTransform at = new AffineTransform();
            at.setToScale(this.getWidth()/diagram.getWidth(), this.getHeight()/diagram.getWidth());
            Graphics2D graphics2D = (Graphics2D) g;
            graphics2D.transform(at);
            diagram.render(graphics2D);

    }
            catch(Exception ex){
                System.out.println(ex);}}
        catch(Exception ex2 ){
            System.out.println(ex2);}
    }
    public Field getCurrentField(){
        return currentField;
    }
}