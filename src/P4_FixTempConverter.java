/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 What were the errors you found?
 
 I think the formula was placed in the wrong place. The moved it and placed a return call at the end of the code.
 
 */

public class P4_FixTempConverter {
	public static void main(String[] args) {
		double tempf = 98.6;
		double tempc = (tempf - 32) * 5 / 9;
		
		System.out.println("Body temp in C is: " + tempc);
	}
	// converts Fahrenheit temperatures to Celsius
	public static double ftoc(double tempf, double tempc) {
	  
	      return  tempc; 
    }
}
