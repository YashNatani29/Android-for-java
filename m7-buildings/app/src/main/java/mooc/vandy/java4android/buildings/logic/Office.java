package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office
       extends Building {

    private String mBusinessName ;
    private int mParkingSpaces ;
    private static int sTotalOffices;

    // constructors
    public  Office(int length, int width, int lotLength, int lotWidth){                             // constructor 1
       super(length,width,lotLength,lotWidth);
        sTotalOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName){         // constructor 2
       super(length,width,lotLength,lotWidth);
        mBusinessName=businessName;
        sTotalOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth,                               // constructor 3
                  String businessName, int parkingSpaces) {
       this(length,width,lotLength,lotWidth,businessName);
       mParkingSpaces=parkingSpaces;
       sTotalOffices++;
    }

    //Methods
    public String getBusinessName() { return mBusinessName; }
    public int getParkingSpaces() { return mParkingSpaces; }

    public static  int getTotalOffices(){ return sTotalOffices; }

    public void setBusinessName(String businessName) { mBusinessName=businessName; }
    public void setParkingSpaces(int parkingSpaces) { mParkingSpaces=parkingSpaces; }

    public String toString(){
        String result="Business: unoccupied ";

        if(mBusinessName!=null)
            result = "Business: " + mBusinessName;

        if(mParkingSpaces>0)
            result=result.concat("; has "+mParkingSpaces+" parking spaces ");

        result=result.concat("(total offices: "+sTotalOffices+")");

        return result;
    }

    public boolean equals(Object other){
        boolean result =false;

        if (other instanceof Office){
            Office otherOffice = (Office)other;
            result= (otherOffice.calcBuildingArea() == this.calcBuildingArea() &&
                      otherOffice.mParkingSpaces == this.mParkingSpaces);
        }

        return result;
    }
}
