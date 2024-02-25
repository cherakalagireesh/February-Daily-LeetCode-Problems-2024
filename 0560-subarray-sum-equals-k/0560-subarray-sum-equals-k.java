class Solution {
    public int subarraySum(int[] nums, int k) {
      
        int prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        map.put(0,1);

        for(int num : nums)
        {
            prefixSum += num;
            int value = prefixSum - k;

            if(map.containsKey(value))
            {
                result += map.get(value);
            }
                
            map.put(prefixSum, map.getOrDefault(prefixSum,0) + 1);
        }

        return result;
    }
}