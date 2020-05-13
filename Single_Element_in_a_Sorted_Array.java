class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if(n == 1) return arr[0];
        int start = 0, end = n - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(mid == 0 && arr[mid] != arr[mid + 1] || mid == n - 1 && arr[mid] != arr[mid - 1] || arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) return arr[mid];
            if(arr[mid] == arr[mid - 1] && mid % 2 == 1 || arr[mid] == arr[mid + 1] && mid % 2 == 0) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
