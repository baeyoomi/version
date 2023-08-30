package javatest;
//Thread란? CPU가 일할 수 있는 공간 (메인 class는 안함)
/*
 extends => 상속 (Thread)
 interface => Runnable
*/
//Thread란 1개의 cpu공간
//MultiThread : 개발자가 1개 이상의 cpu 공간을 활용하는 사항
public class java18 {
	public static void main(String[] args) {
		int a = 10;
		int w = 0;
		th1 t = new th1();
		th2 t2 = null;
		//Thread thr = new Thread();
		
		while (w <= a) {
			/*
			int aa = t.start(w);
			System.out.println(aa);
			t2 = new th2(w);
			thr.start();
			*/
			t2 = new th2(w);  //새로운 a개 만큼의 작업 실행
			//t2.run();
			//t2.start();  //start는 Thread중에서 run메소드를 실행시킴
			w++;
		}
		
		th3 t3 = null;
		Thread th = null;
		
		for(int aa = 0 ; aa < 11; aa++) {
			t3 = new th3(aa);
			th = new Thread(t3);
			th.start();			
		}
		
	}
}

class th1{    //일반 class
	int start(int a) {	//return 메소드
		return a;
	}
}

/* extends 단독(하나만 쓰면) 부분 */
class th2 extends Thread {	//Thread class 상속
	int b = 0;
	public th2(int a) {		//class 호출시 작동하는 메소드
		this.b = a;
		//System.out.println("th2 : " + this.b);
	}
	@Override
	public void run() {	//Thread 에서 제공되는 메소드 (실행 메소드)
		//System.out.println("run : " + this.b);
	}
}
/* extends 멀티(여러개 쓰면) 부분 */
class th22 extends Thread {	//Thread class 상속
	int b = 0;
	public th22(int a) {		//class 호출시 작동하는 메소드
		this.b = a;
		//System.out.println("th2 : " + this.b);
	}
	@Override
	public void run() {	//Thread 에서 제공되는 메소드 (실행 메소드)
		//System.out.println("run : " + this.b);
	}
}


/* implements 부분 */
class th3 implements Runnable {
	public int c = 0;
	public th3(int z) {
		this.c = z;
	}
	@Override
	public void run() {
		System.out.println("run : " + this.c);
	}
}