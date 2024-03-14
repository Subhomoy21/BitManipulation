public class binary2decimal {
    static int convert2decimal(String s){
        int n = s.length();
        int pow = 1;
        int num = 0;
        for (int j = n-1; j >= 0 ; j--) {
            if(s.charAt(j) == '1'){
                num = num + pow;
            }
            pow = pow * 2;
        }
        return num;
    }
    public static void main(String[] args) {
        String s = "1101";
        System.out.println(convert2decimal(s));
    }
}
