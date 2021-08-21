package mooc.vandy.java4android.calculator.logic;

abstract class  Operation {
   //instance variable for subclasses
    int argumentOne;
    int argumentTwo;

    //abstract method for subclasses
    public abstract int calculate();

    //Static method

    public static int add(int argument1,int argument2 ) {                            //Method to add
      Add object = new Add(argument1, argument2);
      return object.calculate();
    }
    public static int subtract (int argument1,int argument2 ) {                 //Method to subtract
        Subtract object = new Subtract(argument1, argument2);
        return object.calculate();
    }
    public static int multiply(int argument1,int argument2 ) {                  //Method to multiply
        Multiply object = new Multiply(argument1, argument2);
        return object.calculate();
    }
    public static int divide(int argument1,int argument2 ) {                      //Method to divide
        Divide object = new Divide(argument1, argument2);
        return object.calculate();
    }
    public static int remainder(int argument1,int argument2 ) {           //Method to find remainder
        return  argument1%argument2;
    }




}
