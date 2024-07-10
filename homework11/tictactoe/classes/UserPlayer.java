package tictactoe.classes;
import java.util.*;
public class UserPlayer implements Player{
	public int generatePos(Set<Integer> takenPositions) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("Please enter a number 1-9 for which position you would like to play");
        int position = userIn.nextInt();

        // make sure user selected a valid position
        while((takenPositions.contains(position)) || (position < 0) || (position > 9) ) {
            System.out.println("Position already taken, please select another:");
            position = userIn.nextInt(); 
        }
		return position;
	}
}