import java.util.Scanner;

public class A0625 {

	public static void main(String[] args) {
		
		// 문제1
		/*
		Scanner s=new Scanner(System.in);
		
		System.out.println("첫번째 과목의 점수를 입력하세요 : ");
		int sub1=s.nextInt();
		
		System.out.println("두번째 과목의 점수를 입력하세요 : ");
		int	sub2=s.nextInt();
		
		double avg= (sub1+sub2)/2.0;
		System.out.printf("%.1f", avg);
		*/
		
		
		// 문제2
		/*
		Scanner s=new Scanner(System.in);
		
		System.out.println("방문시간");
		int time=s.nextInt();
		System.out.println("물건 갯수 : ");
		int n=s.nextInt();
		
		double money=100000;
		
	
		if(time==14 && n<=3) {
			money=money*0.95;
		}
		else if(time==18 && n<=5) {
			money*=0.9;
		}
		else if(time==20 && n<=10) {
			money*=0.8;
		}
		System.out.println((int)money);
		*/
		
		
		
		
		/*
		// 6~25 범위설정
		int n=(int)(Math.random()*20)+6;
		System.out.println("무작위n 숫자 출력 : "+ n);
		
		// 26~50까지 범위설정
		int m=(int)(Math.random()*25)+26;
		System.out.println("무작위m 숫자 출력 : "+ m);
		
		// n~m까지 총합 출력
		int sum=0;
		for(int i=n; i<=m; i++) {
			sum+=i;
		}
		System.out.println(n + " ~ "+ m + "의 합 :" + sum);
		*/
		
		
		// 1~40 까지 수 중 10의 배수만 출력
		/*
		for(int i=1; i<=40; i++) {
			if(i%10==0) {
				System.out.println(i);
			}
		}
		*/
		
		// 100+11.8의 결과를 소수점을 버리고 출력해라.
		
		//System.out.println((int)(100+11.8));

		
		// 정수하나 입력받아 정수의 단 출력
		/*
		Scanner s=new Scanner(System.in);
		
		System.out.println("정수 입력");
		int n=s.nextInt();
		
		switch(n) {
		case 1:
			for(int i=1; i<=9; i++) {
				System.out.println(n+"X"+i+"="+n*i);
			}
		break;
		case 2:
			for(int i=1; i<=9; i++) {
				System.out.println(n+"X"+i+"="+n*i);
			}
		break;
		case 3:
			for(int i=1; i<=9; i++) {
				System.out.println(n+"X"+i+"="+n*i);
			}
		break;
		case 4:
			for(int i=1; i<=9; i++) {
				System.out.println(n+"X"+i+"="+n*i);
			}
		break;
		default:
			System.out.println("1~4단만 가능합니다.");
		break;
		}
		*/
		
		
		// $$$ 모양 출력하기 
		// $$$ for, if 활용
		/*
		for(int i=1; i<=6; i++) {
			System.out.print("$");
			if(i%3==0) {
				System.out.println();
			}
		}
		*/
		
		
		// 실수 2개 입력받아 몫과 나머지 출력
		/*
		Scanner s=new Scanner(System.in);
		
		double a=s.nextDouble();
		double b=s.nextDouble();
		
		System.out.println("몫 : " + a/b);
		System.out.println("나머지 : " + (int)(a%b));
		*/
		
		
		// 0~10까지 0, 2, 4, 6, 8 10 만 출력
		/*
		for(int i=0; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		*/
		
		
		// 중첩 for문은 행을 기준으로 열이 반복됨
		/*
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		for(int i=1; i<=9; i++) {
			System.out.print("*");
			if(i%3==0)
				System.out.println();
		}
		*/
		
		// 정수를 입력받아 역삼각형 만들기
		//Scanner s=new Scanner(System.in);
		
		/*
		int a=s.nextInt();
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<a-i;j++) {
				System.out.print("*");
			} System.out.println();
		} 
		*/
		
		
		// 입력받아 삼각형 출력(왼쪽 공백후 * 출력)
		/*
		int a=s.nextInt();
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<(a-1)-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		// 마름모 반쪽 만들
		/*
		for(int i=0; i<9; i++) {
			if(i<5) {
				for(int j=0; j<4-i; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<i+1; j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j=0; j<i-4; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<9-i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		*/
		
		
		// 중첩 반복문으로 3~5단 출력
		/*
		for(int i=3; i<=5; i++) {
			System.out.println(i+"단");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"X"+j+"="+i*j);	
			}
			System.out.println();
		}
		*/
		
		
		// while 문 연습
		/*
		int i=1;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		*/
		
		//자바는 너무 재밌어 5번 출력 (while 이용)
		/*
		int i=1;
		
		while(i<=5) {
			System.out.println("자바는 너무 재밌어");
			i++;	
		}
		*/
		
		// 1~100까지 총합
		/*
		int sum=0;
		int i=1;
		
		while(i<=100) {
			sum+=i;
			i++;			
		}
		System.out.println("합 : "+sum);
		*/
		
		
		// 0부터 10까지 while 문
		/*
		int i=0;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		*/
		
		
		// 숫자 피라미드 만들기
		/*
			for(int i = 1; i <= 5; i++) {
				for(int j = 1; j <= 5 - i ; j++) {
					System.out.print(" ");
				} 
				for(int j = 1; j <= (i * 2) - 1; j++) {
					System.out.print(j);
				} 
				System.out.println();
			}
		*/
		
		
		
		// while 사용 1~10까지 정수중 짝수 출력
		/*
		int i=1;
		
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		*/
		
		
		// 무한루프
		/*
		Scanner s=new Scanner(System.in);
		
		while(true) { // 무한루프
			System.out.println("이름 입력 : ");
			String name=s.next();
			
			if(name.equals("병은")) {
				break;
			}
			System.out.println(name);
		}
		*/
		
		// while 문을 이용한 구구단 출력
		/*
		Scanner s=new Scanner(System.in);
		System.out.println("정수 2~3 중 하나 입력 : " );
		int n=s.nextInt();
		int m=1;
		
		switch(n) {
		case 2:
			while(m<=9) {
				System.out.println(n+"X"+m+"="+n*m);
				m++;
			}
			break;
		
		case 3:
			while(m<=9) {
				System.out.println(n+"X"+m+"="+n*m);
				m++;
			}
			break;
		}
		*/
		
		
		// while 연습
		
		// while문으로 1~10 까지 출력
		/*
		int n=1;
		
		while(n<=10) {
			System.out.println(n);
			n++;
		}
		*/
		
		// while 문으로 1~10까지의 합 출력
		/*
		int m=1;
		int sum=0;
		
		while(m<=10) {
			sum+=m;
			m++;
		}
		System.out.println(sum);
		*/
		
		
		
		
	}

}
