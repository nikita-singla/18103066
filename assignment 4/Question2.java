import java.util.Scanner;
import java.util.*;
import java.lang.Math.*;
class Question2
{
    public static void main(String[] args)
    {
        int num = -1;
        byte b = (byte)num;
        int n = b;
        char c = (char)b, c1 = (char)n;
        int final_num = c;
        System.out.println("Initial integer: "+ num);
        System.out.println("Byte: "+ b + " " + n + " " + c1);
        System.out.println("Character: "+ c);
        System.out.println("Final integer: "+ final_num);
    }
}

// A. Int to byte: Range of byte: -2^7 to 2^7 +1 because bite is signed
// Therefore -1 remains -1. If something out of range
// would be there then 2^8 is added or subtracted until it falls
// into range. For example, for int -255, it shows 1, after adding 2^8
// ie -255 + 256 = 1.
// B. Byte to char: The byte is first converted to int and then
// int is converted to char.
// C. char to int: char is of 16 bits whereas int is of 32 bits.So, the
// answer is 2^16 - value of char