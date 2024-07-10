// Katie Morales Homework 11
package tictactoe.classes;
import java.util.*;
public interface Player{
    // implemented by UserPlayer and ConputerPlayer 
    public int generatePos(Set<Integer> takenPositions);
}