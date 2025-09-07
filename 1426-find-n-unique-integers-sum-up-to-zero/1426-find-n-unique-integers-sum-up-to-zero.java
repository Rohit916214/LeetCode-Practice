class Solution {
    public int[] sumZero(int n) {

        int ans[] = new int[n];

       
        int j = n/2;

        if(n%2 == 0){
            int p = j;
            for(int k = 0; k < j; k++){
                ans[k] = -p;
                p--;
            }
            p = j;
            for(int k = j; k < n; k++){
                ans[k] = p;
                p--;
            }
        }
        else{
            int p = j;
            for(int k = 0; k < j; k++){
                ans[k] = -p;
                p--;
            }
            p = j;
            for(int k = j; k < n; k++){
                ans[k] = p;
                p--;
            }
            ans[n-1] = 0;

        }

        return ans;
        
        
    }
}