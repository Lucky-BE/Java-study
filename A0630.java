import java.util.Scanner;

public class A0630 {
	
	public static void main(String[] args) {
		
		// String 문자열 매소드 연습
		/*
		String str="자바는";
		String str1=" 너무 재밌다!!!!!";
		
		System.out.println(str.concat(str1)); // 문자열 합치기 
		System.out.println(str1.substring(4)); // 문자열 추출
		*/
		
		/*
		// 문제 5-1
		
		int ary1[][]= {{0,1,2},{3,4,5},{6,7,8}};
		
		// 문제 5-2
		
		char ary2[][]= {{'a','b','c'},{'d','e','f'}};
		
		// 문제 6
		
		int ary3[][]=new int[3][4];
		int sum=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				ary3[i][j]=(int)(Math.random()*10);
				sum+=ary3[i][j];
				System.out.print(ary3[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("합은 "+sum);
		*/
		
		
		// 1.500 ~ 1000까지 홀수 합
		/*
		int sum=0;
		for(int i=500;i<=1000;i++) {
			if(i%2!=0) {
				sum+=i;
			}
		}
		System.out.println("500~1000 홀수 합: "+sum);
		*/
		
		// 2.정수하나 입력해서 1부터 정수 입력한 것까지 합 출력
		/*
		Scanner s=new Scanner(System.in);
		
		System.out.println("정수 하나 입력: ");
		int a=s.nextInt();
		int sum=0;
		
		for(int i=1;i<=a;i++) {
			sum+=i;
		}
		System.out.println("1~"+a+"까지의 합: "+sum);
		*/
		
		// 3.시작, 끝값, 증가값 입력해서 합 출력
		/*
		Scanner s=new Scanner(System.in);
		
		System.out.print("시작 입력> ");
		int a=s.nextInt();
		System.out.print("끝 입력> ");
		int b=s.nextInt();
		System.out.print("증가 입력> ");
		int c=s.nextInt();
		int sum=0;
		
		for(int i=a;i<=b;i+=c) {
			sum+=i;
		}
		System.out.println(a+"~"+b+"까지의 합: "+sum);
		*/
		
		// 정수 하나 입력해서 구구단 거꾸로 출력
		/*
		Scanner s=new Scanner(System.in);
		
		System.out.println("몇 단?");
		int n=s.nextInt();
		
		for(int i=9;i>=1;i--) {
			System.out.println(n+" X "+i+" = "+(n*i));
		}
		*/
		
		// 2행 3열에 값 입력해서 출력
		/*
		Scanner s=new Scanner(System.in);
		
		int a[][]=new int[2][3];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		*/
		
		// 배열에서 짝수만 출력
		/*
		int ary[][]={{1,2,3},
					 {4,5},
					 {6}};
		
		for(int i=0;i<ary.length;i++) {
			for(int j=0;j<ary[i].length;j++) {
				if(ary[i][j]%2==0) {
					System.out.print(ary[i][j]+" ");
				}
			}
		}
		*/
		
		
		// for-each
		/*
		int a[]= {1,2,3,4,5};
		
		for(int b:a) {
			System.out.print(b);
		}
		*/
		
		// 배열함수를 이용한 정답 맞추기
		/*
		String ary[][]= {{"book","책"},
						 {"water","물"},
						 {"note","공책"}};
		
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<ary.length;i++) {
			System.out.println(ary[i][0]+"의 뜻은?");
			String answer=s.next();
			
			if(answer.equals(ary[i][1])) {
				System.out.println("정답");
			}
			else {
				System.out.println("오답! 정답은 "+ary[i][1]);
			}
		}
		*/
		
		
		
		
		
		
	}

}
