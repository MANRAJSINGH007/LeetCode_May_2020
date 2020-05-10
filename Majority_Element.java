class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int ans = nums[0];
        for(int i = 0; i < n; i++) {
            if(count == 0 || nums[i] == ans) {
                ans = nums[i];
                count++;
            }
            else count--;
        }
        return ans;
    }
}
