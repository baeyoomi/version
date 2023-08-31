package javatest;
/*
[숙제2]
상품 금액 : 2000,3000,1500,2300,3200,1100,3300,4200,6100,4300
상품 수량 : 2,1,1,2,3,2,1,1,2,3

상품금액과 상품수량를 곱하여 각 상품별 최종금액을 출력하시오.
해당 사용형태는 Thread를 이용하여 출력 되도록 합니다.
*/
public class homework12 {
	public static void main(String[] args) {
		int product[][] = {
				{2000,3000,1500,2300,3200,1100,3300,4200,6100,4300},
				{2,1,1,2,3,2,1,1,2,3}
		};
		int row_ea = product.length;
		int col_ea = product[0].length;

		mybasket mb = null;
		for(int z=0; z<col_ea; z++) {
			mb = new mybasket(z,product[0][z],product[1][z]);
			mb.start();
		}
	}
}

class mybasket extends Thread {
	private int w,mul = 0;
	public int value,ea = 0;
	int z = 0;
	
	public mybasket(int z, int val,int ea) {
		this.value = val;
		this.ea = ea;
		this.z = z;		
		
		this.mul = val * ea;
		
		/* 경선이 코드 보고 수정함 : length길이 인자값 받아서 썼는데, 이거 없어도 됌 위에서 길이만큼 만들어줬음
		while(this.w <= leng) {
			this.mul = val * ea;
			this.w++;
		}
		*/
	}
	
	@Override
	public void run() {
		System.out.println(this.z+1 +"번 상품 "+ this.value + "*" + this.ea + " = " + this.mul);
	}
}