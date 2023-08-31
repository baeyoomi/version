/*게시판*/


/*글쓰기*/
function b_write(){
	//조건문
	var t = CKEDITOR.instances.btext.getData();
	
	if(f.btitle.value==""){
		alert("제목을 입력해주세요");
		f.btile.focus();
	}else if(f.bname.value==""){
		alert("이름을 입력해주세요");
		f.bname.focus();
	}else if(f.bpass.value==""){
		alert("패스워드를 입력해주세요");
		f.bpass.focus();
	}else if(t==""){
		alert("내용을 입력해주세요");
	}else{
		f.submit();
	}
}