let data;     //변수가 같은 중복이름을 사용하지 않도록 하기위한 선언   ,const 상수라 값을 변동못함

let array;
function calldata(data){
	console.log(data);    //본판보기
	this.array = data;
}

function abc(){
	this.array["member_list"].sort(function(a,b){
		return b["point"] - a["point"];  //내림차순
		//return a["point"] - b["point"];  //올림차순
	});
	//console.log(this.array);   //바뀐거 보기
	
	let html = document.getElementById("list");
	
	//for in => 배열 전용 반복문
	var s;           //데이터 수량 조회(인덱스번호)
	//for~in문
	for(s in this.array["member_list"]){
		html.innerHTML += "<ul>";
		var f;             //키 이름 조회
		for(f in this.array["member_list"][s]){
			//console.log(f);
			html.innerHTML += "<li>"+this.array["member_list"][s][f]+"</li>";
			//console.log(this.array["member_list"][s][f]);
			if(f =="point"){
				html.innerHTML += "<li>"+this.array["member_list"][s][f].toLocaleString()+"</li>";
			}
			else{
				html.innerHTML += "<li>"+this.array["member_list"][s][f]+"</li>";
			}
		}
		html.innerHTML += "</ul>";
	}
}	

	// 승균 ip 192.168.110.214
	// 경민 ip 192.168.110.215
	// 경선 ip 192.168.110.216
	// 내꺼 ip 192.168.110.217
	/*
	function aaa(){
		if(window.XMLHttpRequest){
			return new XMLHttpRequest();
		}
	}
	function bbb(){
		if(data.readyState==XMLHttpRequest.DONE && data.status==200){
			const array = JSON.parse(this.response);
			console.log(array);
		}
	}
	data =aaa();
	data.onreadystatechange = bbb;
	data.open("get","http://192.168.110.216:8081/web/userlist.json",true);
	data.send();
	*/
