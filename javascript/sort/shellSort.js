
'use strict';
let count = 0;

function insertionSort(list, first, last, gap) {
  for (let i = first+gap; i < last; i += gap) {
    const key = list[i];
    let j = i-gap;
    for (; j >= first && key < arr[j]; j -= gap) {
      list[j+gap] = list[j];
    }
    list[j+gap] = key;
  }
  return list;
}

function sort(arr) {
  const len = arr.length;

  for (let gap = parseInt(len/2); gap > 0; gap = parseInt(gap/2)) {
    if (gap % 2 === 0) {
      gap++;
    }

    for (let i = 0; i < gap; i++) {
      insertionSort(arr, i, len, gap);
    }
  }

  return arr;
}

let startTime = new Date().getTime();
const arr = [10, 8, 6, 20, 4, 3, 22, 1, 0, 15, 16];
console.log('before', arr);
console.log('after', sort(arr));
let endTime = new Date().getTime();
console.log('execution time : ', endTime - startTime);
