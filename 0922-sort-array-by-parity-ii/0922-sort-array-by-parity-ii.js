/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortArrayByParityII = function(nums) {
    
    let oddNums = [];
    let evenNums = [];

    evenNums = nums.filter((num) => num % 2 !== 1);
    oddNums = nums.filter((num) => num % 2 === 1)

    let evenIndex = 0;
    let oddIndex = 0;

    for(let i = 0 ; i < nums.length ; i = i + 2)
    {
        nums[i] = evenNums[evenIndex++];
        nums[i + 1] = oddNums[oddIndex++];
    }

    return nums;
};