/*
class Solution {
    public int findNumbers(int[] nums) {

        int count= 0;
        for(int i = 0; i < nums.length; i++){

            int nums_length = checkLength(nums[i]);

            if(nums_length % 2 == 0){
                count++;
            }
        }

        return count;
        
    }

    public static int checkLength(int num){

        int size = 0;
        while(num > 0){
            num = num/10;
            size++;
        }

        return size;
    }
}

*/

/*
class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;
        for(int i = 0 ; i < nums.length; i++){
            int num = nums[i];

            String str = Integer.toString(num);

            int n = str.length();

            if(n%2 == 0){
                count++;
            }
        }

        return count;
    }
}
*/


class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;
        for(int i = 0 ; i < nums.length; i++){
            int num = nums[i];

            int digit = (int)Math.log10(num) + 1;

            if(digit % 2 == 0){
                count++;
            }
        }

        return count;
    }
}
