public class setTheithBit{
    static int setIth(int n , int i){
        return ((n | (1<<i)));
    }
    public static void main(String[] args) {
        System.out.println(setIth(9,2));
    }
}
