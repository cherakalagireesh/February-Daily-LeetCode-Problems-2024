class Solution {
    public int removeElement(int[] nums, int val) {
        
        int left = 0;
        int right = 0;
        int length = nums.length;

        while(right < length)
        {
            if(nums[right] != val)
            {
                nums[left] = nums[right];
                left++;
            }

            right++;
        }

        return left;
    }
}