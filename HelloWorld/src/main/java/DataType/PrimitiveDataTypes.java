/**
 * 
 */
package DataType;

/**
 * @author Abhijit Kumar
 *
 */

/*
 Primitive Data type are also know as Value type.
 We can't change the definition since it is pre-defined.
 Stores the value in Stack.
 Here the size is pre-defined.
 Size of the value is pre-defined.
 
 Numeric - int, short, long, float, double.
 Textual- byte, char.
 Boolean- boolean
 */
public class PrimitiveDataTypes {

	/**
	 * This is 4-times shorter than int.
	 * 
	 * Range : (-2^7) to (2^7-1)
	 * Size : 8 bits
	 * Type : Numeric
	 * Default : 0
	 * 
	 * Example : x=-10, y=100
	 */
	public void showByte() {
	
		byte sMin=(byte) (-1*Math.pow(2, 7));
		byte sMax=(byte) (1*Math.pow(2, 7)-1);
		
		System.out.println("Minimin Sort value : "+sMin);
		System.out.println("Maximum Sort value : "+sMax);
	}
	

	/**
	 * This is 2-times shorter than int.
	 * 
	 * Range : (-2^15) to (2^15-1)
	 * Size : 16 bits
	 * Type : Numeric
	 * Default : 0
	 * 
	 * Example : x=-100000, y=100000
	 */
	public void showShort() {
		
		short sMin=(short) (-1*Math.pow(2, 15));
		short sMax=(short) (1*Math.pow(2, 15)-1);
		
		
		System.out.println("Minimin Sort value : "+sMin);
		System.out.println("Maximum Sort value : "+sMax);
			
	}
	
	/**
	 * Usually used to store numeric value.
	 * 
	 * Range : (-2^31) to (2^31-1)
	 * Size : 32 bits
	 * Type : Numeric
	 * Default : 0
	 * 
	 * Example : x=-1000000, y=1000000
	 */
	public void showInt() {
		
	}

	/**
	 * Usually used to store decimal value.
	 * Can't be used to store precise value.
	 * 
	 * Range : (-2 to the power -149) to (2-2^-23).2^127
	 * Size : 32 bits
	 * Type : Decimal
	 * Default : 0.0f
	 * 
	 * Example : x=-123.4ef, y=5678.8f
	 */
	public void showFloat() {

	}
	
	
	public void showDouble() {

	}
	
	public void showChar() {

	}
	
	public void showBoolean() {

	}
	
	public void showLong() {

	}

}
