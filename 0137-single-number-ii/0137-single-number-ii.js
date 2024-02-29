/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
    
    let hashMap = new Map();

    for(let num of nums)
    {
        hashMap.set(num, (hashMap.get(num) + 1) || 1);
    }

    for (let [key, value] of hashMap) {
        if (value === 1) {
            return key;
        }
    }

    return -1;
};