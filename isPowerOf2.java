public class isPowerOf2 {
    static boolean IsPower2(int n){
        if(n<=0){
            return false;
        }
        return ((n & (n-1)) == 0);
    }
    public static void main(String[] args) {
        System.out.println(IsPower2(16));
    }
}
