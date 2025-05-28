class Solution {
    /*
    public boolean canPartition(int[] nums) {

        int n= nums.length;
        int total_sum = Arrays.stream(nums).sum();

        if(total_sum % 2 != 0){
            return false;
        }

        int target = total_sum/2;

        int dp[][] = new int[n][target+1];

        for(int row[] : dp){
            Arrays.fill(row,-1);
        }

        return Helper(n-1, target, nums, dp);
        
    }

    public static boolean Helper(int n, int target, int[] nums, int dp[][]){

        // base case 

       if (target == 0) return true; // Found a subset with required sum
        if (n < 0 || target < 0) return false;

       if(dp[n][target] != -1){
        return dp[n][target] == 0 ? false : true;
       }

        boolean pick = Helper(n-1, target-nums[n], nums, dp);
        boolean skip = Helper(n-1, target, nums, dp);
        
        dp[n][target] = (pick || skip) ? 1 : 0;
        return dp[n][target] == 1;
    }

    */

    // tabulation method

//     public boolean canPartition(int[] nums){
//         int n = nums.length;

//         int totalsum = Arrays.stream(nums).sum();

//         if(totalsum % 2 != 0){
//             return false;
//         }

//         int target = totalsum/2;

//         boolean dp[][] = new boolean[n+1][target+1];

//         for(int i = 0; i < n+1; i++){
//             dp[i][0] = true;
//         }
//         for(int j = 1 ; j < target+1; j++ ){
//             dp[0][j] = false;
//         }

//         for(int i = 1; i < n+1; i++){
//             for(int j = 1; j < target+1; j++){
//                  int v = nums[i-1];

//                  //include 

//                 if(v <= j){
//                     dp[i][j] = dp[i-1][j] || dp[i-1][j-v];
//                 }

//                 // Exclude
//                 else{
//                     dp[i][j] = dp[i-1][j];
//                 }
//             }
//         }
//         return dp[n][target];


//     }
// }




//--------------------------------------------//

public boolean canPartition(int[] nums) {

        int n= nums.length;
        int total_sum = Arrays.stream(nums).sum();

        if(total_sum % 2 != 0){
            return false;
        }

        int target = total_sum/2;

        int dp[][] = new int[n+1][target+1];

        for(int row[] : dp){
            Arrays.fill(row,-1);
        }

        return Helper(nums, target, n-1, dp);
        
    }
    public static Boolean Helper(int[] arr, int target, int n, int[][] dp){
        
        if(target == 0){
            return true;
        }
        
        if(n==0){
            return target == arr[0];
        }
        
        if(dp[n][target] != -1){
            return dp[n][target] == 0 ? false : true;
        }
        
        
        
        boolean NotTake = Helper(arr, target, n-1, dp);
        boolean Take = false;
        
        if(arr[n] <= target){
            
            Take = Helper(arr, target-arr[n], n-1, dp);
        }
        
        dp[n][target] = NotTake || Take ? 1 : 0;
        
        return NotTake || Take;
  
    }
}
