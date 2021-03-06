/*
함수를 완성해서 매개변수 array의 평균값을 return하도록 만들어 보세요.
어떠한 크기의 array가 와도 평균값을 구할 수 있어야 합니다.
 */
function average(array){
    //함수를 완성하세요
    // return array.reduce(function (result, value) {
    //     return result + value;
    // }, 0) / array.length;
    // ES6
    return array.reduce((a, b) => a + b) / array.length;
}

// 아래는 테스트로 출력해 보기 위한 코드입니다.
var testArray = [5,3,4];
console.log("평균값 : " + average(testArray));
console.log("평균값 : " + average([10, 4, 2, 20]));
