class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        int aliceSum = sum(aliceSizes);
        int bobSum = sum(bobSizes);

        for(int i = 0 ; i < aliceSizes.length ; i++)
        {
            for(int j = 0 ; j < bobSizes.length ; j++)
            {
                int aliceNewSum = aliceSum - aliceSizes[i] + bobSizes[j];
                int bobNewSum = bobSum - bobSizes[j] + aliceSizes[i];

                if(aliceNewSum == bobNewSum)    
                    return new int[]{aliceSizes[i], bobSizes[j]};
            }
        }

        return new int[]{-1,-1};

    }

    public int sum(int []nums)
    {
        int sum = 0;

        for(int num : nums)
            sum += num;
        
        return sum;
    }
}