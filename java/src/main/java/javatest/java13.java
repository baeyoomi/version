package javatest;

import java.util.Arrays;
import java.util.Scanner;

/*
 응용문제 1 - override를 활용함
 "학생명을 입력해 주세요? : "
 "검색할 과목명을 입력하세요 (국어, 수학, 과학, 역사)? :"
 데이터는 데이터 별도의 class를 이용합니다. 해당 class 안에 해당 배열 데이터가 있으며,
 해당 데이터를 상속 받아서 다음과 같이 결과가 돌출 되도록 프로세서를 작성하시오.

 [데이터] - override
 {"국어", "수학", "과학", "역사"}
 {"홍길동","이순신","유관순"}
 홍길동 {"80","78","92","40"}
 이순신 {"40","80","80","100"}
 유관순 {"55","40","50","90"}
	
 결과 - overloading
 홍길동
 과학 88

*/
public class java13 {

	public static void main(String[] args) {
		search sr = new search();
		sr.list();
		sr.datasearch();
	}

}

class datalist {
	String members[][] = null;   //필드에 원시배열 선언
	String user[] = null; 
	public void list() {
		this.user = new String[]{"홍길동","이순신","유관순"};
		this.members = new String[][]{    //this를 이용해서 실행
				{"80","78","92","40"},
				{"40","80","80","100"},
				{"55","40","50","90"}
		};
	}
}

class search extends datalist {    //deepToString : 2차배열에서 사용하는 메소드
	Scanner sc = null;
	@Override
	public void list() {   //super은 상속 받을 때 해당 메소드를 실행 후 상속 받음
		super.list();
		//System.out.println(Arrays.toString(this.members[0]));
		//System.out.println(Arrays.deepToString(this.members));
	}
	
	public void datasearch() {
		this.list();
		this.sc = new Scanner(System.in);
		System.out.println("학생명을 입력해주세요? :");
		String name = this.sc.nextLine().intern();
		
		int node = 0;
		for(String n : this.user) {
			if(n == name) {
				node = node;
				break;
			}else {
				node++;				
			}
		}
		System.out.println("검색할 과목명을 입력하세요 (국어, 수학, 과학, 역사)? : ");
		String subject = this.sc.nextLine().intern();
		int snode = 0;  //과목에 대한 노드번호
		switch(subject) {
			case "국어": snode = 0;
				break;
			case "수학": snode = 1;
				break;
			case "과학": snode = 2;
				break;
			case "역사": snode = 3;
				break;
			default: //case외 사용되는 명령어
				System.out.println("해당 과목은 존재하지 않는 과목명입니다.");
				new search().datasearch();
				break;
		}
		System.out.println(name +" 학생 "+ subject +"과목의 점수는 "+ this.members[node][snode] + " 입니다.");
		
		/*
		String ques[] = {"학생명을 입력해주세요 (홍길동,이순신,유관순)","검색할 과목명을 입력하세요 (국어, 수학, 과학, 역사)? :"};
		Scanner sc = new Scanner(System.in);
		String a[] = new String[ques.length];
		int i = 0;
		while (i < ques.length) {
			System.out.println(ques[i]);
			a[i] = sc.nextLine();
			i++;
		}
		System.out.println(Arrays.toString(a));
		
		int ea = members[0].length;
		//String msg = "";
		String b[] = new String[members.length];
		int j = 0;
		while(j < ea) {
			if(a[0] == user[0] && a[1] == members[0][j]) {					
				//msg = members[1][j];
				b[j] = members[1][j];
				break;
			}
			else if(a[0] == user[1] && a[1] == members[1][j]) {					
				//msg = members[2][j];
				b[j] = members[2][j];
				break;
			}
			else if(a[0] == user[2] && a[1] == members[2][j]) {					
				//msg = members[3][j]; 
				b[j] = members[3][j];
				break;
			}
			j++;
		}
		System.out.println(Arrays.toString(b));
		*/
	}
}
