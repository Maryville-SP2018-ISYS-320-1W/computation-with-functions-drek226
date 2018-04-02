/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 1. Your output prediction (do yourself a favor and go step by step through the code, recording the value of each variable at each method call):
    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        z = mystery( x, z, y);                          1,3,2
        System.out.println( x + " " + y + " " + z);    1,2,3
        x = mystery( z, z, x);                        2,2,7
        System.out.println( x + " " + y + " " + z);1,2,3
        y = mystery( y, y, z);                     0,0,0
        System.out.println( x + " " + y + " " + z);1,2,3

    }
    
    public static int mystery( int z, int x, int y) { 
        z--;
        x = 2 * y + z;
        y = x - 2;
        System.out.println(y + " " + z );
        return x;
    }
  
 */

/*
 3. Were you correct? Explain if you were not (what did you learn?)
 
 No, I got confused when switching the values so many times between the different mystery calls. It make more sense now that I see the answer.
 */
public class P1_MysteryReturn {
	
	  public static void main(String[] args) {
	        int x = 1, y = 2, z = 3;
	        z = mystery( x, z, y);
	        System.out.println( x + " " + y + " " + z);
	        x = mystery( z, z, x);
	        System.out.println( x + " " + y + " " + z);
	        y = mystery( y, y, z);
	        System.out.println( x + " " + y + " " + z);

	    }
	    
	    public static int mystery( int z, int x, int y) {
	        z--;
	        x = 2 * y + z;
	        y = x - 2;
	        System.out.println(y + " " + z );
	        return x;
	    }


}
