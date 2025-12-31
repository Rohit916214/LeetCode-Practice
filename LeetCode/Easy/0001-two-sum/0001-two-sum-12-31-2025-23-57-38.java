import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target)
                {
                    return new int[]{i,j};
                }else{
                    continue;
                }
            }
        }
        return new int[]{};
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int target=input.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = input.nextInt();
        }

        Solution obj = new Solution();
        obj.twoSum(nums,target);
    }
}