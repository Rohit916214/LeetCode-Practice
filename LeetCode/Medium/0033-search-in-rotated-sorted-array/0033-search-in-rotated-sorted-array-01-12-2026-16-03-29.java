class Solution {
    public int search(int[] arr, int key) {
        int n = arr.length;

        int start = 0;
        int end = n-1;

        int pivotPoint = pivot(arr, start, end);

        int ans = binarySearch(arr, key, start, pivotPoint);

        if(ans != -1){
            return ans;
        }

        else{
            return binarySearch(arr, key, pivotPoint + 1, end);
        }
        
    }

    public static int pivot(int[] arr, int start, int end){

        while(start < end){
            
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[end]){
                start = mid+1;
            }

            else {
                end = mid;
            }
        }

        return (start - 1 + arr.length) % arr.length;  // or sirf start -1 se bhi ans aa jayega
    }

    public static int binarySearch(int[]arr, int key, int start, int end){

        while(start <= end){

            int mid = start + (end - start)/2;

            if(arr[mid] == key){
                return mid;
            }

            else if(arr[mid] < key){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }
        }

        return -1;
    }


        
    
}