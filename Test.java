
public class Test {

	public static void main(String[] args) {
		
		//22일 수업
		
		
		//println : 엔터
		//print : 한줄
		/*System.out.println("자바 너무 어려워");
		System.out.println(3);
		System.out.println(5.7);
		
		//문자열과 정수, 실수, 변수를 나열할때 "+" 를 이용
		System.out.println("나는 " + 26 + " 살이다");
		
		System.out.println("내 키는 "+173.4+" 이다" );
		
		System.out.println(10+20);*/
		
		//아래는 전부 변수 타
		/*
		int age=20; //변수 선언
		//1. 메모리 공간 확보
		//2. 변수명을 사용해서 코드 작성
		double ki=177.1;
		double kg=50;
		
		byte n;
		float kg;
		boolean b=true;
		boolean c=false;
		
		long id;
		*/		
		//데이터 타입 여기서 string은 클래스 타입!
		/*int n=20;
		String str="병은";
		float f=3.5f;
		double d=3.5;
		
		System.out.println(n);
		System.out.println(str);
		System.out.println(f);
		System.out.println(d);*/
		
		/*int i=200; 
		double d=i; //자동 타입 변환이 일어남
		System.out.println(d);*/
		
		
		/*byte b=10;
		int i=b;
		System.out.println(i);
		
		char c='가'; //하나의 문자
		i=c;
		System.out.println(i);
		
		i=500;
		long l=i;
		System.out.println(l);
		
		i=200;
		double d=i;
		System.out.println(d);*/
		
		
		//80, 90을 초기화 변수명은 kor,eng 으로 설정
		/*int kor=80, eng=85; //변수 선언 및 초기화
		
		//두개의 합을 구해 sum에 저장
		int sum=kor+eng;
		
		double avg=(double)sum/2;
		
		System.out.println("총점 = "+sum);
		
		System.out.println("평균 = "+avg);*/
		
		/*int a=2, b=3, c=4;
		int r, r1, r2;
		float r3;
		
		r3 = a * b / (float)c;
		System.out.println(r3);*/
		
		
		/*int age=10;			//정수
		double ki = 166.6;	//실수
		String name="Jack";	//문자열
		char grade='A';		//하나의 문자
		*/
		//Jack 키는 166.6
		
		//System.out.println(name+" 키는 "+ki);
		
		
		//System.out.println(5>3 && 3!=3); //둘다 참이어야 참
		//System.out.println(5>3 || 3!=3); //하나만 참이면 참
		
		
		/*int a=10;
		System.out.println(a); //10
		
		a++;
		System.out.println(a); //11
		
		a--;
		System.out.println(a); //10
		
		a+=5; //a = a+5;
		System.out.println(a); //15
		
		a-=5; //a = a-5;
		System.out.println(a); //10
		
		a%=5;  //a = a%5;
		System.out.println(a); //0*/
		
		
		/*int a=10, b;
		b=a++; //후위연산자 (대입을 먼저 한 후 나중에 1 더한다)
		System.out.println(b);
		
		b=++a; //전위연산자 (막바로 1증가 한 후 대입)
		System.out.println(b);*/
		
		/*int n1=100, n2=-200;
		
		boolean a=(n1!=0);
		System.out.println(a); //true
		
		boolean b=(n2!=0); 
		System.out.println(b); //true
		
		System.out.println(a && b); //true
		System.out.println(a || b); //true*/
		
		
		
		/*int x=10;
		int y=20;
		int z=(++x)+(y--);
		System.out.println(z);
		
		int x1=10;
		int y1=5;
		
		System.out.println((x > 7) && (y <= 5)); //true
		System.out.println((x1 % 3 == 2) || (y1 % 2 != 1)); //false
		
		
		//1. 6+2.5의 결과를 8만 나오도록 출력해라.
		
		System.out.println(6+(int)2.5);*/
		
		/*int score=95;
		char grade=(score>90) ? 'A' : 'B';
		
		System.out.println(grade);*/
		/*
		String str1="java";
		String str2="10";
		String str3="20";
		
		System.out.println(str2+str3);
		System.out.println(str1);
		int a=(int)111.22;
		float b=300f;
		
		System.out.println(a);
		System.out.println(b);
		*/
		
		/*
		int k = 1;

		for(int i=2; i<=6; i++) {
		   for(int j=0; j<=9; j++) {      // 9회반복
		      if (9%i == j){
		         for(int y=1; y<=k; y++){
		         System.out.print("★");
		         }
		      }
		      else{
		    	  System.out.print ("　");
		      }

		   		System.out.println();
		   		k+=2;
		   }
		}
		*/
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5 - i ; j++) {
			System.out.print(" ");
			} 
			for(int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print(j);
				
			} 
			System.out.println("");
		}
		
		
		
	}

}
