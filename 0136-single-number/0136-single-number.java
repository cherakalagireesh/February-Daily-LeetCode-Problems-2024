class Solution {
    public int singleNumber(int[] nums) {
        
        Arrays.sort(nums);
        int length = nums.length;
        int index = 0;

        while( index < length - 1)
        {
            if(nums[index] != nums[index + 1])
                return nums[index];

            index += 2;
        }

        return nums[length - 1];
    }
}