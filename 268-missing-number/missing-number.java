class Solution {
    public int missingNumber(int[] nums) {
            int xor1=0;
            int xor2=0;
            for(int i=1;i<=nums.length;i++){
                xor1=xor1^i;
                xor2=xor2^nums[i-1];

            }
            return xor1^xor2;
        }
}