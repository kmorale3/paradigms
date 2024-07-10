// Katie Morales homework 11
public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object other){
        // reflexive
        if(other == this)
            return true;
        // non-null
        if(other == null)
            return false;
        // don't even bother! they have different types
        if(getClass() != other.getClass())
            return false;
        Point point = (Point) other; // why do we need this type cast?

        // calculate distances from origin using distance formula
        double d1 = Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
        double d2 = Math.sqrt(Math.pow(point.x,2) + Math.pow(point.y,2));
        // compare if distances are the same (true if they are equal)
        if (d1 == d2)
            return true;
        else
            return false;
    }

    @Override
    public int hashCode(){
        int varCodeX = x;
        int varCodeY = y;
        // inits hash with the var code for one of the fields
        int hash = varCodeX;
        //  hash = <prime number> * hash + var_code;
        hash = 41 * hash + varCodeY;
        return hash;
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }

    public static void main (String [] args){
        
    }
}