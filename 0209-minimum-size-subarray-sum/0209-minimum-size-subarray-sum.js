/**
 * @param {number} target
 * @param {number[]} nums
 * @return {number}
 */
var minSubArrayLen = function(target, nums) {
    
    let length = nums.length;
    let left = 0;
    let right = 0;
    let sum  = 0;
    let result = Number.MAX_SAFE_INTEGER;

    while(right < length)
    {
        sum += nums[right];

        while(sum >= target)
        {
            result = Math.min(result, right - left + 1);
            sum -= nums[left++];
        }

        right++;
    }

    return result === Number.MAX_SAFE_INTEGER ? 0 : result;
};