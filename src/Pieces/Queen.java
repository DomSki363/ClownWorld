package Pieces;

import Schachbrett1.Field;

public class Queen extends Piece{
    public Queen(Team team, Field startField){
        super("Schachfiguren SVG Format/"+ team.name().toLowerCase()+"_queen.svg", team,startField);
    }
}
