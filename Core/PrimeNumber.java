import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public static boolean CheckPrimeNumber(int n){
        if(n<1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        for(int i = 2 ; i < n ;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static List<Integer> Solution(int nums){
        List<Integer> rs = new ArrayList<Integer>();
        for(int i = 0 ; i <nums ;i++){
            if(CheckPrimeNumber(i)){
                rs.add(i);
            }
        }
        return rs;
    }
    public static void main(String[] args) {
        // System.out.println(CheckPrimeNumber(24));
        List<Integer> rs = Solution(20);
        System.out.print(rs);
    }
}
