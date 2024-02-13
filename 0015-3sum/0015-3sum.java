class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int length = nums.length;
        Set<List<Integer>> set  = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0 ; i < length - 2 ; i++)
        {
            int left = i + 1;
            int right = length - 1;

            while(left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0)
                {
                    List<Integer> li = new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right]));
                        set.add(li);
                    
                    left++;
                }
                else if(sum > 0)
                    right--;
                else
                    left++;
            }
        }

        return new ArrayList<>(set);
    }
}