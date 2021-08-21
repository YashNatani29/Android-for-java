package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply extends Operation {


    //Constructor
    public  Multiply(int argument1,int argument2){
        argumentOne=argument1;
        argumentTwo=argument2;
    }

    //Method
    public int calculate(){
        return argumentOne*argumentTwo;
    }
}
