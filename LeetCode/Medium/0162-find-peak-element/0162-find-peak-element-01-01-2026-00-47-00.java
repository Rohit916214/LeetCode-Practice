class Solution {
    public int findPeakElement(int[] nums) {

        int prev = nums[0];
        boolean found = false;
        int ans = 0;
        for(int i = 1 ; i < nums.length; i++){
            if(prev > nums[i]){
                found = true;
                return i-1;
            }
            prev = nums[i];

            ans = i;
        }

        if(found==false){
            return ans;
        }
        return 0;
        
    }
}