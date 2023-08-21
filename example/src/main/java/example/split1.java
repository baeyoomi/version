package example;

import java.util.Arrays;

public class split1 {

	public static void main(String[] args) {
		//String test = "어벤저스-홈커밍|1위|2500";
		//String test = "어벤저스-홈커밍,1위,2500";
		String test = "어벤저스-홈커밍+1위+2500";
		//String data[] = test.split("|");   (x)  연산자 기호는 배열화로 표시해줘야 split이 입력된다
		//String data[] = test.split("[|]");   (o)
		//String data[] = test.split(","); 연산자 아니니까 이렇게만 해도 됌
		String data[] = test.split("[+]");
		System.out.println(Arrays.toString(data));

	}

}
