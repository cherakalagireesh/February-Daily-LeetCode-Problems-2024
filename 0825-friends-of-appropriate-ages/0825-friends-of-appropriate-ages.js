/**
 * @param {number[]} ages
 * @return {number}
 */
var numFriendRequests = function(ages) {
    let count = new Array(121).fill(0);
  ages.forEach((age) => count[age]++);
  let res = 0;
  let tot = 0;

  for(let i = 0; i <= 120; i++){
      if(i > 14 && count[i] !== 0){
          let limit = Math.floor(0.5 * i) + 7;
          let rest = tot - count[limit];
          res += (count[i] * rest);
          res += (count[i] * (count[i] - 1));
      }
      tot += count[i];
      count[i] = tot;
  }    
  return res;
};