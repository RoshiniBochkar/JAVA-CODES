import java.util.*;
public class Operators {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("===Arithmetic Operations===");
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));
        System.out.println("a++ = " + (++a));
        System.out.println("b-- = " + (--b));

        int c = scan.nextInt();
        int d = scan.nextInt();
        System.out.println("===InstanceOf Operators===");
        System.out.println("a = b = " + (c=d));
        System.out.println("a += b = " + (c+=d));
        System.out.println("a -= b = " + (c-=d));
        System.out.println("a *= b = " + (c*=d));
        System.out.println("a /= b = " + (c/=d));
        System.out.println("a %= b = " + (c%=d));

        int e = scan.nextInt();
        int f = scan.nextInt();
        System.out.println("===Relational Operators===");
        System.out.println("a == b = " + (e==f));
        System.out.println("a >= b = " + (e>=f));
        System.out.println("a <= b = " + (e<=f));
        System.out.println("a != b = " + (e!=f));
        System.out.println("a > b = " + (e>f));
        System.out.println("a < b = " + (e<f));

        int g = scan.nextInt();
        int h = scan.nextInt();
        System.out.println("===Logical Operators===");
        System.out.println("a > b && b > a = " + ((g > h)&& (h > g)));
        System.out.println("a > b || b > a = " + ((g > h) || (h> g)));
        System.out.println("!(a > b) = " + !(g>h));

        int i = scan.nextInt();
        int j = scan.nextInt();
        System.out.println("===Bitwise Operators===");
        System.out.println("a & b = " + (i&j));
        System.out.println("a | b = " + (i|j));
        System.out.println("a ^ b = " + (i^j));
        System.out.println("~ b = " + (~j));
        System.out.println("~ a = " + (~i));
        System.out.println("a << b = " + (i<<j));
        System.out.println("a >> b = " + (i>>j));
        System.out.println("b << a = " + (j<<i));
        System.out.println("b >> a = " + (j>>i));
    }
}
