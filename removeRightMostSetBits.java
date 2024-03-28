/**
 * removeRightMostSetBits
 */
public class removeRightMostSetBits {
    static int removeLastSetBit(int n){
        return (n & (n-1));
    }
    public static void main(String[] args) {
        System.out.println(removeLastSetBit(40));
    }
}