import java.util.Scanner;

public class A0628 {

	public static void main(String[] args) {
		
		// 숫자 피라미드
		/*
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<(i*2)+1; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		*/
		
		
		// for, if 1~10까지 수 주 2의 배수 출력
		/*
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		*/
		
		
		// while 1부터 10까지
		/*
		int i=1;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		*/
		
		
		// while if문 이용 0~10 수 중 2의배수
		/*
		int n=0;
		
		while(n<=10) {
			if(n%2==0) {
				System.out.println(n);
			}
			n++;
		}
		*/
		
		
		// 입력받은 정수의 총합
		/*
		Scanner s=new Scanner(System.in);
		
		int sum=0, n=100;
		
		while(n!=0) {
			System.out.println("입력해라");
			n=s.nextInt();
			sum+=n;			
		}
		System.out.println(sum);
		*/
		
		
		// continue
		/*
		for(int i=1; i<=10; i++) {
			if(i%2!=0) { // 짝수가 아니면
				continue; // 반복문 다시 실행
			}
			System.out.println(i);
		}
		*/
		
		
		// 입력받은 값 누적합 구하기
		/*
		Scanner s=new Scanner(System.in);
		System.out.println("정수 5개 입력");
		
		int sum=0; //
		
		for(int i=0;i<5;i++){
			int n=s.nextInt();
			
			if(n<0) {
				System.out.println("다시입력하세요");
				continue;
			}
			else {
				sum+=n;
			}
		}
		System.out.println(sum);
		*/
		
		
		// 3. 중첩 반복문으로 5단부터 9단까지 출력
		/*
		for(int i=5; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i+"X"+j+"="+i*j);
			}
			System.out.println();
		}
		*/
		
		
		// 4. while문을 이용해서 1부터 100까지 정수 중 5의배수의 총합을 출력
		/*
		int sum=0, n=1;
		
		while(n<=100) {
			if(n%5==0) {
				sum+=n;
			}
			n++;
		}
		System.out.println(sum);
		*/
		
		
		//5. while, random()을 이용해서 (x,y)형태로 출력하는데 
		//x+y합이 5이면 실행을 멈추는 코드를 작성. 
		//5가 아니면 난수 계속 발생시키고출력 (x,y 범위는 1부터 5까지)
		/*
		while(true) {
			
			int x=(int)(Math.random()*5)+1;
			int y=(int)(Math.random()*5)+1;
			
			if(x+y!=5) {
				System.out.println("("+x+","+y+")");
			}
			else {
				System.out.println("("+x+","+y+")");
				break;
			}
		}
		*/
		
		
		// do while
		/*
		int n=1;
		
		do {
			if(n%2==0) {
				System.out.println(n);
			}
			n++;
		}while(n<=10);
		*/
		
		
		// 130p
		/*
		Scanner s=new Scanner(System.in);
		
		System.out.println("메시지를 입력하세");
		System.out.println("종료하려면 q를 입력");
		
		String inputString;
		
		do {
			System.out.print(">");
			inputString = s.nextLine();
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		
		System.out.println();
		System.err.println("프로그램 종료");
		*/
		
		
		// 6번 정답 맞추기 게임
		/*
		int answer=18;
		int cnt=0;
		
		Scanner s=new Scanner(System.in);
		
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int n=s.nextInt();
			cnt++;
			if(n<answer) {
				System.out.println(n+"보다 크다!!");
			}
			else if(n>answer) {
				System.out.println(n+"보다 작다!!");
			}
			else {
				System.out.println("정답이다!!");
				break;
			}
		}
		System.out.println("시도한 횟수는 "+cnt+"번이다.");
		*/
		
		
		// 1~99 사이의 정수 중 2의 배수 또는 3의 배수 출력(반복문 1개 사용)
		// while-if문 중첩
		/*
		int n=1;
		
		while(n<=99) {
			if(n%2==0 || n%3==0) {
				System.out.println(n);
			}
			n++;
		}
		*/
		
		
		// 한 문자를 입력받아 아스키코드로 저장 후 다시 문자 출력
		/*
		System.out.println("한 문자 입력");
		Scanner s=new Scanner(System.in);
		
		char c=s.next().charAt(0);
		int n=(int)c;
		
		for(int i=97;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				char ch=(char)j;
				System.out.print(ch);
			}
			System.out.println();
		}
		*/
		
		
		// 1~20 do-while 총합
		/*
		int n=1,sum=0;
	
		do {
			sum+=n;
			n++;
		}while(n<=20);
		System.out.println(sum);
		*/
		
		
		// 1~10까지 합 구함 합이 30되면 탈
		/*
		int sum=0,i=1;
		while(i<=10) {
			sum+=i;
			if(sum>=30) {
				break;
			}
			else {
				i++;
			}
		}
		System.out.println(sum);
		*/
		
		
		// while(true) 사용 첫번째 수가 0이면 반복문 탈출
		/*
		Scanner s=new Scanner(System.in);
		
		int sum=0;
		
		while(true) {
			System.out.print("첫번째 수:");
			int a=s.nextInt();
			System.out.print("두번째 수:");			
			int b=s.nextInt();
			
			
			if(a!=0) {
				System.out.println(a+"+"+b+"="+(a+b));
			}
			else {
				break;
			}
		}
		System.out.println("반복문 탈출");
		*/
		
		
		//0~9까지 수 중에서
		//홀수만 출력(while, if, continue사용)
		/*
		int n=0;

		while(n<=9) {
		   n++;
		   if(n%2==0) {
			   continue;
		   }
		   else {
		    System.out.println(n);
		   }
		}
		*/
		  		
		
		// 5의 배수와 8의 배수들의 합 출력
		/*
		int n=1,sum=0;
		
		while(n<=100) {
			if(n%5==0 || n%8==0) {
				sum+=n;
			}
			n++;
		}
		System.out.println("5의 배수와 8의 배수들의 합:"+sum);
		*/
		
		
		// 배열 [] <- 배열기호
		/*
		int ary[]=new int[5]; // 배열선언 index
		
		int a[]=new int[5]; // 정수인 배열 5개
		
		double b[]=new double[10]; // 실수 10개 저장 배열
		
		int b[]=new int[3];	// 배열 요소 수가 3개 
		
		char ch[]=new char[5]; // 인덱스 최댓값이 4인 char형 배열
		*/
		
		/*
		//int a[]=new int[5];
		int a[]= new int [] {10,20,30,40,50};
		int b[]= {10,20,30,40,50};
		*/
		
		
		//
		/*
		int ary[]= {15,2,6,8,11};
		
		for(int i=0;i<5;i++) {
			System.out.println(ary[i]);
		}
		*/
		
		
		// 실수 3개 입력
		/*
		Scanner s=new Scanner(System.in);
		double d[]=new double[3]; // 실수 3개 입력
		
		for(int i=0;i<3;i++) {
			d[i]=s.nextDouble();
			System.out.println(d[i]);
		}
		*/
		
		
		// length 활용 
		/*
		Scanner s=new Scanner(System.in);
		double a[]=new double[5];
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextDouble();
			sum+=a[i];
		}
		System.out.println("평균"+(double)sum/a.length);
		*/
		
		
		// 입력받은 정수의 총합과 총곱
		/*
		Scanner s=new Scanner(System.in);
		int sum=0;
		int multi=1;
		int ary[]=new int[4];
		
		for(int i=0;i<ary.length;i++) {
			System.out.println(i+1+"번째 숫자를 입력하세요");
			ary[i]=s.nextInt();
			sum+=ary[i];
			multi*=ary[i];
		}
		System.out.println("합계 : "+sum);
		System.out.println("곱셈 : "+multi);
		*/
		
		
		// 5층 아파트 층당 인원 입력 후 총 인원 구하기
		/*
		Scanner s=new Scanner(System.in);
		
		int a[]=new int[5];
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(i+1+"층 인원 입력");
			a[i]=s.nextInt();
			sum+=a[i];
		}
		System.out.println("5층까지의 인구수 총합 : "+sum);
		*/
		
		
		// 피보나치 수열
		/*
		int ary[]=new int[10];
		ary[0]=1; ary[1]=2;
		
		for(int i=0;i<ary.length-2;i++) {
			ary[i+2]=ary[i]+ary[i+1];
		}
		for(int i=0;i<ary.length;i++) {
			System.out.print(ary[i]+" ");
		}
		*/
		
		
		//실수 3개 평균
		/*
		Scanner scan = new Scanner(System.in);
		double d[] = new double[3];
		double sum = 0; 
		for(int i = 0; i < d.length; i++) {
			System.out.println((i + 1) + "번째 실수 입력 : ");
			d[i] = scan.nextDouble();
			sum += d[i];
		}
		double avg = sum / d.length;
		System.out.println(avg);
		*/
		
		
		
		

	}

}
