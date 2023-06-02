package Pieces;

import Schachbrett1.Field;

public class Rook extends Piece{
    public Rook(Team team, Field startField){
        super ("Schachfiguren SVG Format/"+ team.name().toLowerCase()+"_rook.svg", team, startField);
    }
}
