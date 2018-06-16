package com.experiment.abhijit;

import com.system.application.AppUtil;

/**
 * 
 * @author akumar
 *
 */
public class DataTypeExperiment {

	/**
	 * When we provide value bigger than it can hold. Let take an example : In byte
	 * if we provide value bigger its max value i.e Max + 1 then it will change to
	 * its min value. This won't apply for "float" and "double". In short where ever
	 * the max is in E format.
	 * 
	 * Example where it applies : (byte byteVal=127+1 is -128 and 127+2 is -127 ...; And this loop
	 * continue... )
	 */
	public void overflowRule() {
		AppUtil.functionBreak();

		System.out.println("ByteMax = " + (byte) (Byte.MAX_VALUE));
		System.out.println("ByteMax + 1 = " + (byte) (Byte.MAX_VALUE + 1));
		System.out.println("ByteMax + 2 = " + (byte) (Byte.MAX_VALUE + 2));
		AppUtil.lineBreak();
		System.out.println("ByteMin = " + (byte) (Byte.MIN_VALUE));
		System.out.println("ByteMin - 1  = " + (byte) (Byte.MIN_VALUE - 1));
		System.out.println("ByteMin - 2  = " + (byte) (Byte.MIN_VALUE - 2));

		AppUtil.lineBreak();
		AppUtil.lineBreak();

		System.out.println("ShortMax = " + (short) (Short.MAX_VALUE));
		System.out.println("ShortMax + 1 = " + (short) (Short.MAX_VALUE + 1));
		System.out.println("ShortMax + 2 = " + (short) (Short.MAX_VALUE + 2));
		AppUtil.lineBreak();
		System.out.println("ShortMin = " + (short) (Short.MIN_VALUE));
		System.out.println("ShortMin - 1  = " + (short) (Short.MIN_VALUE - 1));
		System.out.println("ShortMin - 2  = " + (short) (Short.MIN_VALUE - 2));

		AppUtil.lineBreak();
		AppUtil.lineBreak();

		System.out.println("IntegerMax = " + (int) (Integer.MAX_VALUE));
		System.out.println("IntegerMax + 1 = " + (int) (Integer.MAX_VALUE + 1));
		System.out.println("IntegerMax + 2 = " + (int) (Integer.MAX_VALUE + 2));
		AppUtil.lineBreak();
		System.out.println("IntegerMin = " + (int) (Integer.MIN_VALUE));
		System.out.println("IntegerMin - 1  = " + (int) (Integer.MIN_VALUE - 1));
		System.out.println("IntegerMin - 2  = " + (int) (Integer.MIN_VALUE - 2));

		AppUtil.lineBreak();
		AppUtil.lineBreak();

		System.out.println("FloatMax = " + (float) (Float.MAX_VALUE));
		System.out.println("FloatMax + 1 = " + (float) (Float.MAX_VALUE + 1));
		System.out.println("FloatMax + 1234567890123456789012345678901.0f = "
				+ (float) (Float.MAX_VALUE + 1234567890123456789012345678901.0f));
		System.out.println("FloatMax == (FloatMax + 1234567890123456789012345678901.0) is "
				+ ((float) (Float.MAX_VALUE + 1234567890123456789012345678901.0) == (float) (Float.MAX_VALUE)));
		System.out.println("FloatMax == (FloatMax + 12345678901234567890123456789012.0) is "
				+ ((float) (Float.MAX_VALUE + 12345678901234567890123456789012.0) == (float) (Float.MAX_VALUE)));
		AppUtil.lineBreak();
		System.out.println("FloatMin = " + (float) (Float.MIN_VALUE));
		System.out.println("FloatMin - 1  = " + (float) (Float.MIN_VALUE - 1));
		System.out.println("FloatMin - 2  = " + (float) (Float.MIN_VALUE - 2));
		System.out.println((float) (Float.MIN_VALUE) == (float) (Float.MIN_VALUE - 2.2234343));

		AppUtil.lineBreak();
		AppUtil.lineBreak();

		System.out.println("LongMax = " + (long) (Long.MAX_VALUE));
		System.out.println("LongMax + 1 = " + (long) (Long.MAX_VALUE + 1));
		System.out.println("LongMax + 2L = " + (long) (Long.MAX_VALUE + 2L));
		AppUtil.lineBreak();
		System.out.println("LongMin = " + (long) (Long.MIN_VALUE));
		System.out.println("LongMin - 1  = " + (long) (Long.MIN_VALUE - 1));
		System.out.println("LongMin - 2  = " + (long) (Long.MIN_VALUE - 2));

		AppUtil.lineBreak();
		AppUtil.lineBreak();

		System.out.println("DoubleMax = " + (double) (Double.MAX_VALUE));
		System.out.println("DoubleMax + 1 = " + (double) (Double.MAX_VALUE + 1));
		System.out.println("DoubleMax + 2L = " + (double) (Double.MAX_VALUE + 2L));
		AppUtil.lineBreak();
		System.out.println("DoubleMin = " + (double) (Double.MIN_VALUE));
		System.out.println("DoubleMin - 1  = " + (double) (Double.MIN_VALUE - 1));
		System.out.println("DoubleMin - 2  = " + (double) (Double.MIN_VALUE - 2));

		AppUtil.functionBreak();
	}

	/**
	 * Please check overflowRule for DataType before starting DataType Conversion
	 */
	public void dataTypeConversion() {
		byte byteVal = 0;
		int intVal = 127 + 2;
		byteVal = (byte) intVal;
		System.out.println(byteVal);
	}

	public void start() {
		dataTypeConversion();
	}

}
