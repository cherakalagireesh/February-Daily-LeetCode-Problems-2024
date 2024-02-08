class Solution {
    public int[] sortArrayByParityII(int[] nums) {

        int length = nums.length;
        int evenNums[] = new int[length / 2];
        int oddNums[] = new int[length / 2];
        int evenIndex = 0;
        int oddIndex = 0;

        for(int num : nums)
        {
            if(num % 2 == 0 )
                evenNums[evenIndex++] = num;
            else
                oddNums[oddIndex++] = num;
        }

        evenIndex = 0;
        oddIndex = 0;

        for(int i = 0 ; i < length; i = i + 2)
        {
            nums[i] = evenNums[evenIndex++];
            nums[i + 1] = oddNums[oddIndex++];
        }

       return nums; 
    }   
}