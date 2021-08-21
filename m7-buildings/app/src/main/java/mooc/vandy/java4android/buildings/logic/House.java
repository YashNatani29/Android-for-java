package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House
       extends Building {

    private String mOwner ;
    private  boolean mPool;

    // constructors
    public House(int length, int width, int lotLength, int lotWidth){                                //constructor 1
       super(length,width,lotLength,lotWidth);
   }
   public House(int length, int width, int lotLength, int lotWidth, String owner){                   //constructor 2
       super(length,width,lotLength,lotWidth);
       mOwner=owner;
   }
  public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool){      //constructor 3
      this(length,width,lotLength,lotWidth,owner);
      mPool=pool;
  }

  //Methods

     public String getOwner() {
       return mOwner;
   }
     public boolean hasPool(){
       return mPool;
    }

     public void setOwner(String owner) {
       mOwner=owner;
    }
     public void setPool(boolean pool){
       mPool=pool;
   }

     public String toString() {
        String result="Owner: n/a";

         if(mOwner!=null)
           result="Owner: "+mOwner;

         if (mPool)
           result=result.concat("; has a pool");

         if(this.calcLotArea()>this.calcBuildingArea())
           result=result.concat("; has a big open space");

       return result;
    }

    public boolean equals(Object other){
       boolean result =false;

       if (other instanceof House){
            House otherHouse = (House)other;
            result= (otherHouse.calcBuildingArea() == this.calcBuildingArea() && this.mPool==otherHouse.mPool);
        }

        return result;
   }

}
