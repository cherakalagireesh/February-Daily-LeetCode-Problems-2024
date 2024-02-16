class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int length = letters.length;
        int low = 0;
        int high = length - 1;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(letters[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low == length ? letters[0] :letters[low];
    }
}