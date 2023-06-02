package Pieces;

import Schachbrett1.Field;

public class Pawn extends Piece{
    public Pawn(Team team, Field startField){
        super("Schachfiguren SVG Format/"+ team.name().toLowerCase()+"_pawn.svg", team,startField);
    }
}
