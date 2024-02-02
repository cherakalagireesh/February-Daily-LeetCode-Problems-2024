/**
 * @param {number[]} aliceSizes
 * @param {number[]} bobSizes
 * @return {number[]}
 */
var fairCandySwap = function(aliceSizes, bobSizes) {
    
    let aliceSum = aliceSizes.reduce((acc,el) => acc+=el,0);
    let bobSum = bobSizes.reduce((acc,el) => acc+=el,0);

    for(let i of aliceSizes)
    {
        for(let j of bobSizes)
        {
            let aliceNewSum = aliceSum - i + j;
            let bobNewSum = bobSum - j + i;

            if(aliceNewSum == bobNewSum)
                return [i,j];
        }
    }

    return [-1,-1];
};