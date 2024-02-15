class Solution {
    public int countNegatives(int[][] grid) {
        
        int result = 0;
        int rowLength = grid.length;
        int colLength = grid[0].length;

        for(int i = 0 ; i < rowLength ; i++)
        {
            result = result + binarySearch(grid[i], colLength);
        }

        return result;
    }

    public int binarySearch(int nums[], int len)
    {
        int low = 0;
        int high = len - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(nums[mid] < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low != len ? len - low : 0;
    }
}