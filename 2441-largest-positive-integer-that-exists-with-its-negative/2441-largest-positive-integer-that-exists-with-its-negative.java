class Solution {
    public int findMaxK(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int result = -1;
        
        for(int num : nums)
        {
            int val = num < 0 ? num * -1 : num * -1;
            
            if(set.contains(val) && Math.abs(val) > result)
                result = Math.abs(val);
            
            set.add(num);
            
        }
        
        return result;
    }
}