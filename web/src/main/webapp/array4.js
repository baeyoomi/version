function idck(){
	if(f.mid.value==""){
		alert("아이디를 입력하세요");
	}
	else{
		ajax(f.mid.value);
	}
}

let apost;
let bdata;
function ajax(data){
	var ajax_data = "mid="+data;   //Backend에게 전달형태 및 데이터값
	
	function aaa(){
		if(window.XMLHttpRequest){
			return new XMLHttpRequest();
		}
	}
	function bbb(){
		if(apost.readyState==XMLHttpRequest.DONE && apost.status==200){
			bdata = this.response;
			//console.log(bdata);
			return_resp(bdata);  //리턴 메세지를 별도로 핸들링하는 함수로 전달
		}
		
	}
	apost = aaa();
	apost.onreadystatechange = bbb;
	apost.open("POST","http://192.168.110.216:8081/web/login_idck.jsp",true);
	//암호화해서 받음, POST 전송에만 사용되는 enctype 구조이며, 사용자가 입력한 모든 데이터를 암호화로 사용한다.
	apost.setRequestHeader("content-type","application/x-www-form-urlencoded");
	apost.send(ajax_data);   //GET은 여기에 아무것도 없어도 처리가 되지만 POST는 사용할것을 넣어줘야함
}
	/* GET 전송
	apost.open("GET","http://192.168.110.216:8081/web/login_idck.jsp?mid="+data,true);
	apost.send();
	*/

function return_resp(rp){
	console.log(rp);
	//error, no, yes

	if(rp=="no"){
		alert("해당 아이디는 사용하실 수 없습니다.");
	}
	else if(rp==""){
		alert("아이디를 입력해주세요");
	}
	else{
		alert("해당 아이디는 사용가능 합니다.");
		document.getElementById("mid").readOnly = true;     //사용가능하면 더 이상 수정못하게 만듬
	}
}


