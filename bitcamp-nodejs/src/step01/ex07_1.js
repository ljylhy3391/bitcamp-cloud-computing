// 주제: 모듈을 정의하고 사용하기
//

var fn = require('./ex07_m');

var obj = fn();

obj.plus(100);
obj.minus(7);

console.log(obj.result);
console.log(obj.getResult());