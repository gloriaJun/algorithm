'use strict';

function sort(arr) {
  const len = arr.length;

  for (let i = 0; i < len; i++) {
    let min = i;
    for (let j = i+1; j < len; j++) {
      if (arr[min] > arr[j]) {
        min = j;
      }
    }

    if (arr[i] > arr[min]) {
      let temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
    console.log(i+1, arr);
  }
  return arr;
}

const arr = [8, 5, 6, 2, 4];
console.log('before', arr);
console.log('after', sort(arr));
