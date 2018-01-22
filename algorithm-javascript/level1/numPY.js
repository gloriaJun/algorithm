/**
 * 문자열 내 p와 y의 개수
 numPY함수는 대문자와 소문자가 섞여있는 문자열 s를 매개변수로 입력받습니다.
 s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 리턴하도록 함수를 완성하세요.
 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
 예를들어 s가 pPoooyY면 True를 리턴하고 Pyy라면 False를 리턴합니다.
 **/

// 풀이1
function numPY_bak(s){
    var result = true;
    //함수를 완성하세요
    let str = s.toLowerCase().split("");
    let pCnt = 0;
    let yCnt = 0;
    str.forEach(function(word) {
        switch (word) {
            case "p": pCnt++;break;
            case "y": yCnt++;break;
        }
    });

    if (pCnt !== yCnt) {
        result = false;
    }
    return result;
}

// 풀이2
function numPY(s){
    //함수를 완성하세요
    let p = s.match(/p/ig) || "";
    let y = s.match(/y/ig) || "";
    return p.length === y.length;
}

// 아래는 테스트로 출력해 보기 위한 코드입니다.
console.log( numPY("pPoooyY") );
console.log( numPY("Pyy") );
console.log( numPY("oooo") );
console.log( numPY("pp") );