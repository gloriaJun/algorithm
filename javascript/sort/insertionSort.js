
'use strict';

function sort(arr) {
  const len = arr.length;

  for (let i = 1; i < len; i++) {
    const key = arr[i];
    let keyIdx = i;
    for (let j = i-1 ; j >= 0; j--) {
      if (arr[keyIdx] < arr[j]) {
        const temp = arr[j];
        arr[j] = arr[keyIdx];
        arr[keyIdx] = temp;
        keyIdx = j;
      }
    }
    console.log(i, `key: ${key}`, arr);
  }
  return arr;
}

// const arr = [6, 4, 1, 7, 3, 9, 8];
const arr = [8, 5, 6, 2, 4];
console.log('before', arr);
console.log('after', sort(arr));
