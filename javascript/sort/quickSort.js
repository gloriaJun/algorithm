'use strict';

function swap(list, i, j) {
  const temp = list[i];
  arr[i] = arr[j];
  arr[j] = temp;
  return list;
}

function partition(list, start, end) {
  let left = start;
  let right = end;
  const pivot = list[start];

  while (left < right) {
    do {
      left++;
    } while (list[left] < pivot);
    do {
      right--;
    } while (pivot < list[right]);

    if (left < right) {
      swap(list, left, right);
    }
  }

  if (list[right] < pivot) {
    swap(list, start, right);
  }

  return right;
}

function quickSort(list, start, end) {
  const pivotIdx = partition(list, start, end);
  if (start < pivotIdx - 1) {
    quickSort(list, start, pivotIdx - 1);
  }
  if (pivotIdx + 1 < end) {
    quickSort(list, pivotIdx + 1, end);
  }
}

function sort(list) {
  const len = list.length;
  quickSort(list, 0, len);
  return list;
}

let startTime = new Date().getTime();
const arr = [5, 3, 8, 4, 9, 1, 6, 2, 7];
// const arr = [6, 3, 8, 7, 9, 2, 1, 5];
console.log('before', arr);
console.log('after', sort(arr));
let endTime = new Date().getTime();
console.log('execution time : ', endTime - startTime);
