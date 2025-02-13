public class S {

    public static void main(String[] args) {

        // Initializing variables of different types
        int intVar1 = 5, intVar2 = 10;
        float floatVar1 = 1.5f, floatVar2 = 2.5f;
        double doubleVar1 = 10.5, doubleVar2 = 20.5;
        char charVar1 = 'A', charVar2 = 'B';
        byte byteVar1 = 1, byteVar2 = 2;
        short shortVar1 = 100, shortVar2 = 200;
        long longVar1 = 1000L, longVar2 = 2000L;
        boolean booleanVar1 = true, booleanVar2 = false;

        // Swapping the values using a temporary variable for all types
        System.out.println("Before Swapping:");
        System.out.println("intVar1: " + intVar1 + ", intVar2: " + intVar2);
        System.out.println("floatVar1: " + floatVar1 + ", floatVar2: " + floatVar2);
        System.out.println("doubleVar1: " + doubleVar1 + ", doubleVar2: " + doubleVar2);
        System.out.println("charVar1: " + charVar1 + ", charVar2: " + charVar2);
        System.out.println("byteVar1: " + byteVar1 + ", byteVar2: " + byteVar2);
        System.out.println("shortVar1: " + shortVar1 + ", shortVar2: " + shortVar2);
        System.out.println("longVar1: " + longVar1 + ", longVar2: " + longVar2);
        System.out.println("booleanVar1: " + booleanVar1 + ", booleanVar2: " + booleanVar2);

        // Swap int variables
        int tempInt = intVar1;
        intVar1 = intVar2;
        intVar2 = tempInt;

        // Swap float variables
        float tempFloat = floatVar1;
        floatVar1 = floatVar2;
        floatVar2 = tempFloat;

        // Swap double variables
        double tempDouble = doubleVar1;
        doubleVar1 = doubleVar2;
        doubleVar2 = tempDouble;

        // Swap char variables
        char tempChar = charVar1;
        charVar1 = charVar2;
        charVar2 = tempChar;

        // Swap byte variables
        byte tempByte = byteVar1;
        byteVar1 = byteVar2;
        byteVar2 = tempByte;

        // Swap short variables
        short tempShort = shortVar1;
        shortVar1 = shortVar2;
        shortVar2 = tempShort;

        // Swap long variables
        long tempLong = longVar1;
        longVar1 = longVar2;
        longVar2 = tempLong;

        // Swap boolean variables (boolean variables are tricky and can't be swapped like other types)
        boolean tempBoolean = booleanVar1;
        booleanVar1 = booleanVar2;
        booleanVar2 = tempBoolean;

        // After Swapping
        System.out.println("\nAfter Swapping:");
        System.out.println("intVar1: " + intVar1 + ", intVar2: " + intVar2);
        System.out.println("floatVar1: " + floatVar1 + ", floatVar2: " + floatVar2);
        System.out.println("doubleVar1: " + doubleVar1 + ", doubleVar2: " + doubleVar2);
        System.out.println("charVar1: " + charVar1 + ", charVar2: " + charVar2);
        System.out.println("byteVar1: " + byteVar1 + ", byteVar2: " + byteVar2);
        System.out.println("shortVar1: " + shortVar1 + ", shortVar2: " + shortVar2);
        System.out.println("longVar1: " + longVar1 + ", longVar2: " + longVar2);
        System.out.println("booleanVar1: " + booleanVar1 + ", booleanVar2: " + booleanVar2);
    }
}
