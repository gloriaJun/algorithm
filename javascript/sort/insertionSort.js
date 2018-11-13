
'use strict';

function sort(arr) {
  const len = arr.length;

  for (let i = 1; i < len; i++) {
    const key = arr[i];
    let j = i-1;
    for (; j >= 0 && key < arr[j]; j--) {
      arr[j+1] = arr[j];
    }
    arr[j+1] = key;
    console.log(i, j, `key: ${key}`, arr);
  }
  return arr;
}

// const arr = [6, 4, 1, 7, 3, 9, 8];
const arr = [8, 5, 6, 2, 4];
console.log('before', arr);
console.log('after', sort(arr));
