package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract extends Operation {


    //Constructor
    public  Subtract(int argument1,int argument2){
        argumentOne=argument1;
        argumentTwo=argument2;
    }

    //Method
    public int calculate(){
        return argumentOne-argumentTwo;
    }
}
