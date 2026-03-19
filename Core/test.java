public class test {
    public static void main(String[] args) {
        String s= "1@kiohihihi";
        for(int i = 0 ; i < s.length() ;i++){
            System.out.print(Character.isLetterOrDigit(s.charAt(i)) + " ");
        }
        
    }
}
