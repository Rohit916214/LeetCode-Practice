class Solution {
    public int makeTheIntegerZero(int num1, int num2) {


    /*
    Example 1: num1=3, num2=-2
    k = 3
    x = num1 - k*num2
    bitcount(x) <= k && k <= x
    */

    for(int k = 1; k <= 60; k++){

        long x = (long) num1 - (long) k*num2;
        //int bit = bitcount(x);

        long bit = Long.bitCount(x);

        if(bit <= k && k <= x){
            return k;
        }


    }

    return  -1;
        
    }

    // public static int bitcount(int x){
    //     int count = 0;
    //     while(x > 0){

    //         count += (x & 1);

    //         x >>= 1;

    //     }

    //     return count;
    // }
}