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