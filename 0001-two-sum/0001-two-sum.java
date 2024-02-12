class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        
        for(int i = 0 ; i < length ; i++)
        {
            int rem = target - nums[i];
            
            if(map.containsKey(rem))
                return new int[]{i, map.get(rem)};
            
            map.put(nums[i], i);           
        }
        
        return new int[]{-1, -1};
    }
}