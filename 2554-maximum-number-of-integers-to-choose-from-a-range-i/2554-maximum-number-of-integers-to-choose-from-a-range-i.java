class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {

        Set<Integer> unique = new HashSet<>();
        int sum = 0;
        int count = 0;

        for(int num : banned)
        {
            if(num <= n)
                unique.add(num);
        }

        for(int i = 1 ; i <= n ; i++)
        {   
            if(!unique.contains(i))
            {
                sum += i;
                if(sum > maxSum)
                    return count;
                count++;
            }
        }

        return count;
    }
}