public class SwapingWithOutUsingThirdVariables {

public static void main(String args[]){


            // Initializing variables of different types
            int intVar1 = 5, intVar2 = 10;
            float floatVar1 = 1.5f, floatVar2 = 2.5f;
            double doubleVar1 = 10.5, doubleVar2 = 20.5;
            char charVar1 = 'A', charVar2 = 'B';
            byte byteVar1 = 1, byteVar2 = 2;
            short shortVar1 = 100, shortVar2 = 200;
            long longVar1 = 1000L, longVar2 = 2000L;
            boolean booleanVar1 = true, booleanVar2 = false;

            // Before Swapping
            System.out.println("Before Swapping:");
            System.out.println("intVar1: " + intVar1 + ", intVar2: " + intVar2);
            System.out.println("floatVar1: " + floatVar1 + ", floatVar2: " + floatVar2);
            System.out.println("doubleVar1: " + doubleVar1 + ", doubleVar2: " + doubleVar2);
            System.out.println("charVar1: " + charVar1 + ", charVar2: " + charVar2);
            System.out.println("byteVar1: " + byteVar1 + ", byteVar2: " + byteVar2);
            System.out.println("shortVar1: " + shortVar1 + ", shortVar2: " + shortVar2);
            System.out.println("longVar1: " + longVar1 + ", longVar2: " + longVar2);
            System.out.println("booleanVar1: " + booleanVar1 + ", booleanVar2: " + booleanVar2);

            // Swap int variables using arithmetic (no temporary variable)
            intVar1 = intVar1 + intVar2;
            intVar2 = intVar1 - intVar2;
            intVar1 = intVar1 - intVar2;

            // Swap float variables using arithmetic (no temporary variable)
            floatVar1 = floatVar1 + floatVar2;
            floatVar2 = floatVar1 - floatVar2;
            floatVar1 = floatVar1 - floatVar2;

            // Swap double variables using arithmetic (no temporary variable)
            doubleVar1 = doubleVar1 + doubleVar2;
            doubleVar2 = doubleVar1 - doubleVar2;
            doubleVar1 = doubleVar1 - doubleVar2;

            // Swap char variables using arithmetic (no temporary variable)
            charVar1 = (char) (charVar1 + charVar2);
            charVar2 = (char) (charVar1 - charVar2);
            charVar1 = (char) (charVar1 - charVar2);

            // Swap byte variables using arithmetic (no temporary variable)
            byteVar1 = (byte) (byteVar1 + byteVar2);
            byteVar2 = (byte) (byteVar1 - byteVar2);
            byteVar1 = (byte) (byteVar1 - byteVar2);

            // Swap short variables using arithmetic (no temporary variable)
            shortVar1 = (short) (shortVar1 + shortVar2);
            shortVar2 = (short) (shortVar1 - shortVar2);
            shortVar1 = (short) (shortVar1 - shortVar2);

            // Swap long variables using arithmetic (no temporary variable)
            longVar1 = longVar1 + longVar2;
            longVar2 = longVar1 - longVar2;
            longVar1 = longVar1 - longVar2;

            // Swap boolean variables using XOR (works only for booleans)
            booleanVar1 = booleanVar1 != booleanVar2;
            booleanVar2 = booleanVar1 != booleanVar2;
            booleanVar1 = booleanVar1 != booleanVar2;

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


