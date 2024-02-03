class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {

        int n = queries.length;
        int m = words.length;
        int result[] = new int[n];
        int freqWords[] = new int[m];

        for(int i = 0 ; i < m ; i++)
        {
            freqWords[i] = findFreq(words[i]);
        }

        Arrays.sort(freqWords);

        for(int i = 0 ; i < n ; i++)
        {
            int freq = findFreq(queries[i]);
            result[i] = binarySearch(freqWords, freq);
        }

        return result;
    }

    public int findFreq(String s)
    {
        int freq[] = new int[26];

        for(char ch : s.toCharArray())
            freq[ch - 'a']++;

        for(int num : freq)
        {
            if(num != 0)
                return num;
        }

        return 0;
    }

    public int binarySearch(int nums[], int target)
    {
        int length = nums.length;
        int low = 0;
        int high = length - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(nums[mid] <= target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return length - low;
    }
}