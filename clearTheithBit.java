public class clearTheithBit {
    static int clearithBit(int n , int i){
        int shift = (1<<i);
        int comp = ~(shift);
        return (n & (comp));
    }
    public static void main(String[] args) {
        System.out.println(clearithBit(13, 2)); // 9(o/p)
    }
}
