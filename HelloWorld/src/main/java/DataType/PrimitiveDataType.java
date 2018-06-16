/**
 * 
 */
package DataType;

import java.util.Scanner;

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
 
 Class level variable - No initialization required (Default value exist)
 Method level variable - Initialization required
 
 Numeric - int, short, long, float, double.
 Textual- byte, char.
 Boolean- boolean
 */
public class PrimitiveDataType {
	
	static Scanner input = new Scanner(System.in);

	/* Variable is a named location in memory to store a value */
	
	/**
	 * The range of a data type can be calculated as follows
	 * 
	 * Minimum Value ->   -2 ^ (Bits - 1)
	 * 
	 * Maximum Value ->   ( 2 ^ (Bits -1) ) -1 
 	 * 
 	 * For eg, Byte -> 8 bits
 	 * 
 	 * Min Value -> -2^(8-1)       -> -2^7         ->   -128
 	 * Max Value -> (2^(8-1)) -1   ->  (2^7) -1    ->   128-1    -> 127
 	 * 
	 */
	
	
	/**
	 * 
	 * 2^8
	 * 
	 * Range - -128 to 127 
	 */

	public void showByte() {
		System.out.println("Enter any byte:");
		byte byteVal = input.nextByte();
		System.out.println("The Byte you have typed: " + byteVal);
	}

	public void showShort() {
		System.out.println("Enter any short number:");
		short ShortVal = input.nextShort();
		System.out.println("The Short you have typed: " + ShortVal);
	}

	/**
	 * Type -> Primitive > Numeric > Integral > Integer Default value - 0
	 * Default size - 4byte
	 */
	public void showInt() {
		System.out.println("Enter any int number:");
		int intVal = input.nextInt();
		System.out.println("The integer you have typed: " + intVal);
	}

	public void showLong() {
		System.out.println("Enter any long number:");
		Long longVal = new Long(input.nextLong());
		System.out.println("The Long you have typed: " + longVal.intValue());
	}

	public void showChar() {
		System.out.println("Enter any character:");
		Character characterVal = new Character(input.next().charAt(0));
		System.out.println("The Character you have typed: " + characterVal.charValue());
	}

	public void showFloat() {
		System.out.println("Enter any number with decimals:");
		Float floatVal = new Float(input.nextFloat());
		System.out.println("The Float you have typed: " + floatVal.floatValue());
	}

	public void showDouble() {
		System.out.println("Enter any number with decimals:");
		Double doubleVal = new Double(input.nextDouble());
		System.out.println("The Double you have typed: " + doubleVal.doubleValue());
	}

	public void showBoolean() {
		System.out.println("Enter any value:");
		Boolean booleanVal = new Boolean(input.nextBoolean());
		System.out.println("The Boolean you have typed: " + booleanVal.booleanValue());
	}

	/**
	 * 
	 * MIN     : -128
	 * MAX     :  127
	 * TYPE    :  Primitive > Numeric > Integral > Integer > byte
	 * SIZE    :  8 (1 byte)
	 * DEFAULT :  0
	 * 
	 */

	public void showByteClass() {
		System.out.println("Enter any byte:");
		Byte byteVal = new Byte(input.nextByte());

		System.out.println("The Byte you have typed: " + byteVal.byteValue());
		System.out.println("Type:  " + Byte.TYPE);
		System.out.println("Bytes: " + Byte.BYTES);
		System.out.println("Minimum Value: " + Byte.MIN_VALUE);
		System.out.println("Maximum Value: " + Byte.MAX_VALUE);
		System.out.println("Size: " + Byte.SIZE);
	}
	
	
	/**
	 * 
	 * MIN     : -32768
	 * MAX     :  32767
	 * TYPE    :  Primitive > Numeric > Integral > Integer > short
	 * SIZE    :  16 (2 Byte)
	 * DEFAULT :  0
	 * 
	 */
	
	public void showShortClass() {
		System.out.println("Enter any short number:");
		Short shortVal = new Short(input.nextShort());

		System.out.println("The Short you have typed: " + shortVal.shortValue());
		System.out.println("Type: " + Short.TYPE);
		System.out.println("Shorts: " + Short.BYTES);
		System.out.println("Minimum Value: " + Short.MIN_VALUE);
		System.out.println("Maximum Value: " + Short.MAX_VALUE);
		System.out.println("Size: " + Short.SIZE);
	}


	/**
	 * 
	 * MIN     : -32768
	 * MAX     :  32767
	 * TYPE    :  Primitive > Numeric > Integral > Integer > int	
	 * SIZE    :  32 (4 Byte)
	 * DEFAULT :  0
	 * 
	 */
	
	public void showIntClass() {
		System.out.println("Enter any int number:");
		Integer intVal = new Integer(input.nextInt());

		System.out.println("The integer you have typed: " + intVal.intValue());
		System.out.println("Type: " + Integer.TYPE);
		System.out.println("Bytes: " + Integer.BYTES);
		System.out.println("Minimum Value: " + Integer.MIN_VALUE);
		System.out.println("Maximum Value: " + Integer.MAX_VALUE);
		System.out.println("Size: " + Integer.SIZE);

	}

	
	/**
	 * 
	 * MIN     : -9223372036854775808
	 * MAX     :  9223372036854775807
	 * TYPE    :  Primitive > Numeric > Integral > Integer > long	
	 * SIZE    :  64 (8 Byte)
	 * DEFAULT :  0L
	 * 
	 */
	
	public void showLongClass() {
		System.out.println("Enter any long number:");
		Long longVal = new Long(input.nextLong());

		System.out.println("The Long you have typed: " + longVal.longValue());
		System.out.println("Type: " + Long.TYPE);
		System.out.println("Longs: " + Long.BYTES);
		System.out.println("Minimum Value: " + Long.MIN_VALUE);
		System.out.println("Maximum Value: " + Long.MAX_VALUE);
		System.out.println("Size: " + Long.SIZE);
	}

	
	/**
	 * 
	 * MIN     :  0
	 * MAX     :  65535
	 * TYPE    :  Primitive > Numeric > Character > char	
	 * SIZE    :  16 (2 Byte)
	 * DEFAULT :  '/u0000' (Unicode) -> (Blank) 
	 * 
	 */
	public void showCharClass() {
		System.out.println("Enter any character:");
		Character characterVal = new Character(input.next().charAt(0));

		System.out.println("The Character you have typed: " + characterVal.charValue());
		System.out.println("Type: " + Character.TYPE);
		System.out.println("Characters: " + Character.BYTES);
		System.out.println("Minimum Value: " + Character.MIN_VALUE);
		System.out.println("Maximum Value: " + Character.MAX_VALUE);
		System.out.println("Size: " + Character.SIZE);
	}

	/**
	 * 
	 * MIN     :  1.4E-45
	 * MAX     :  3.4028235E38
	 * TYPE    :  Primitive > Numeric > Integral > Floating Point > float	
	 * SIZE    :  32 (4 Byte)
	 * DEFAULT :  0.0f
	 * 
	 */

	public void showFloatClass() {
		System.out.println("Enter any number with decimals:");
		Float floatVal = new Float(input.nextFloat());

		System.out.println("The Float you have typed: " + floatVal.floatValue());
		System.out.println("Type: " + Float.TYPE);
		System.out.println("Floats: " + Float.BYTES);
		System.out.println("Minimum Value: " + Float.MIN_VALUE);
		System.out.println("Maximum Value: " + Float.MAX_VALUE);
		System.out.println("Size: " + Float.SIZE);
	}

	/**
	 * 
	 * MIN     :  4.9E-324
	 * MAX     :  1.7976931348623157E308
	 * TYPE    :  Primitive > Numeric > Integral > Floating Point > double	
	 * SIZE    :  64 (8 Byte)
	 * DEFAULT :  0.0d
	 * 
	 */
	
	public void showDoubleClass() {
		System.out.println("Enter any number with decimals:");
		Double doubleVal = new Double(input.nextDouble());

		System.out.println("The Double you have typed: " + doubleVal.doubleValue());
		System.out.println("Type: " + Double.TYPE);
		System.out.println("Doubles: " + Double.BYTES);
		System.out.println("Minimum Value: " + Double.MIN_VALUE);
		System.out.println("Maximum Value: " + Double.MAX_VALUE);
		System.out.println("Size: " + Double.SIZE);
	}
	
	/**
	 * 
	 * TYPE    :  Primitive > Boolean > boolean	
	 * SIZE    :  1 bit -> 1 (true) or 0 (false)
	 * DEFAULT :  false
	 * 
	 */
	
	public void showBooleanClass() {
		System.out.println("Enter any value:");
		Boolean booleanVal = new Boolean(input.nextBoolean());

		// Boolean object can be constructed using boolean or string value
		
		Boolean boolVal = new Boolean(true);
		Boolean stringBoolVal = new Boolean("true");
		System.out.println(boolVal + "  " + stringBoolVal);
		
		// Converting Boolean to a boolean value
		System.out.println(boolVal.booleanValue());
		System.out.println(stringBoolVal.booleanValue());
		
		System.out.println("The Boolean you have typed: " + booleanVal.booleanValue());
		System.out.println("Type: " + Boolean.TYPE);
		System.out.println("True:" + Boolean.TRUE);
		System.out.println("False:" + Boolean.FALSE);
		System.out.println("Since the boolean default size is 1 bit, it doesn't have SIZE, MIN_VALUE and MAX_VALUE");
	}
}