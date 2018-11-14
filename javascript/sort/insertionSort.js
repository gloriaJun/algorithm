
'use strict';
let count = 0;

function sort(arr) {
  const len = arr.length;

  for (let i = 1; i < len; i++) {
    const key = arr[i];
    let j = i-1;
    for (; j >= 0 && key < arr[j]; j--) {
      arr[j+1] = arr[j];
    }
    arr[j+1] = key;
  }
  return arr;
}

let startTime = new Date().getTime();
// const arr = [6, 4, 1, 7, 3, 9, 8];
// const arr = [8, 5, 6, 2, 4];
const arr = [10, 8, 6, 20, 4, 3, 22, 1, 0, 15, 16];
console.log('before', arr);
console.log('after', sort(arr));
let endTime = new Date().getTime();
console.log('execution time : ', endTime - startTime);
