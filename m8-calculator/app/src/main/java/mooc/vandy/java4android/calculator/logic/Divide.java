package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide extends Operation{


    //Constructor
    public  Divide(int argument1,int argument2){
        argumentOne=argument1;
        argumentTwo=argument2;
    }

    //Method
    public int calculate(){
        return argumentOne/argumentTwo;
    }
}

