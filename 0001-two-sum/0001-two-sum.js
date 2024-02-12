/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    
    let map = new Map();
    let length = nums.length;
    
    for( let i = 0 ; i < length ; i++)
    {
        let rem = target - nums[i];
        
        if(map.has(rem))
        {
            return new Array(i, map.get(rem));
        }
        
        map.set(nums[i], i);
    }
    
    return new Array(-1, -1);
};