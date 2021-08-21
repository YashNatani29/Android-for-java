package mooc.vandy.java4android.gate.logic;

/**
 * This file defines the Gate class.
 */
public class Gate {
 public static final int IN  = 1;
 public static final int OUT = -1;
 public static final int CLOSED = 0;
private int mSwing ;

public Gate(){    //constructor
     this.mSwing=Gate.CLOSED;
}
    public boolean setSwing(int direction) {
        if (direction==Gate.IN||direction==Gate.OUT){
            this.mSwing=direction;
            return true;
        }
        else
            return false;

    }

    public boolean open(int direction ) {
    return this.setSwing(direction);
    }

    public void close() {
      this.mSwing=Gate.CLOSED;
    }

    public int getSwingDirection() {
       return this.mSwing;
    }

    public int thru(int count) {
       return count * (this.mSwing);
    }

    public String toString() {
     switch (this.mSwing){
         case Gate.OUT   : return "This gate is open and swings to exit the pen only";
         case Gate.CLOSED: return "This gate is closed";
         case Gate.IN    : return "This gate is open and swings to enter the pen only";
         default : return "This gate has an invalid swing direction";
     }
    }

}
