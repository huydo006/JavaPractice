

class ValidParindrone {
    static boolean checkValidParindrone(String s){
        int left = 0;
        int right = s.length()-1;
        while (left <right) {
            char charL = s.charAt(left);
            char charR = s.charAt(right);
            
            //Check charL và charR nếu k phải chữ số thì next
            if(!Character.isLetterOrDigit(charL)){
                left++;
            }
            else if (!Character.isLetterOrDigit(charR)) {
                right--;
            }

            //Chuyển về dạng chữ thường và so sánh
            else{
                if(Character.toLowerCase(charL)!=Character.toLowerCase(charR)){
                    return false;
                }
                left++;
                right--;
            }
            
        }
        return true;

    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(checkValidParindrone(s));

    }
    
}