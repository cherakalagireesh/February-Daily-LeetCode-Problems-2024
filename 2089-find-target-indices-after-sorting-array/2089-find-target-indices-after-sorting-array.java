class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);

        int lowerBound = lowerBound(nums, target);
        int upperBound = upperBound(nums, target);

        while(lowerBound != -1 && lowerBound <= upperBound)
            result.add(lowerBound++);

        return result;
    }

    public int lowerBound(int nums[], int target)
    {
        int low = 0;
        int high = nums.length - 1; 
        int index = -1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(nums[mid] == target && ( mid - 1 == -1 || nums[mid - 1] != target))
            {
                index = mid;
                return index;
            }
            else if(nums[mid] >= target)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return index;
    }

    
    public int upperBound(int nums[], int target)
    {
        int low = 0;
        int high = nums.length - 1; 
        int index = -1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(nums[mid] == target && ( mid + 1 == nums.length || nums[mid + 1] != target))
            {
                index = mid;
                return index;
            }
            else if(nums[mid] <= target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return index;
    }
}