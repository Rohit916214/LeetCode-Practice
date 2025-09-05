class Solution {
    public int findClosest(int x, int y, int z) {

        int s1 = Math.abs(x-z);
        int s2 = Math.abs(y-z);

        if(s1 < s2){
            return 1;
        }
        else if(s2 < s1){
            return 2;
        }

        else{
            return 0;
        }
        
    }
}