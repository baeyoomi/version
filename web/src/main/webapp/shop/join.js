/* 
storage : local, session = 웹 브라우저에 작은 메모리를 활용하여 해당 정보를 기억시켜놓은 공간
단점 : 브라우저 종류가 다를 경우 storage 값이 유/무로 나누어 집니다.
window.localStorage.setItem("별명", 값 또는 변수명) : storage에 저장
window.localStroage.getItem("별명") : storage에 있는 별명 명칭 값을 가져올 때 사용
*/

/*console.log 대신*/
var storage = window.localStorage.getItem("userid");
f.uid.value = storage;

/*아이디 저장 기능*/
function id_save(){
	var ck = document.getElementById("saveid");
	if(f.uid.value==""){
		alert("아이디를 입력하셔야만 해당 기능을 사용할 수 있습니다.");
		ck.checked = false;
	}
	else{
		if(ck.checked==true){
			window.localStorage.setItem("userid",f.uid.value);
		}
		else{
			window.localStorage.setItem("userid","");
		}
	}
}


/* 로그인 */
function login(){

	if(f.uid.value==""){
		alert("아이디를 입력해주세요");
		f.uid.focus();
		return false;
	}else if(f.upw.value==""){
		alert("패스워드를 입력해주세요");
		f.upw.focus();
		return false;
	}else{
		return;
	}
}


/* 회원가입 */
function join(){
	if(f.uid.value==""){
		alert("아이디를 입력해주세요");
		f.uid.focus();
	}else if(f.uname.value==""){
		alert("이름을 입력해주세요");
		f.uname.focus();
	}else if(f.upw.value==""){
		alert("패스워드를 입력해주세요");
		f.upw.focus();
	}else if(f.upwck.value==""){
		alert("패스워드를 확인해주세요");
		f.upwck.focus();
	}else if(f.upw.value!=f.upw.value){
		alert("패스워드가 틀립니다");
		f.upw.focus();
	}else if(f.ucom.value==""){
		alert("통신사를 입력해주세요");
		f.ucom.focus();
	}else if(f.utel.value==""){
		alert("전화번호를 입력해주세요");
		f.utel.focus();
	}else if(f.uem.value==""){
		alert("이메일을 입력해주세요");
		f.uem.focus();
	}else{
		if(f.utel.value.length < 10){
			alert("휴대폰 번호를 확인해주세요");
			f.utel.focus();
		}else if(isNaN(f.utel.value) == true){  //isNaN = is not a number - 숫자로 변환했을때 true ->문자가 포함됌
			alert("정상적인 휴대폰 번호를 입력해주세요");
			f.utel.focus();
		}else if(f.uem.value.indexOf("@")==-1){ //문자열 중 @가 있는지 없는지 확인 (-1 = 무조건 없다는 뜻), 자바에도 있음
			alert("올바른 이메일 주소를 입력해주세요.");
			f.uem.focus();
		}else{
			f.submit();
		}
	}
}

/*$(document).ready*/