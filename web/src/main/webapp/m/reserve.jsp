<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
	function ck(){
		if(f.pname.value==""){
			alert("로그인 후 예약이 가능합니다.");
		}
		else if(f.pid.value==""){
			alert("로그인 후 예약이 가능합니다.");
		}
		else{
			f.submit();
		}
	}
</script>
<form name="f" method="post" action="reserveok.do">
<div>
<p>[예약시스템]</p>
고객명 : <input type="text" name="pname" vlaue="<%=user_name%>" readonly="readonly"><br>
아이디 : <input type="text" name="pid" vlaue="<%=user_id %>" readonly="readonly"><br>
<br>
ROOM 선택 : <br>
<label>
	<input type="radio" name="room" value="패밀리룸"> 패밀리룸
</label>
<label>
	<input type="radio" name="room" value="키즈룸"> 키즈룸
</label>
<label>
	<input type="radio" name="room" value="러블리룸"> 러블리룸
</label>
<br>
인원 : 
<select name="person">
	<option value="1">1명</option>
	<option value="2">2명</option>
	<option value="3">3명</option>
</select>
<br><br>
예약일자 : <input type="datetime-local" name="reserve"><br>
<input type="button" value="예약하기" onclick="ck()"> 
</div>

<script>
var mid = "<%=user_id %>";
var mname = "<%=user_name %>";
if (mid != "null" && mname != "null"){
	f.pname.value = mname;
	f.pid.value = mid;
}

</script>
</form>