import java.util.*;
public class TypeConversion {
    public static void main(String[] a){

        Scanner scan = new Scanner(System.in);
        System.out.print("byte = ");
        byte b = scan.nextByte();
        System.out.print("short = ");
        short s = scan.nextShort();
        System.out.print("int = ");
        int i = scan.nextInt();
        System.out.print("long = ");
        long l = scan.nextLong();
        System.out.print("float = ");
        float f = scan.nextFloat();
        System.out.print("double = ");
        double d = scan.nextDouble();
        System.out.print("char = ");
        char c = scan.next().charAt(0);

        //int to byte
        System.out.println("int to byte: " + (byte) i);
        //long to byte
        System.out.println("long to byte: " + (byte) l);
        //long to int
        System.out.println("long to int: " + (int) l);
        //float to int
        System.out.println("float to int: " + (int) f);
        //double to float
        System.out.println("double to float: " + (float) d);
        //char to int
        System.out.println("char to int: " + (int) c);
        //byte to int
        System.out.println("byte to int: " + b);
        //int to long
        System.out.println("long to int: " + i);
        //float to doubt
        System.out.println("float to double: " + f);
        //byte to short
        System.out.println("short to byte: " + b);
        //int to char
        System.out.println("int to char: " + c);
    }
}
