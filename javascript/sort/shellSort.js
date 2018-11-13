
'use strict';

function sort(arr) {
  const len = arr.length;
  let gap = len;
  gap = parseInt(gap / 2);
  if (gap % 2 === 0) {
    gap++;
  }

  for (let i = 1; i < gap; i++) {
    const key = arr[i];
    let j = i-1;
    for (; j >= 0 && key < arr[j]; j--) {
      arr[j+1] = arr[j];
    }
    arr[j+1] = key;
    console.log(i, j, `key: ${key}`, arr);
  }

  // const key =
  // for (let i = 0, j = gap; i < len && j < len; i++, j++) {
  //   if (arr[i] > arr[j]) {
  //     const temp = arr[i];
  //     arr[i] = arr[j];
  //     arr[j] = temp;
  //   }
  // }

  // while(gap !== 1) {
  //   // gap = parseInt(gap / 2);
  //   // if (gap % 2 === 0) {
  //   //   gap++;
  //   // }
  //
  //   for (let i = 0, j = gap; i < len && j < len; i++, j++) {
  //     if (arr[i] > arr[j]) {
  //       const temp = arr[i];
  //       arr[i] = arr[j];
  //       arr[j] = temp;
  //     }
  //   }
  // }

  return arr;
}

const arr = [10, 8, 6, 20, 4, 3, 22, 1, 0, 15, 16];
console.log('before', arr);
console.log('after', sort(arr));
