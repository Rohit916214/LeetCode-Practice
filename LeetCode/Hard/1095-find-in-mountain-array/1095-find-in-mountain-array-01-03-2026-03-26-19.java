/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int end = mountainArr.length()-1;
        int maxPoint = breakMountainArr(mountainArr, 0, end);
        int leftPart = binarySearchAccending(mountainArr, target, 0,maxPoint);

        if(leftPart != -1){
            return leftPart;
        }
        else{
            return binarySearchDeccending(mountainArr, target,maxPoint+1, end);
        }

       

    }

    public static int binarySearchAccending(MountainArray mountainArr, int target, int start, int end){

        while(start <= end){

            int mid = start + (end - start)/2;

            if(mountainArr.get(mid) == target){
                return mid;
            }

            else if(mountainArr.get(mid) < target){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;
        
    }

    public static int binarySearchDeccending(MountainArray mountainArr, int target, int start, int end){

        while(start <= end){

            int mid = start + (end - start)/2;

            if(mountainArr.get(mid) == target){
                return mid;
            }

            else if(mountainArr.get(mid) > target){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }

        return -1;
        
    }

    public static int breakMountainArr(MountainArray mountainArr, int start, int end){

        while(start < end){

            int mid = start + (end - start)/2;

            if(mountainArr.get(mid) > mountainArr.get(mid + 1)){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }

        return start;

    }
}