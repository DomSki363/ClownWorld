

package Schachbrett1;

import Pieces.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class PiecePanel extends JLayeredPane {

    King k;
    ArrayList<Piece> pieces = new ArrayList<>();

    public PiecePanel() {
        this.setPreferredSize(new Dimension(Board.WIDTH, Board.HEIGHT));
        this.generateBoard("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1");
    }

//    private void initChessBoard() {
//        k = new King(Team.BLACK);
//        k.setBounds(0, 0, Board.WIDTH / 8, Board.HEIGHT / 8);
//        this.setLayer(k, 1);
//        this.add(k);

  //  }

    private void generateBoard(String FEN) {
        String[] FENGroups = FEN.split(" ");
        int currentIndex = 0;
        char[] piecePositions = FENGroups[0].toCharArray();
        for (char c : piecePositions) {
            if (c == '/') continue;
            if (Character.isDigit(c)) {
                currentIndex += Character.getNumericValue(c);
                continue;
            }
            Team team = (Character.isLowerCase(c)) ? Team.BLACK : Team.WHITE;
            Piece currentPiece = null;
            switch (Character.toLowerCase(c)) {
                case 'r'-> {
                    currentPiece = new Rook(team, Board.fields[currentIndex]);
                }
                case 'n'-> {
                    currentPiece = new Knight(team, Board.fields[currentIndex]);
                }
                case 'b'-> {
                    currentPiece = new Bishop(team, Board.fields[currentIndex]);
                }
                case 'q'-> {
                    currentPiece = new Queen(team, Board.fields[currentIndex]);
                }
                case 'k'-> {
                    currentPiece = new King(team, Board.fields[currentIndex]);
                }

                case 'p'-> {
                    currentPiece = new Pawn(team, Board.fields[currentIndex]);
                }
            }
            pieces.add(currentPiece);
            currentIndex++;
        }
        for (Piece p : pieces) {
            this.setLayer(p, 2);
            p.setBounds(p.getCurrentField().getXPos(Board.WIDTH / 8), p.getCurrentField().getYPos(Board.HEIGHT / 8),
                    Board.WIDTH / 8, Board.HEIGHT / 8);
            this.add(p);



        }
    }
    @Override
    public void repaint() {

        super.repaint();
        k.setBounds(0, 0, this.getWidth() / 8, this.getHeight() / 8);
    }


}

