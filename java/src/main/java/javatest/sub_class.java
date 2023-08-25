package javatest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class sub_class {

}

//자주쓰는건 외부 클래스에 짜놓고 메인에서는 부르기만 하자
class timezone{
	SimpleDateFormat date = null;
	String now_time(int call) {
		Date today = new Date();
		if(call==1) {
			this.date = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		}
		else if(call==2) {
			this.date = new SimpleDateFormat("YYYY-MM-dd");
		}
		else if(call==3) {
			this.date = new SimpleDateFormat("HH:mm:ss");
		}
		String result = date.format(today);
		return result;
	}
}