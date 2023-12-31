package lesson2;

public class Variables {

    public static void main(String[] args) {
        /*
         1 byte == 8 bit
         long - 64 bit or 8 byte
         int - 32 bit or 4 byte
         short - 16 bit or 2 byte.
         byte - 8 bit or 1 byte
         double - 64 bit or 8 byte
         float - 32 bit or 4 byte
         char - 1 character
        */

        int myInt; // variable declaration
        myInt = 557; // variable initialization
        System.out.println(myInt);

        int myInt2 = 1000; // var declare and init in one line
        System.out.println(myInt2);

        short myShort = 10000;
        System.out.println("Short: " + myShort);

        long myLong = 1_000_000_000; // billion
        System.out.println("Long: " + myLong);

        byte myByte = 1;
        System.out.println("Byte: " + myByte);

        // ---
        double myDouble = 1123.13123;
        System.out.println("Double: " + myDouble);

        float myFloat = 131.3123f;
        System.out.println("Float: " + myFloat);

        // ---

        String myString = "some string";
        System.out.println("String: " + myString);

        char myChar = 'A';
        System.out.println("Char: " + myChar);

        // ---

        boolean myBoolean = true;
        System.out.println("Boolean: " + myBoolean);
    }

}
