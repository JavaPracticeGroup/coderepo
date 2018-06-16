import DataType.PrimitiveDataType;
import DataType.TypeCasting;

class Demonstrate {

	public static void primitiveDataTypes() {
		PrimitiveDataType pDT = new PrimitiveDataType();
		//pDT.showByte();
		// pDT.showShort();
		 pDT.showInt();
		// pDT.showLong();
		// pDT.showChar();
		// pDT.showFloat();
		// pDT.showDouble();
		// pDT.showBoolean();

		pDT.showByteClass();
		pDT.showShortClass();
		pDT.showIntClass();
		pDT.showLongClass();
		pDT.showCharClass();
		pDT.showFloatClass();
		pDT.showDoubleClass();
		pDT.showBooleanClass();

	}
	
	public static void typeCasting() {
		TypeCasting typeCasting = new TypeCasting();
		typeCasting.byteToShort();
	}

}
