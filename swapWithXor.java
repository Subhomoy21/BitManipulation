/**
 * swapWithXor
 */
public class swapWithXor {

    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        // swap a to b and b to a
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);
    }
}