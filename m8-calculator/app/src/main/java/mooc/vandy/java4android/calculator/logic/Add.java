package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add extends Operation {


    //Constructor
    public  Add(int argument1,int argument2){
          argumentOne=argument1;
          argumentTwo=argument2;
      }

     //Method
    public int calculate(){
        return argumentOne+argumentTwo;
    }
}
