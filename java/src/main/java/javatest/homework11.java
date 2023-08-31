package javatest;
/*
[숙제1]
구구단 7단 중 해당 결과값을 Thread를 이용하여 출력 되도록 합니다.
*/
public class homework11 {

	public static void main(String[] args) {
		multi mt = null;
		int i = 1;
		do {
			mt = new multi(i);
			mt.start();
			i++;
		}while(i <= 9);
	}

}

class multi extends Thread {
	private int seven = 7;
	public int num = 0;
	
	public multi(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		System.out.println(this.seven+"*"+ num + " = " + (this.seven*num));
	}
	
}