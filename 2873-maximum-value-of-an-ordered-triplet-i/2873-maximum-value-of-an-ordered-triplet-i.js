/**
 * @param {number[]} nums
 * @return {number}
 */
var maximumTripletValue = function(nums) {
    
    let result = 0;
    let length = nums.length;

    for(let i = 0 ; i < length - 2 ; i++)
    {
        for(let j = i + 1 ; j < length - 1 ; j++)
        {
            for(let k = j + 1 ; k < length ; k++)
            {
                let val = (nums[i] - nums[j]) * nums[k];
                result = Math.max(val, result);
            }
        }
    }

    return result;
};