public class Homework10{
    public boolean check(char[] correctPositions, String word) {
        /* your solution goes here */
        // check that word is not longer than correct positions
        if (correctPositions.length > word.length()) {
            return false;
        }
        for (int i = 0; i < correctPositions.length; i ++) {
            // * can match any character
            char c = correctPositions[i];
            if (c =='*') {
                continue;
            }
            // match all other characters, case sensitive 
            if (word.charAt(i) != c) {
                return false;
            }
        }
        return true;
    }
}
