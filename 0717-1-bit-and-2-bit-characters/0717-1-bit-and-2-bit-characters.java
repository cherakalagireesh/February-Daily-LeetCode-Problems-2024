class Solution {
    public boolean isOneBitCharacter(int[] bits) {

        int count = 0;
        int index = 0;
        int length = bits.length;

        while(index < length)
        {
            if(bits[index] == 0)
            {
                index++;
                count = 1;
            }
            else
            {
                index +=2;
                count = 2;  
            }
        }   

        return count == 1 ? true : false;
    }
}