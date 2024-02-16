/**
 * @param {character[]} letters
 * @param {character} target
 * @return {character}
 */
var nextGreatestLetter = function(letters, target) {
    
    let low = 0;
    let high = letters.length - 1;

    while(low <= high)
    {
        let mid = Math.floor((low + high) / 2);

        if(letters[mid] <= target)
            low = mid + 1;
        else
            high = mid - 1;
    }

    return low === letters.length ? letters[0] : letters[low];
};