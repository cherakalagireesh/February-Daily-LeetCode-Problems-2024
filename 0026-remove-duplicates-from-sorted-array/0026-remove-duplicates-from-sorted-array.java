class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length < 1)
            return 0;

        int left = 0;
        int right = 0;
        int index = 0;
        
        nums[index++] = nums[0];

        while(right < nums.length)
        {
            while(right < nums.length && nums[left] == nums[right])
                right++;
            
            if(right < nums.length)
                nums[index++] = nums[right];
            left = right;
        }

        return index;
    }
}