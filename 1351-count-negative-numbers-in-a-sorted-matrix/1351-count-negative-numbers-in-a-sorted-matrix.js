/**
 * @param {number[][]} grid
 * @return {number}
 */
var countNegatives = function(grid) {
    
    let m = grid.length;
    let n = grid[0].length;
    let result = 0;

    for(let i = 0 ; i < m ; i++)
    {
        result = result + lowerBound(grid[i], n);
    }

    return result;
};

let lowerBound = (nums, len) =>
{
    let low = 0;
    let high = len - 1;

    while(low <= high)
    {
        let mid = Math.trunc((low + high) / 2);

        if(nums[mid] < 0)
            high = mid - 1;
        else
            low = mid + 1;
    }

    return low != len ? len - low : 0;
};