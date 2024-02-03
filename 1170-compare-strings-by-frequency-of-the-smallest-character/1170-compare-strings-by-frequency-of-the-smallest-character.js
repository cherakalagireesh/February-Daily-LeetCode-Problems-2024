/**
 * @param {string[]} queries
 * @param {string[]} words
 * @return {number[]}
 */
var numSmallerByFrequency = function(queries, words) {
    
    let result = [];
    let freqCharWords = words.map((word) =>
    {
        return findFreq(word);
    });

    freqCharWords.sort((a, b) => a - b);

    for(let i = 0 ; i < queries.length ; i++)
    {
        let freq = findFreq(queries[i]);
        result.push(binarySearch(freqCharWords, freq));
    }

    return result;
};

function findFreq(word)
{
    let freq =  new Array(26).fill(0);

     word.split("").forEach(el =>
    {
        freq[el.charCodeAt(0) - 'a'.charCodeAt(0)]++
    })

    for(let num of freq)
    {
        if(num != 0)
            return num;
    }

    return -1;
}

function binarySearch(nums, target)
{
    let length = nums.length;
    let low = 0;
    let high = length - 1;

    while(low <= high)
    {
        let mid = Math.floor((low + high) / 2);

        if(nums[mid] <= target)
            low = mid + 1;
        else
            high = mid - 1;
    }

    return length - low;
}