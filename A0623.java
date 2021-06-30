import java.util.Scanner;

public class A0623 {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		
		
		// 스캐너 연습1
		
		/*System.out.println("세 과목 점수 입력 : ");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		double avg=(double)(a+b+c)/3;
		System.out.println(avg);*/
		
		
		
		// 스캐너 연습2
		
		/*System.out.println("나이는?");
		int age=s.nextInt(); //정수를 입력하는 함수	
		System.out.println(age);
	
		System.out.println("이름은?");
		String name=s.next(); //문자열을 입력하는 함수
		System.out.println(name);
		
		System.out.println("키는?");
		double ki=s.nextDouble(); //실수를 입력하는 함수
		System.out.println(ki);
		
		System.out.println("공부했어?");
		boolean study=s.nextBoolean(); //true, false
		System.out.println(study);*/
		
		
		
		// 스캐너 연습3
		
		/*System.out.println("두 정수 입력");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a+", "+b);*/
		
		//두 실수 입력받아 평균 출력(소수점은 버리기)
		
		/*double a=s.nextDouble();
		double b=s.nextDouble();
		System.out.println((int)((a+b)/2));*/
		
		
		//문제 풀이
		
		/* 
		//1. 10/4 한 결과값을 소수점까지 출력해라
		System.out.println((double)10/4);
		
		//2. 하나의 정수를 입력받아 그 수의 제곱을 구해라
		int i=s.nextInt();
		System.out.println(i * i);
		
		//3. a를 4.0, b를 1.2로 초기화하여 4.0+1.2를 출력해라.
		double a=4.0, b=1.2;
		System.out.println(a + "+"+ b + "=" + (a+b));
		
		//3-1. 앞에서 출력한 5.2를 소수점을 버려라. 
		System.out.println((int)(a+b));
		
		//4. Scanner클래스를 이용하여 이름, 사는 곳, 나이, 체중을 입력받고, 출력하는 프로그램 작성해라.
		System.out.println("입력해라:");
		
		String name=s.next();
		String h=s.next();
		int age=s.nextInt();
		double kg=s.nextDouble();
		
		System.out.println("내 이름은 " + name + "이다.");
		System.out.println("사는 곳은 " + h + "이고, 나이는 "+ age + "살이다.");
		System.out.println("몸무게는 " + kg + "kg이다.");
		*/
		
		
		
		// 스캐너 복습
		
		/*System.out.print("첫번째 값 : ");
		double a=s.nextDouble();
		System.out.print("두번째 값 : ");
		double b=s.nextDouble();
		
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println((int)a + " % " + (int)b + " = " + (int)(a%b));*/
		
		//printf 활용
		
		/*int a=10;
		double b=3.5;
		String name="kim";
		
		System.out.printf("정수 %d 실수 %.1f 이름 %s",a,b,name);*/
		
		
		
		// if문 연습
		/*
		System.out.print("100보다 크냐 작냐 값을 입력해보거라 : ");
		int a=s.nextInt();
		
		if(a<100) {
			System.out.println("100보다 작다.");
		}
		else {
			System.out.println("100보다 크다");
		}
		*/
		
		
		// 코드 연습
		// 하나의 정수 입력하고 싶다.
		/*
		System.out.print("정수를 입력하세요 : ");
		int i=s.nextInt();
		
		if(i>10) { // 10보다 크면 아래의 출력문이 출력
			System.out.println("10보다 크다");
			
		}
		else { // 10보다 작으면 아래의 출력문이 출력
			System.out.println("10보다 작다");
			
		}
		*/
		
		// if, else if 연습1
		/*
		int a=10,b=4;
		
		if(a==10) {
			System.out.println("A");
		}
		else if(a<b) {
			System.out.println("B");
		}
		else if(a>b) {
			System.out.println("C"); //위에서 만족 했기에 출력 안됨 else if는 만족하지 않을때만 넘어감
		}
		*/
		
		
		// if, else if 연습2
		
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 입력해!");
		int kor=sc.nextInt();
		char grade;
		
		if(kor>=90) 
			grade='A';
		else if(kor>=80)
			grade='B';
		else if(kor>=70)
			grade='C';
		else
			grade='F';
		
		System.out.println("학점 : "+grade);
		*/
		
		
		// if, else if 연습3
		/*
		Scanner sc2=new Scanner(System.in);
		
		System.out.print("정수를 입력해 주세요 : ");
		int x=sc2.nextInt();
		
		if(x%2==0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		*/
		
		
		// char를 string으로 한자만 받기
		/*
		Scanner s=new Scanner(System.in);
		
		System.out.println("문자입력해 :");
		char ch=s.next().charAt(1);
		System.out.println(ch);
		*/
		
		
		// 중첩 if문 연습1
		/*
		int a=20,b=10;
		
		if(a>10) { // 선행조건(바깥 if문이 참이어야 안쪽 if문 확인 가능)
			if(b>=0) {
				b=1;
			}
			else { // if가 거짓일때만 
				b=-1;
			}
		}
		System.out.println(a + " " + b);
		*/
		
		// 중첩 if문 연습2
		/*
		int age=25,kg=60;
		char ch;
		
		if(age<20) {
			if(kg<50)
				ch='S';
			else if(kg<60)
				ch='M';
			else
				ch='L';
		}
		else // age>=20
			if(kg<60)
				ch='S';
			else if(kg<70)
				ch='M';
			else
				ch='L';
		System.out.println(ch);
		*/
		
		
		// if, else if 연습4 
		/*
		int total=300;
		double avg=300/3.0;
		
		if(avg>=90)
			System.out.println("A");
		
		else if(avg<=80 && avg<90)
			System.out.println("B");
		
		else
			System.out.println("F");
		*/
		
		
		// switch(변수) 변수에는 문자열, 문자, 정수만 들어갈 수 있음
		
		
		// switch문 연습 1
		
		/*Scanner s=new Scanner(System.in);
		
		System.out.println("정수 하나를 입력 : ");
		int a=s.nextInt();
		
		switch(a) {
			case 1:
				System.out.println("1");
				break;	// 조건을 만족 했을때 switch문 탈출
			case 2:
				System.out.println("2");
				break;
			default:	// 위 조건 만족하지 않을
				System.out.println("3");
		}
		*/
		
		
		// switch문 연습 2
		
		/*
		Scanner s=new Scanner(System.in);
		
		System.out.println("오늘 무슨요일?");
		String day=s.next();
		
		switch(day) {
		
		case "수요일":
			System.out.println("수");
			break;
			
		case "목요일":
			System.out.println("목");
			break;
			
		default:
			System.out.println("수, 목 아님");
			break;
		}
		*/
		
		
		// 문제 풀이
		/*
		//1-1
		int a=2,b=3,c=4;
		System.out.println(a + "*" + b + "=" + (a*b));
		System.out.println(a + "*" + c + "=" + (a*c));
		//1-2
		System.out.printf("%d*%d=%d",a,b,(a*b));
		System.out.printf("%d*%d=%d",a,c,(a*c));
		//2
		Scanner s=new Scanner(System.in);
		System.out.println("두 정수를 입력해주세요 : ");
		int i1=s.nextInt();
		int i2=s.nextInt();
		
		System.out.printf("%.2f",(i1+i2)/2.0);
		
		//3-1
		double d1=7,d2=0.5;
		System.out.printf("%.0f",d1+d2);
		//3-2
		System.out.println((int)(d1+d2));
		*/
		
		//4
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("첫번째 수 입력 : ");
		int x=sc.nextInt();
		
		System.out.println("연산자 입력 : ");
		char f=sc.next().charAt(0);
		
		System.out.println("두번째 수 입력 : ");
		int y=sc.nextInt();
		int result=0;
		
		if(f=='*') {
			result=x*y;
			System.out.println(x + "*" + y + "=" + result);
		}else if(f=='-') {
			result=x-y;
			System.out.println(x + "-" + y + "=" + result);
		}else if(f=='+') {
			result=x+y;
			System.out.println(x + "+" + y + "=" + result);
		}else if(f=='/') {
			result=x/y;
			System.out.println(x + "/" + y + "=" + result);
		}else
			System.out.println("올바른 연산자를 입력해 주세요.");
		
		
		
		
		
	}

}
