package javatest;
//Thread를 이용하여 결과값을 돌출하는 프로세서를 작성하시오
/*
응용문제1
데이터가 다음과 같이 있습니다.
10,5,19,22,13,6,4 => 55,15,190,253,91,21,10
해당 Thread에 데이터를 하나씩 대입합니다.
단, 결과값 형태는 다음과 같습니다.

10데이터가 입력되면 1~10 모두 더한 결과값 출력 
5 데이터 입력되면 1~5 모두 더한 결과값 출력
19 데이터 입력되면 1~19 모두 더한 결과값 출력 형태로
각각의 배열 데이터 값 범위 만큼 더하여 결과값을 출력합니다.
*/
public class java19 {

	public static void main(String[] args) {
		int a[] = {10,5,19,22,13,6,4};
		int ea = a.length; //배열갯수
		int ww = 0;
		plus ps = null;  //여기에서 new 생성하지 말것 *중요
		while(ww < ea) {
			ps = new plus(a[ww]);   //각각의 배열 값을 순서대로 메소드에 전달
			ps.start();  //Thread run메소드를 실행
			ww++;
		}
	}

}
class plus extends Thread {
	private int w = 1; //해당 class를 호출 시 새롭게 인스턴스가 만들어지므로 초기값이 같은 상황임 // 무조건 여기 안에서만 쓸수 있게 private 씀
	private int total = 0; //모두 합한값
	public int num = 0; 
	
	//Thread는 run을 쓰기위해 즉시 실행 메소드를 사용해야 한다
	//int num은 배열에 각각의 값을 해당 메소드가 전달 받음
	public plus(int num) {  //해당 값에 맞춰서 모두 더하는 값
		this.num = num; //인자값을 다른 메소드에서 사용하기 위함(setter)  (return =getter, this = setter)
		while(this.w <= num) {
			this.total += this.w;
			this.w++;
		}
	}
	@Override
	public void run() {  //결과만 출력
		System.out.println("1~"+ num +"결과값 : " + this.total);
	}
}