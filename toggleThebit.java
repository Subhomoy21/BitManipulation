public class toggleThebit {
    static int toggle(int n , int i){
            return ((n ^(1<<i)));
    }
    public static void main(String[] args) {
        System.out.println(toggle(13, 2));
        System.out.println(toggle(13, 1));
    }
}
