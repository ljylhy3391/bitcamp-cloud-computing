// 주제: 데이터베이스 프로그래밍 - 모듈 준비

const mysql = require('mysql');
console.log(mysql);

var con = mysql.createConnection({
	host: '13.125.253.74',
	database: 'studydb',
	user: 'study',
	password: '1111'
});

con.connect(function(err){
	if (err)throw err;
	console.log('연결 성공입니다!');
});

con.end(function(err){
	if (err)throw err;
	console.log('연결을 끊었습니다!');
});
console.log('연결 테스트!');
