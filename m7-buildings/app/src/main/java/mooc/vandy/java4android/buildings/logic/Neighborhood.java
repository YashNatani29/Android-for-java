package mooc.vandy.java4android.buildings.logic;

import java.io.FileNotFoundException;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor.
 */
public final class Neighborhood {

    // no instance variables

    private Neighborhood(){} // private constructor

    public static void print(Building[] buildings, String header, OutputInterface out){              // static method to print

        out.println(header);
        out.println("----------");

        for(Building building : buildings )
             out.println(building.toString());

    }

    public static int calcArea(Building[] buildings)                                                 // static method to calculate area
    {   int totalArea=0;

        for(Building area : buildings )
            totalArea+=area.calcLotArea();

       return totalArea;

    }

}
