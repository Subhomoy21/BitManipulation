/**
 * countsetbits
 */
public class countsetbits {
    static int countSetBits(int n){
        int count = 0;
        while(n>1){
            count = count + (n&1);
            n = n>>1; //(n=n/2)
        }
        if(n==1){
            count = count + 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(13));
    }
}