class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int length = nums.length;
        int left = 0;
        int right = 0;
        int result = Integer.MIN_VALUE;

        while(right < length)
        {
            if(nums[right] == 0)
                k--;
            
            while(k == -1)
            {
                if(nums[left] == 0)
                    k++;

                left++;
            }

            result = Math.max(result, right - left + 1);
            right++;
        }

        return result == Integer.MIN_VALUE ? 0 : result;
    }
}