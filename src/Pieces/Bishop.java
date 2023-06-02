package Pieces;

import Schachbrett1.Field;

public class Bishop extends Piece {
    public Bishop (Team team, Field startField){
        super("Schachfiguren SVG Format/"+ team.name().toLowerCase()+"_bishop.svg", team, startField);
    }
}
