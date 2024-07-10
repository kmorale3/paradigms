// Katie Morales Homework 11
// Main TicTacToe execution
package tictactoe;
import tictactoe.classes.*;
import java.util.*;
public class TicTacToe {
    // board is 9 chars initialized to ' ' and later filled with 'X' and 'O'
    // winWays represents the positions that can match with X or O in order to win
    public char [] board;
    public int  [] winWays;

    public TicTacToe(){
        this.board = new char[9];
        Arrays.fill(board, ' ');
        // every 3 indices in the array represents a triple of positions to win
        this.winWays = new int [] {0,1,2,
                        3,4,5,
                        6,7,8,
                        0,3,6,
                        1,4,7,
                        2,5,8,
                        0,4,8,
                        2,4,6};
    }
    public void run(Player p1, Player p2){
        // passed to generatePos in order to make sure a valid position is chosen
        Set<Integer> takenPositions = new HashSet<Integer>();
        // the position chosen by each player
        int p1Play;
        int p2Play;
        while (true) {
            // user position selected
            p1Play = p1.generatePos(takenPositions);
            takenPositions.add(p1Play);
            this.board[p1Play - 1] = 'X';
            this.printBoard();

            // check if game should continue
            if (this.hasEnded())
                return;

            // computer position selected
            p2Play = p2.generatePos(takenPositions);
            this.board[p2Play - 1] = 'O';
            takenPositions.add(p2Play);

            // check if game should continue
            this.printBoard();
            if (this.hasEnded())
                return;
        }
    }
    public void printBoard(){
        // print out the board
        System.out.format("Current Board:\n");
        System.out.format(" %c | %c | %c \n", this.board[0], this.board[1], this.board[2]);
        System.out.format("---+---+---\n");
        System.out.format(" %c | %c | %c \n", this.board[3], this.board[4], this.board[5]);
        System.out.format("---+---+---\n");
        System.out.format(" %c | %c | %c \n", this.board[6], this.board[7], this.board[8]);
        return;
    }
    public boolean hasEnded(){
        for (int i = 0; i < this.winWays.length; i +=3 ){
            // get each triple of indices from winWays
            int a = this.winWays[i];
            int b = this.winWays[i+1];
            int c = this.winWays[i+2];

            // get the chars at those indices
            char x = this.board[a];
            char y = this.board[b];
            char z = this.board[c];

            // check if user won
            if ((x == 'X') && (y == 'X') && (z == 'X')) {
                System.out.println("Player 1 has won!");
                return true;
            }

            // check if computer won
            else if ((x == 'O') && (y == 'O') && (z == 'O')) {
                System.out.println("Computer has won!");
                return true;
            }
        }
        // check for draw (the board is completely full and no one won)
        if (!(new String(this.board).contains(" "))){
            System.out.println("Draw!");
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe(); 
        Player user = new UserPlayer();
        Player computer = new ComputerPlayer();  

        System.out.println("Hello Player 1, Welcome to Tic Tac Toe!");
        System.out.println("You are the X and I am the O");

        System.out.format("\nTic Tac Toe Position Key:\n");
        System.out.format(" 1 | 2 | 3 \n");
        System.out.format("---+---+---\n");
        System.out.format(" 4 | 5 | 6 \n");
        System.out.format("---+---+---\n");
        System.out.format(" 7 | 8 | 9 \n");

        // run the game
        game.run(user, computer);
	}
}