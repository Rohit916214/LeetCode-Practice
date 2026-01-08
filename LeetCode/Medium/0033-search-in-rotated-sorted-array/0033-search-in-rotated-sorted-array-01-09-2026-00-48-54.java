class Solution {
    public int search(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[start] <= arr[mid]) {
                if (key >= arr[start] && key < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (key > arr[mid] && key <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element in array:");
        int n = sc.nextInt();
        System.out.println("Enter key value:");
        int key = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        
        System.out.println(obj.search(arr,key));

    }
        
    
}