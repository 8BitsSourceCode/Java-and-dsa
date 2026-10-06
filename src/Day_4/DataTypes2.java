package Day_4;

public class DataTypes2 {
    public static void main(String[] args){
        byte a = 100;
        byte b = 20;
       // byte c = (a+b);
        System.out.println();
      /*  byte
        1 byte
        -128 → 127
        Specialized 8-bit data

        short
        2 bytes
                -32768 → 32767
        Rarely needed in normal code

        int ⭐
        4 bytes
                -2³¹ → 2³¹-1
        Normal integers

        long
        8 bytes
                -2⁶³ → 2⁶³-1
        Very large integers

        float
        4 bytes
        ~6–7 significant digits
        32-bit decimal

        double ⭐
        8 bytes
        ~15–16 significant digits
        Normal decimal calculations

        char
        2 bytes
        0 → 65535
        UTF-16 code unit

        boolean
        true / false
        Conditions and flags

                String
        Reference type
        Text

                Array
        Reference type
        Multiple values

        Class/Object
        Reference type
        Custom objects
                */

        int age = 21;             // ✅ normal
        int count = 100;          // ✅ normal
        int marks = 95;           // ✅ normal

        long population = 8_000_000_000L;  // large integer

        double price = 99.99;     // decimal
        float x = 10.5f;          // when float is appropriate

        char grade = 'A';         // one character
        boolean passed = true;    // true/false

        String name = "jack";   // text
    }
}
