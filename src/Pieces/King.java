package Pieces;

import Schachbrett1.Field;

public class King extends Piece {
    public King (Team team, Field startField){

        super("Schachfiguren SVG Format/"+ team.name().toLowerCase()+"_king.svg", team, startField);
    }
}
