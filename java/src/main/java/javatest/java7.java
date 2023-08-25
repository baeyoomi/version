package javatest;
//double loop

public class java7 {

	public static void main(String[] args) {
		new data4().abc();
	}

}

class data4{
	
	public void abc() {
		//for+for
		/*
		int f,ff;
		int total;
		for(f=1; f<=5; f++) {
			
			for(ff=1; ff<=5; ff++) {
				total = f + ff;
				System.out.println(f + "+"+ ff + "=" + total);
			}
		}
		*/
		/*
		int w =1;
		int total = 0;
		while(w <= 5) {
			
			int ww = 1;    //초기화 실행 필요 (while, do~while) 밖에만 선언하면 안에서 조건이 안먹힘
			while(ww <= 5) {
				total = w + ww;
				System.out.println(w + "+"+ ww + "=" + total);
				ww++;
			}
			w++;
		}
		*/
		/*
		int z = 1;
		int total;
		do {
			int zz = 1; //초기화
			do {
				total = z + zz;
				System.out.println(z + "+"+ zz + "=" + total);
				zz++;
			}while(zz <= 5);
			System.out.println("------");
			z++;
		}while(z <= 5);
		*/
		
		/* for+while 
		 1+1=2 
		 1+2=3 
		 1+3=4
		 2+1=3
		 2+2=3
		 2+3=5
		 3+1=4
		 3+2=5
		 3+3=6 
		 */
		
		int i = 1;
		int j;
		int sum;
		while(i <=3) {
			for(j=1; j<=3; j++) {
				sum = i + j;
				System.out.println(i + "+" + j + "=" + sum);
			}
			i++;
		}
		/* 선생님 답
			int i = 1;
			int j;
			while(i <=3) {
				for(j=1; j<=3; j++) {
					System.out.println(i + "+" + j + "=" + (i+j));
				}
				i++;
			}
		*/
	}
}