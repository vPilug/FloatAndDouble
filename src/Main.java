public class Main {
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println( "Float minimum value = " + myMinFloatValue);
        System.out.println( "Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println( "Double minimum value = " + myMinDoubleValue);
        System.out.println( "Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println( "myIntValur= " +myIntValue);
        System.out.println( "myFloatValue = " +myFloatValue);
        System.out.println( "myDoubleValue = " +myDoubleValue);

//        int kilograms = 200;
//        double pounds = 0.45359237;
//        double convertKilograms = kilograms * pounds;
//        System.out.println("convertKilograms = " +convertKilograms);

        double pounds = 200d;
        double convertedKilograms = pounds * 0.45359237d;
        System.out.println("ConvertedKilograms = " + convertedKilograms);
    }
}