public class TypeCasting {
    public static void main(String[] args) {
        
        // BYTE to SHORT, INT, LONG, FLOAT, DOUBLE
        byte b = 10;
        short s = b;      // widening
        int i = s;        // widening
        long l = i;       // widening
        float f = l;      // widening
        double d = f;     // widening
        
        System.out.println("Widening (Implicit Casting):");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        System.out.println("\nNarrowing (Explicit Casting):");

        // DOUBLE to FLOAT, LONG, INT, SHORT, BYTE
        double d2 = 123.456;
        float f2 = (float) d2;   // narrowing
        long l2 = (long) f2;     // narrowing
        int i2 = (int) l2;       // narrowing
        short s2 = (short) i2;   // narrowing
        byte b2 = (byte) s2;     // narrowing

        System.out.println("double: " + d2);
        System.out.println("float: " + f2);
        System.out.println("long: " + l2);
        System.out.println("int: " + i2);
        System.out.println("short: " + s2);
        System.out.println("byte: " + b2);

        System.out.println("\nCHAR and BOOLEAN Type Casting:");

        // CHAR to INT (widening)
        char ch = 'A';
        int chInt = ch;
        System.out.println("char: " + ch + " -> int: " + chInt); // 65

        // INT to CHAR (narrowing)
        int intVal = 66;
        char charFromInt = (char) intVal;
        System.out.println("int: " + intVal + " -> char: " + charFromInt); // B

        // Note: boolean cannot be casted to any other type in Java
        boolean bool = true;
        System.out.println("boolean: " + bool + " (no casting allowed)");
    }
}

