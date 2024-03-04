/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersection = function(nums1, nums2) {
    
    let arr = new Array(1001).fill(0);
    let result = new Array();

    for(let num of nums1)
        arr[num] = 1;
    
    for(let num of nums2)
    {
        if(arr[num] == 1)
            arr[num] = 2;
    }

    for(let num of nums2)
    {
        if(arr[num] == 2)
        {
            result.push(num);
            arr[num] = 1;
        }
    }

    return result;
};