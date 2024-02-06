/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var targetIndices = function(nums, target) {
    nums.sort((a,b) => a - b);
    let result = [];

    for(let i = 0 ; i < nums.length ; i++)
    {
        if(target === nums[i])
            result.push(i);
    }

    return result;
};