/**
 * @param {number[]} bits
 * @return {boolean}
 */
var isOneBitCharacter = function(bits) {
    
    let length = bits.length;
    let index = 0;
    let ans = 0;

    while(index < length)
    {
        if(bits[index] == 0)
        {
            ans = 1;
            index++;
        }
        else
        {
            ans = 2;
            index += 2;
        }
    }

    return ans == 1 ? true : false;
};