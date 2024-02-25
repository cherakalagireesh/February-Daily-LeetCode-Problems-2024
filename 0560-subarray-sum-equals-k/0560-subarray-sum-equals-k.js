/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function(nums, k) {

    let prefixSum = 0;
    let count = 0;
    let map = new Map();
    map.set(0, 1);
    
    for (let i = 0; i < nums.length; i++) {
        prefixSum += nums[i];
        let target = prefixSum - k;
        
        if (map.has(target)) {
            count += map.get(target);
        }
        
        map.set(prefixSum, (map.get(prefixSum) || 0) + 1);
    }
    
    return count;

}