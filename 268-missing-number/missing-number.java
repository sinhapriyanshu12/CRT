class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length; // n = number of elements (missing one number from 0 to n)

        for (int i = 0; i <= n; i++) {
            boolean found = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return i;
            }
        }

        return -1; 
    }
}

