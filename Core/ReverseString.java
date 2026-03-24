public class ReverseString {
    public static void Solve(char[] s){
        char temp;
        int left = 0;
        int right = s.length-1;
        while(left < right){
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char[] s ={'h' , 'e' , 'l' ,'l' ,'o'};
        Solve(s);
        for(int i = 0 ; i < s.length ;i++){
            System.out.print(s[i]+" ");
        }
    }
}