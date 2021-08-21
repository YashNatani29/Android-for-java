package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {

           int number_of_lines=size*2+1;

        for(int line=1;line<=number_of_lines;line++){

           if(line==1||line==number_of_lines)                           //for first and last line
             {
               mOut.print("+");
               print_String("-",size*2);
               mOut.println("+");
             }
           else if (line<size+1)                                        //for line above mid
               print_line(line,size-line+1,line*2-4,"/","\\");
           else if (line==size+1)                                       //for mid line
               print_line(line,0,2*size-2,"<",">");
           else                                                         //for line below mid
               print_line(line,line-size-1,(size*2-line)*2,"\\","/");

       }

    }
    // helper methods are here

    // method to print given string n times
    public void print_String(String str,int n){
        for (int i = 0; i <n ; i++) {
            mOut.print(str);
        }
    }

    //method to print lines
    public void print_line(int line, int num_of_space,int num_of_hyphen,  String starting ,String closing) {
        mOut.print("|");
        print_String(" ",num_of_space);
        mOut.print(starting);
        if (line % 2 == 0)
            print_String("=",num_of_hyphen);
        else
            print_String("-",num_of_hyphen);

        mOut.print(closing);
        print_String(" ",num_of_space);
        mOut.println("|");

    }
}