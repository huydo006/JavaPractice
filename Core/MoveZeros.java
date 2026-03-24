public class MoveZeros {
    public static void Solve(int[] nums){
        int slow = 0 ; 
        int fast =0 ;
        while (fast<nums.length){
            if(nums[fast]!=0){
                nums[slow++]=nums[fast];
            }
            fast++;
        }
        while(slow<nums.length){
            nums[slow++]=0;
        }
    }
    public static void main(String[] args) {
        int[] nums ={0 , 1, 0 , 9 , 6 , 5};
        Solve(nums);
        for(int i = 0 ; i< nums.length ;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
