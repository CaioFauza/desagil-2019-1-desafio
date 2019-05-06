package br.pro.hashi.ensino.desagil.desafio.model;

public class HumanPlayer extends Player {
    private boolean gameEnded=false;

    public HumanPlayer(int row, int col, Board board) {
        super(row, col, board);
    }


    public void moveUp() {

        if (row > 0 && !board.isWall(row - 1, col) && !gameEnded) {
            move(-1, 0);
        }
    }

    public void moveRight() {
        if (col < board.getNumCols() - 1 && !board.isWall(row, col + 1) && !gameEnded) {
            move(0, 1);
        }
    }

    public void moveDown() {
        if (row < board.getNumRows() - 1 && !board.isWall(row + 1, col) && !gameEnded) {
            move(1, 0);
        }
    }

    public void moveLeft() {
        if (col > 0 && !board.isWall(row, col - 1) && !gameEnded) {
            move(0, -1);
        }


    }


    public void setGameEnded(){
        gameEnded = true;


    }
}
