/*
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

*/

class Solution {
    public int findPeakElement(int[] nums) {

        int start = 0 ; 
        int end = nums.length-1;

        while(start < end){

            int mid = start + (end - start)/2;

            if(nums[mid] > nums[mid+1]){
                end = mid;
            }
            
            else{
                start = mid + 1;
            }
        }

        return start;

    }
}


