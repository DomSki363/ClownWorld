package Pieces;

import Schachbrett1.Field;

public class Knight extends Piece{
    public Knight(Team team, Field startField){
      super(  "Schachfiguren SVG Format/"+ team.name().toLowerCase()+"_knight.svg", team, startField);
    }
}
