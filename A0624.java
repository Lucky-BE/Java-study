import java.util.Scanner;

public class A0624 {

	public static void main(String[] args) {
	
		
		// 하나정수 입력
		/*
		System.out.println("숫자를 입력하세요 : ");
		int a=s.nextInt();
		
		if (a>0) {
			System.out.println("양수");
		}
		else if(a<0) {
			System.out.println("음수");
		}
		else
			System.out.println("0");
		*/
		
		
		// if문 복습1
		
		/*
		System.out.println("점수 입력 : ");
		int score=s.nextInt();
		
		System.out.println("학년 입력 : ");
		int year=s.nextInt();
		
		if(score>=60) {
			if(year!=4) {
				System.out.println("합격"); // 점수가 60점 이상이고 4학년이 아닐때 합격
			}
			
			else if(score>=70) {
				System.out.println("합격"); // 점수가 70점 이상일고 4학년일때 합격
			}
			else {
				System.out.println("불합격"); // 4학년 이면서 70점 미만일때 불합격
			}
		}
		else
			System.out.println("불합격"); // 점수가 60점 미만이면 불합격
		*/
		
		// Math랜덤복습
		/*
		int num=(int)(Math.random()*45)+1;
		
		System.out.println(num);
		*/
		
		// 1~100까지의 수
		
		/*
		int n=(int)(Math.random()*100)+1;
		System.out.println(n);
		
		if(n%5==0) {
			System.out.println("n은 5의 배수");
		}
		else if(n%10==0) {
			System.out.println("n은 10의 배수");
		}
		else
			System.out.println("둘다 아님");
		*/
		
		
		// 81~100점 사이 학점 출력
		/*
		int score=(int)(Math.random()*20)+81;
		System.out.println(score);
		
		String grade; // 변수선언(문자열)
		
		if(score>=90) {
			if(score>=95) {
				grade="A+";
			}
			else { // 90이상 95점 미만
				grade="A";
			}
		}
		else { // 90점 미만
			if(score>=85) {
				grade="B+";
			}
			else {
				grade="B";
			}
		}
		System.out.println("학점 : "+grade);
		*/
		
		
		// if문 복습
		/*
		int score=85;
		
		if(score>90) {
			System.out.println("A");
		}
		else {
			System.out.println("B");
		}
		*/
		
		
		// 스위치문 연습1
		
		/*
		System.out.println("학점을 입력해라 : ");
		String grade=s.next();
		
		switch(grade) {
		case "A":
		case "B":
			System.out.println("Excellent");
			break;
		case "C":
		case "D":
			System.out.println("Good");
			break;
		case "F":
			System.out.println("Bad");
		}
		*/
		
		
		
		// 하나의 문자를 입력해 (스위치문 연습)
		
		
		/*
		System.out.println("하나의 문자를 입력해 : ");
		char a=s.next().charAt(0);
		
		switch(a) {
		case 'm':
			System.out.println("movie");
			break;
		case 's':
			System.out.println("sing");
			break;
		case 'b':
			System.out.println("book");
			break;
		default:
			System.out.println("etc");
			 break;
		}
		*/
	
		
		// 4부터 14까지의 난수 범위 설정 
		
		/*
		int a=(int)(Math.random()*11)+4;
		
		switch(a) {
		case 4:
			System.out.println("four");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 10:
			System.out.println("ten");
			break;
		default:
			System.out.println("nothing");
		}
		*/
		
		
		// 반복문(for,while,do-while)
		
		
		// for문 연습1
		/*
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		*/
		
		
		// for문 연습2
		/*
		for(int i=0; i<5; i++) {
			System.out.println("안녕하세요."); // 안녕하세요 5번 출력
		}
		*/
		
		
		// for문 연습3
		/*
		for(int i=1; i<=5; i++) {
			System.out.println(i); // 1~5출력
		}
		*/
		
		
		// for문 연습4
		/*
		for(int i=5; i>0; i--) {
			System.out.println(i); // 5,4,3,2,1 출력
		}
		*/
		
		
		// for문 연습5 (1부터 100까지 수)
		/*
		for(int i=1; i<=100; i++) { // 전제조건
			if(i%5==0 && i%6==0) { // i가 5의 배수이고 6의 배수이면
				System.out.println(i);
			}
		}
		*/
		
		
		// 1부터 50까지 수 중 짝수만 출력
		/*
		for(int i=1; i<=50; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		*/
		
		
		// for문 연습6
		/*
		int sum=0;
		
		for(int i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println("1~100 합 : "+sum);
		*/
		
		
		// for문 연습7
		// 짝수의 합만 출력 (0+2+4+6+8+10)
		/*
		int sum=0;
		
		for(int i=0; i<=10; i+=2) {
			sum+=i;
		}
		System.out.println(sum);
		*/
		
		
		// for문 연습8
		/*
		int sum=0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {// 짝수이면
				sum+=i;	// 더하겠다
			}
		}
		System.out.println(sum);
		*/
		
		
		// 1~1000 중에서 3의 배수 또는 7의 배수 합계
		/*
		int sum=0;
		
		for(int i=1; i<=1000; i++) {
			if(i%3==0 || i%7==0) {
				sum+=1;
			}
		}
		System.out.println("1 ~ 1000의 숫자 중, 3 or 7의 배수의 합 : "+sum);
		*/
		
		
		// 구구단 출력
		/*
		for(int m=1; m<=9;m++) {
			System.out.println("*** "+m+"단 ***");
			for(int n=1; n<=9; n++) {
				System.out.println(m+"X"+n+"="+(m*n));
			}
		}
		*/	
				
		
		// 교재 134p 문제 풀이 3번
		/*
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println("3의 배수들의 합은 : "+sum);
		*/
		
		
		// 연습 
		/*
		Scanner s=new Scanner(System.in);
		int sum=0;
		int n;
		
		System.out.println("값 입력");
		n=s.nextInt();
		
		// 1부터 여러분이 입력한 수까지 합 출력
				
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println("1~"+n+"의 합 : "+sum);
		*/
		
		
		// 바깥 for문을 기준으로 안쪽의 for문이 돈다.
		// (바깥 변수를 기준으로 안쪽 for문의 조건식이 만족이 될때까지 반복된다.)
		/*
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				System.out.println(i + " " + j);
			}
		}
		*/
		
		
		// 문제풀이 구구단 몇단인지 물어봐서 출력
		/*
		Scanner s=new Scanner(System.in);
		System.out.println("몇 단 ?");
		
		int n=s.nextInt();
		System.out.println("--- "+n+"단 ---");
		
		for(int i=1; i<=9; i++) {
			System.out.println(n+"X"+i+"="+(n*i));
		}
		*/
		
		
		// 구구단 입력받아 거꾸로 출력 
		/*
		Scanner s=new Scanner(System.in);
		
		System.out.println("몇 단 ?");
		int n=s.nextInt();
		
		System.out.println("--- "+n+"단 ---");
		
		for(int i=9; i>=1; i--) {
			System.out.println(n+"X"+i+"="+(n*i));
		}
		*/
		
		
		// for문 연습 9
		/*
		for(int i=1; i<=15; i++) {
			System.out.print("*");
			if(i%5==0) {
				System.out.println(); // enter
			}
		}
		*/
		
		
		
		// 문제 풀이 
		
		//1. 5/3 한 결과값을 소수점 둘째 자리 까지 출력해라. (printf 사용)
		
		//System.out.printf("%.2f",(double)5/3);
		
		
		//2. 키(double)를 하나 입력받아 160보다 작으면 “small”, 170보다 작으면 “medium”, 180보다 작으면 “large” 출력
		/*
		Scanner s=new Scanner(System.in);
		
		System.out.println("키를 입력 해주세요 : ");
		double ki=s.nextDouble();
		
		if(ki<160) {
			System.out.println("small");
		}
		else if(ki<170) {
			System.out.println("medium");
		}
		else
			System.out.println("large");
		*/
		
		
		//3. n1을 50, n2를 100으로 초기화하여 두 수 중 큰 수를 판별하여 출력해라. (삼항 연산자 활용)
		/*
		int n1=50, n2=100;
		
		String g=(n1>n2)? n1+">"+ n2 : n1+"<"+ n2;
		
		System.out.println(g);
		*/
		
		
		//4. 나이를 기준으로 중첩if문을 사용하여 출력해라.(나이, 키, 사이즈 각각 변수를 선언)
		/*
		Scanner s=new Scanner(System.in);
		
		int age;
		double ki;
		char size;
		
		System.out.print("나이를 입력 해주세요 : ");
		age=s.nextInt();
		System.out.print("키를 입력 해주세요 : ");
		ki=s.nextDouble();
		
		if(age<20)
			if(ki>=170) {
				size='L';
			}else if(ki>=160) {
				size='M';
			}else
				size='S';
		else {
			if(ki>=175) {
				size='L';
			}else if(ki>=165) {
				size='M';
			}else
				size='S';
		}
		System.out.println("당신의 사이즈는 : "+size);
		*/
		
		
		//5. 1부터 50까지의 정수를 출력해라.(for)
		/*
		for(int i=1; i<=50; i++) {
			System.out.println(i);
		}
		*/
		
		
		//5-1 1부터 50까지의 정수 중 6의 배수를  출력해라.(for)
		/*
		for(int i=1; i<=50; i++) {
			if(i%6==0) {
				System.out.println(i);
			}
		}
		*/
		
		
		//5-2 1~50까지의 총합 출력해라
		/*
		int sum=0;
		
		for(int i=1; i<=50; i++) {
			sum+=i;
		}
		System.out.println("1~50까지의 총합 : "+sum);
		*/
		
		
		//5-3. 1~50 정수를 random함수로 범위 설정 한 후 무작위 수 하나(난수)출력해라
		/*
		int a=(int)(Math.random()*50)+1;
		System.out.println(a);
		*/
		
		
		//6. a=10, b=20으로 초기화하고, 연산자(+,-,*,/)중 하나를 입력받는다. 
		//	 +이면 두수의 합, -이면 차, *이면 곱, /이면 몫을 구하여 출력해라.(switch-case문 사용)
		/*
		Scanner s=new Scanner(System.in);
		int a=10, b=20;
		
		System.out.print("연산자를 입력하시오 : ");
		char c=s.next().charAt(0);
		
		switch(c) {
		case '+':
			System.out.println(a + "+" + b + "="+ (a+b));
			break;
		case '-':
			System.out.println(a + "-" + b + "="+ (a-b));
			break;
		case '*':
			System.out.println(a + "X" + b + "="+ (a*b));
			break;
		case '/':
			System.out.println(a + "/" + b + "="+ ((double)a/b));
			break;
		default:
			System.out.println("올바른 연산자를 입력해주세요.");
			break;
		}
		*/
		
		
		
		// 문제 2
		
		// 1. 1부터 두번째 정수까지의 총합 출력 (두번째 정수는 무작위 수로(5부터~10까지 범위를 준다.)
		/*
		int a=(int)(Math.random()*6)+5;
		System.out.println("무작위 정수 : " + a);
		
		int sum=0;
		
		for(int i=1; i<=a; i++) {
			sum+=i;
		}  
		System.out.println("1~" + a + "까지의 합은 : "+ sum);
		*/

		
		//2. 1~100 중에서 홀수의 합(2500) 과 짝수의 합(2550)을 각각 구하는 프로그램
		/*
		int sum1=0, sum2=0;
		
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				sum1+=i;
			}
			else
				sum2+=i;
		}
		System.out.println("짝수의 합("+sum1+")"+" 홀수의 합("+sum2+")");
		*/
		
		
		//3. 출생연도를 입력받아 입력한 연도를 12로 나눈 나머지를 사용해 나머지가 0이면 원숭이띠, 1이면 닭띠, 2이면 개띠 출력

		//3-1 switch
		/*
		Scanner s=new Scanner(System.in);
		
		System.out.print("출생년도를 입력하세요 : ");
		int year=s.nextInt();
		int years=year%12;
		
		switch(years) {
		case 0:
			System.out.println("원숭이띠");
			break;
		case 1:
			System.out.println("닭띠");
			break;
		case 2:
			System.out.println("개띠");
			break;
		default:
			System.out.println(year);
			break;
		}
		*/
		
		
		//3-2 if
		/*
		Scanner s=new Scanner(System.in);
		
		System.out.print("출생년도를 입력하세요 : ");
		int year=s.nextInt();
		int years=year%12;
		
		
		if(years==0) {
			System.out.println("원숭이띠");
		}
		else if(years==1) {
			System.out.println("닭띠");
		}
		else if(years==2) {
			System.out.println("개띠");
		}
		else 
			System.out.println(year);
		
		*/
		
		
		// 135p 중첩for문 사용 4x+5y=60 의 모든 해를 구해 (x,y) 형태로 출력 (단, x와 y는 10이하의 자연수)
		/*
		int sum=60;
		
		for(int x1=0; x1<=10; x1++) {
			for(int y1=0; y1<=10; y1++) {
				if(sum==(4*x1)+(5*y1)) {
					System.out.println("(" + x1 + "," + y1 + ")");
				}
			}
		}
		*/
		
		
		// 135p for문을 이용 삼각형을 출력하시오.
		/*
		for(int x1=1; x1<=5; x1++) {
			for(int y1=1; y1<=x1; y1++) {
					System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		
		
	
	}

}
