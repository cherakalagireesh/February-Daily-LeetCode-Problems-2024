class Solution {
    public long maximumTripletValue(int[] nums) {
        
        int length = nums.length;
        long result = 0;
        
        for(int i = 0 ; i < length - 2 ; i++)
        {
            for(int j = i + 1 ; j < length - 1 ; j++)
            {
                for(int k = j + 1 ; k < length ; k++)
                {
                    long val = (long)(nums[i] - nums[j]) * (long)nums[k];
                    result = Math.max(result, val);
                }
            }
        }

        return result;
    }
}