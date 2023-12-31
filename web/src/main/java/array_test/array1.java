package array_test;


//import java.util.*; 모든 라이브러리 설정 할 수 있음, 실무에서 많이 씀
import java.util.Arrays;

//원시배열 형태
public class array1 {

	public static void main(String[] args) {
		//String, int, Object, byte
		//숫자 : 0, 문자 : NULL
		// Arrays.toString : 모든 원시 배열에 리스트를 모두 표시하는 클래스이며
		// 단, 라이브러리를 java.util  해당 부분이 아닌 apache, spring...
		// 다른 부분일 경우 버그는 숫자형태의 배열은 출력이 안되는 현상이 발생함
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		int ea = a.length;
		System.out.println("int형 숫자타입(for문) : "+ ea);    //5 내가 설정해놓은게 4개여도 길이를 5개로 만들었으니 하나는 NULL값이 들어가 있다.
		//System.out.println(Arrays.toString(a)); 문자열로 생성된게 아니라 오류뜰 수 있음, 그럴땐 아래처럼 진행할수 있다. ,import java.util.Arrays; 라이브러리가 등록되있으면 쓸수 있다.
		int f;
		for(f=0; f<ea; f++) {
			System.out.print("["+a[f]+"]");
		}
		System.out.println("");
		System.out.println("-----------------------");
		
		//타입에 배열괄호를 넣거나 객체에 배열괄호 넣거나
		String b[] = new String[3];
		b[0] = "홍길동";
		b[1] = "이순신";
		int ea2 = b.length;
		System.out.println("String형 문자타입 : "+ ea2);
		System.out.println(Arrays.toString(b));
		System.out.println("-----------------------");
		
		//Object : 문자 + 숫자를 적용할 수 있는 원시배열 데이터 자료형
		/* 단점 : 데이터 입력 쉬움, 활용시 자료형을 무조건 한번은 변환해서 사용 */
		Object c[] = new Object[3];
		c[0] = "hong";
		c[1] = 25;
		int ea3 = c.length;
		System.out.println("Object형 숫자,문자타입 : "+ ea3);
		System.out.println(Arrays.toString(c));
		System.out.println("-----------------------");
		
		int[] d = {1,2,3,4,5};                  //null, 0 의 값을 적용하지 않고 규격에 맞게 데이터를 입력하는 형태
		int ea4 = d.length;
		System.out.println("int형 숫자타입(toString) : "+ ea4);
		System.out.println(Arrays.toString(d));
		System.out.println("-----------------------");
		
		Integer e[] = {10,20,30,40};
		int ea5 = e.length;
		System.out.println("Integer형 숫자 클래스 : " + ea5);
		System.out.println(Arrays.toString(e));
	}
}
