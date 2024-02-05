/**
 * @param {string} path
 * @return {boolean}
 */
var isPathCrossing = function(path) {
  let set = new Set();
  let i = 0;
  let j = 0;

  set.add(`${i},${j}`);

  for (let ch of path) {
    if (ch === 'N') j++;
    else if (ch === 'E') i++;
    else if (ch === 'S') j--;
    else i--;

    let position = `${i},${j}`;

    if (set.has(position)) {
      return true;
    } else {
      set.add(position);
    }
  }

  return false;
};