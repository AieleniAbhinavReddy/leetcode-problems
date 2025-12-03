class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            // Calculate the middle index 'm' to prevent integer overflow
            int m = l + (r - l) / 2;

            if (nums[m] == target) {
                return m; // Found the target
            }

            // Determine which half is correctly sorted:
            
            // 1. Check if the LEFT side is sorted: [l, m]
            if (nums[l] <= nums[m]) { 
                // Check if the target is within the sorted left half
                if (nums[l] <= target && target < nums[m]) {
                    r = m - 1; // Target is in the left half, search left
                } else {
                    l = m + 1; // Target is not in the left half, search right
                }
            } 
            // 2. Otherwise, the RIGHT side MUST be sorted: [m, r]
            else { 
                // Check if the target is within the sorted right half
                if (nums[m] < target && target <= nums[r]) {
                    l = m + 1; // Target is in the right half, search right
                } else {
                    r = m - 1; // Target is not in the right half, search left
                }
            }
        }
        
        return -1; // Target not found
    }
}