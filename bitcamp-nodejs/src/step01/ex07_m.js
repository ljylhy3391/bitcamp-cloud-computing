// 모듈 정의4


module.exports=function(){
	var result = 0;
	return{
		plus: function(value){result += value},
		minus: function(value){result -= value},
		multiple(value){result *= value},
		divide(value){result /= value},
		getResult(){return result}
	};
};






