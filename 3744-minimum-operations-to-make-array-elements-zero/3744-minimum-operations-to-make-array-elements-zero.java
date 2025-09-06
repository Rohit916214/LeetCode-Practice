class Solution {
    public long minOperations(int[][] queries) {
        long ans = 0;
        for(int[] q:queries){
            long c1 = get(q[1]);
            long c2 = get(q[0]-1);
            ans+=(c1-c2+1)/2;
        }
        return ans;
    }

    private long get(int num){
        int i=1;
        long x=3 , total =0 ,sum=0;
        while(total<num){
            sum+=Math.min(x,num-total)*i;
            i++;
            total+=x;
            x=x*4;
        }
        return sum;
    }
}