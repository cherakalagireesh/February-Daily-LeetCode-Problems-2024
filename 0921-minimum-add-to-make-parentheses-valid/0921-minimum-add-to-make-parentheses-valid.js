/**
 * @param {string} s
 * @return {number}
 */
var minAddToMakeValid = function(s) {
    
    let open = 0;
    let close = 0;

    return s.split('').reduce((result, ch) =>
    {
        if(ch === ')')
        {
            if(open == 0)
                close++;
            else
                open--;
        }
        else
            open++;
        
        return close + open;
    },0);
};