import java.util.HashMap;
import java.util.Scanner;

public class FirstCharUnique{
    public static int findFirsUnique(String s){
        HashMap<Character ,Integer> mp = new HashMap<>();
        for(int i = 0 ; i < s.length() ;i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i),0 ) +1);
        }
        for(int i = 0 ; i < s.length() ;i++){
            if(mp.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap input : ");
        String input = sc.nextLine();

        System.out.println("Output : " + findFirsUnique(input));
    }
}