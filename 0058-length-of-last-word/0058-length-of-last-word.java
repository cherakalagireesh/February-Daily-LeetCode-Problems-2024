class Solution {
    public int lengthOfLastWord(String s) {
        
        int index = s.length() - 1;

        while(index >= 0 && s.charAt(index) == ' ')
        {
            index--;
        }

        int result = 0;

        while(index >= 0 && s.charAt(index) != ' ')
        {
            result++;
            index--;
        }

        return result;
    }
}