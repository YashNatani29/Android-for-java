package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage
       extends House {

    boolean mSecondFloor ;

    // constructors
    public Cottage(int dimension, int lotLength, int lotWidth){                                     // constructor 1
        super(dimension,dimension,lotLength,lotWidth);
    }
    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor)   // constructor 2
    {   super(dimension,dimension,lotLength,lotWidth,owner);
        mSecondFloor=secondFloor;
    }

   //Methods
    public boolean hasSecondFloor() { return mSecondFloor; }

    public String toString(){
      String result = super.toString();

      if (mSecondFloor)
        result=result.concat("; is a two story cottage");

     return result;
    }
}

