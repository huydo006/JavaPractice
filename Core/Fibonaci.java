// Fibonaci less than number n
import java.util.Vector;

public class Fibonaci {
    public static Vector<Integer> Solution(int n){
        Vector<Integer> rs = new Vector<>();
        rs.add(0);
        rs.add(1);

        
        while (true) {
            int nextVal = rs.get(rs.size()-1) + rs.get(rs.size()-2);
            if(nextVal >= n){
                break;
            }
            rs.add(nextVal);
        }
        return rs;
    }
    public static void main(String[] args) {
        Vector<Integer>rs = Solution(10);
        System.out.print(rs);

    }
}
