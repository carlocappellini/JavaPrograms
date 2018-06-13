public class ByteShortInt {
    //Data Types Ranges//
    public static void main(String[] args) {


        //int has width of 32 space
        int minValue = -2_147_483_648; ///<---this part is called a literal(value)
        int maxValue = 2147483647;
        int total = (minValue / 4);
        System.out.println(total);

        // byte has width of 8
        byte minByteValue = -128;
        byte maxByteValue = 127;
        byte myValue = (byte) (minByteValue / 2);

        System.out.println("myNewByteValue is : " + myValue);

        // byte has a width of 16
        short minSbortValue = -32768;
        short maxShortValue = 32767;
        // long has width of 63

        short myNewShortvalue = (short) (minSbortValue / 2);


        long minLongValue = -9_223_372_036_854_775_808L;
        long maxLongValue = 9_223_372_036_854_775_807L;


        byte byteVal = 10;
        short shortVal = 20;
        int intVal = 50;

        long longTotal = 50000L + 10L * (byteVal + shortVal + intVal);
        short shotTotal = (short) (1000 + 10 * (byteVal + shortVal + intVal));
        System.out.println("Long Total Is: " + longTotal);
        System.out.println("Short Total Is: " + shotTotal);
    }
}


