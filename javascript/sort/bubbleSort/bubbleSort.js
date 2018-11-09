'use strict';

function sort(arr) {
  const len = arr.length;

  for (let i = len - 1; i > 0; i--) {
    let swap = 0;
    for (let j = 0; j < i; j++) {
      if (arr[j] > arr[j+1]) {
        let temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        swap++;
      }
    }
    console.log(len - i, swap, arr);

    // 교환히 한번도 일어나지 않았다면, 이미 정렬이 완료된 것이다.
    if (swap === 0) {
      break;
    }
  }
  return arr;
}

// const arr = [22, 5, 11, 32, 120, 68, 70];
const arr = [1, 3, 9, 4, 7, 8, 6];
console.log('before', arr);
console.log('after', sort(arr));
