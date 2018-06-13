public class FloatAndDouble {
    public static void main(String[] args) {

        // width of int is 32(4 bytes)

        int myValue = 5 / 2;

        //width of float is 32(4 bytes)
        float myFloatValue = 5f / 3f;

        //width of float is 64 (8bytes)
        double myDoubleValue  = 5d / 3d;


        // double precision is faster, java is more popular, precise etc(recommended)


        System.out.println("my int value = "  + myValue);
        System.out.println("my float value = " + myFloatValue);
        System.out.println("my double value = " + myDoubleValue);

        //float has '7' digits of precision
        // double has '16' digits of precision
        // if we don't specify the 'f' or 'd' is actually double

        double poundsValue = 200d;
        double kilogram = 0.45359237d;
        float calculateToKiloGramsF = ((float) (poundsValue * kilogram));
        double calculateToKilogramsD = poundsValue * kilogram;

        System.out.println(poundsValue + " is equal to: " + calculateToKilogramsD + " kilograms ");
        //200.0 is equal to: 90.718474 kilograms


        double pi = 3.141_592_65369d;
    }
}

