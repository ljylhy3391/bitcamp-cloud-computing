// 주제: 모듈을 정의하고 사용하기
//

var fn =require('./ex07_m');

var obj1 = fn();
var obj2 = fn();

obj1.plus(100);
obj1.minus(7);

obj2.plus(100);
obj2.minus(7);

console.log(obj1.getResult());
console.log(obj2.getResult());