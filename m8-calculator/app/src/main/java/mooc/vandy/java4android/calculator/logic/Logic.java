package mooc.vandy.java4android.calculator.logic;

//import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    
    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {

        /*
         * Operation class is a abstract class which is inherited by all Add,Subtract,Multiply and Divide classes.
         * Operation class has static methods to add, subtract, multiply, divide and find remainder.
         * Methods are selected using a switch case on operation.
         */

        switch (operation) {
            case 1:
                mOut.print("" + Operation.add(argumentOne,argumentTwo));
                break;
            case 2:
                mOut.print("" + Operation.subtract(argumentOne,argumentTwo));
                break;
            case 3:
                mOut.print("" + Operation.multiply(argumentOne,argumentTwo));
                break;
            case 4:
                mOut.print( Operation.divide(argumentOne,argumentTwo)+
                        "R:"+ Operation.remainder(argumentOne,argumentTwo));
                break;
        }
    }
}
