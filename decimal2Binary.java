public class decimal2Binary {
    static String convertToBinary(int n){
        String res = "";
        while(n!=0){
            if(n%2==1){
                res = res + '1';
            }
            else{
                res = res + '0';
            }
            n = n/2;
        }
        return  reverse(res);
      //  return res;
    }
    static String reverse(String s){
        char str[] = s.toCharArray();
        int st = 0;
        int end = str.length-1;
        while(end>st){
            char temp = str[st] ;
            str[st] = str[end];
            str[end] = temp;
            st++;
            end--;
        }
        return new String(str);
    }
public static void main(String[] args) {
    int n = 13;
    System.out.println(convertToBinary(n));
}   
}