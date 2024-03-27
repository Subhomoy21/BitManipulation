public class ithIsSetOrNot {

    static boolean IsSetLeft(int n , int x){ // using left shift operator!
        if((n&(1<<x))!=0){
            return true;
        }
        else{
            return false;
        }
    }
    static boolean isSetRight(int n , int x){ // using the right shift operator
        if(((n>>x)&1) == 0){
            return false;
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println(IsSetLeft(13, 2));
        System.out.println(IsSetLeft(13, 1));
        System.out.println(isSetRight(13, 2));
        System.out.println(isSetRight(13, 1));
    }
}
