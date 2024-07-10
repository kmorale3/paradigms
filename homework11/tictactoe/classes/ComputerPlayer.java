package tictactoe.classes;
import java.util.*;
public class ComputerPlayer implements Player{
	public int generatePos(Set<Integer> takenPositions) {
        // computer randomly generates a position
        Random random = new Random();

        // our positions are represented from 1 - 9
        // random numbers between 0 and 8 are generated, so add 1
        int position = random.nextInt(9) + 1;

        // make sure a valid position was generated
        while(takenPositions.contains(position)) {
            position = random.nextInt(9) + 1;
        }
		return position;
    }
}