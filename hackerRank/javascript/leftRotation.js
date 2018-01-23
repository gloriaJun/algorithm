/**
 A left rotation operation on an array of size
 shifts each of the array's elements  unit to the left.
 For example, if left rotations are performed on array ,
 then the array would become .

 Given an array of  integers and a number, ,
 perform  left rotations on the array.
 Then print the updated array as a single line of space-separated integers.
 */
function leftRotation(args){
    var array = args.split('\n');
    var info = array[0];
    info = info.split(' ');

    var n = info[0]; // 배열 갯수
    var k = info[1]; // rotate count

    // 배열 값 추출
    array.splice(0,1);
    array = array[0].split(' ');

    var temp = array.splice(0, k%n);
    console.log(array.concat(temp).join(' '));
}

// 아래는 테스트로 출력해 보기 위한 코드입니다.
console.log("5, 2: " + leftRotation('5 4\n1 2 3 4 5'));
