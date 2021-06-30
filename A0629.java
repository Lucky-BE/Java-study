import java.util.Scanner;

public class A0629 {

	public static void main(String[] args) {
		
		// 1~100까지 중 5의 배수이고 10의 배수의 총합
		// (while, do~while, for)
		/*
		int a=1, sum=0;
		
		while(a<=100) {
			if(a%5==0 && a%10==0) {
				sum+=a;
			}
			a++;
		}
		System.out.println(sum);
		
		
		int b=1, sum1=0;
		
		do {
			if(b%5==0 && b%10==0){
				sum1+=b;
			}
			b++;
		}while(b<=100);
		System.out.println(sum1);

		
		int sum2=0;
		for(int i=1;i<=100;i++) {
			if(i%5==0 && i%10==0) {
				sum2+=i;
			}
		}
		System.out.println(sum2);
		*/
		
		
		// 배열 초기화
		
		//int ary[]=new int[] {1,2,3,4,5};
		
		
		// 정수5개 입력해서 제일 큰 값 출력
		/*
		int []a=new int[10];
		Scanner s=new Scanner(System.in);
		
		//6 2 7 1 9
		int big=0;
		for(int i=0;i<a.length;i++) {
			System.out.print("정수입력>");
			a[i]=s.nextInt();
			if(big<a[i]) {
				big=a[i];
			}
		}
		System.out.println("제일 큰 값은! "+big);
		*/
		
		
		// 2행 3열 출력
		/*
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		
		// 문제 1
		/*
		//for
		int sum1=0;
		for(int i=1;i<=10;i++) {
			sum1+=i;
		}
		System.out.println("총합 : "+sum1);
		
		
		//while
		int a=1,sum2=0;
		
		while(a<=10) {
			sum2+=a;
			a++;
		}
		System.out.println("총합 : "+sum2);
		
		//do~while
		int b=1,sum3=0;
		
		do {
			sum3+=b;
			b++;
		}while(b<=10);
		System.out.println("총합 : "+sum3);
		*/
		
		
		// 문제2
		/*
		Scanner s=new Scanner(System.in);
		int n,sum=0,count=0;
		double avg;
		
		while((n=s.nextInt())!=0) {
			sum+=n;
			count++;
		}
		avg=(double)sum/count;
		System.out.println("평균="+avg);
		*/
		
		
		// 문제3-1
		/*
		int i=0,sum=0;
		
		while(true) {
			i+=2;
			sum+=i;
			if(i>=10) {
				break;
			}
		}
		System.out.println(sum);
		*/
		
		// 문제3-2
		/*
		int i=0,sum=0;
		
		do {
			i+=2;
			sum+=i;
			if(i>=10) {
				continue;
			}
		}
		while(i<10);
		System.out.println(sum);
		*/
		/*
		int i=0,sum=0;
		
		do {
			i+=1;
			if(i%2==1) {
				continue;
			}
			sum+=i;
		}
		while(i<10);
		System.out.println(sum);
		*/
		
		
		/*
		// 문제 4-1
		
		char a[]=new char[10];
		
		// 문제 4-2
		
		int b[]= {0,1,2,3,4};
	
		// 문제 4-3
		
		String c[]= {"java","c","c++"};
		
		// 문제 4-4
		
		int d[]=new int[10];
		*/
		
		
		// for-each
		/*
		String str[]= {"컴퓨터","자바","DB"};
		
		for(String s :str) {
			System.out.println(s);
		}
		*/
		
		/*
		int sum=0;
		int ary[]= {1,2,3,4,5};
		for(int a:ary) { // 순차적으로 대입
			sum+=a;
		}
		System.out.println(sum);
		*/
		
		
		// 정수 10개 입력받아 배열에 저장 한 후 5의 배수 정수만 출력
		/*
		Scanner s=new Scanner(System.in);
		
		int a[]=new int[10];
		
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			}
			for(int n:a) {
			if(n%5==0) {
				System.out.print(n+" ");
				}
			}
		*/
		
		/*
		int [][] aa=new int[2][2]; // int [][]aa=new int[][] {{1,2},{3,4}};
		
		aa[0][0]=1;
		aa[0][1]=2;
		aa[1][0]=3;
		aa[1][1]=4;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(aa[i][j]);
			}
		}
		*/
		
		
		// 실수 2행 3열 초기화/한번에 출력
		/*
		Scanner s=new Scanner(System.in);
		
		double ary[][]=new double[2][3];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				ary[i][j]=s.nextDouble();
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(ary[i][j]);
			}
		}
		*/
		
		// 2차원 배열 연습
		/*
		int a[][]= {{1,2,3},{4,5,6}};
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]);
				}
			System.out.println();
		}
		*/
		
		
		// p182 7번
		/*
		int max=0;
		int[] array= {1,5,3,8,2};
		
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}System.out.println("max: "+max);
		*/
		
		
		// p182 8번
		/*
		int[][] array= {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum=0;
		double avg=0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				sum+=array[i][j];
			}
		}
		avg=(double)sum/(array[0].length+array[1].length+array[2].length);
		
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
		*/
		
		// 2차원 배열2
		/*
		int ary[][]= {{1,2},{3,4},{5,6}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(ary[i][j]+"\t");
			}
			System.out.println();
		}
		*/
		
		
		// 배열연습
		/*
		String s[][]= {{"java"},{"c","c++"},{"html","css","phyton"}};
		
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length;j++) {
				System.out.println(s[i][j]);
			}
		}
		*/
		
		
		
		/*
		// 2행 4열 1,2,3,4,5,6,7,8 을 초기화
		int a[][]= {{1,2,3,4},{5,6,7,8}};
		// 4행 2열 배열선언
		int b[][]=new int[4][2];
		// 2행4열 -> 4행2열 바꾸기
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[j][i]=a[i][j];
			}
		}
		// 출력
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		*/
		
		
		// 2행3열의 배열 선언 후 입력한 배열값의 총합 구하기
		/*
		int ary[][]=new int[2][3];
		
		Scanner s=new Scanner(System.in);
		
		int sum=0;
		
		for(int i=0;i<ary.length;i++) {
			for(int j=0;j<ary[i].length;j++) {
				ary[i][j]=s.nextInt();
				sum+=ary[i][j];
			}
		}
		System.out.println(sum);
		*/
		
		// length 연습
		/*
		String str="IT. Java Programming"; // 공백 포함 20글자
		int len=str.length();
		
		System.out.println(len);
		*/
		
		
		//	replace, substring 연습
		/*
		Scanner s=new Scanner(System.in);
		String str,str1,str2;
		
		System.out.println("문자열 입력");
		str=s.nextLine();
		
		str1=str.replace("J","j"); // J를 j로 변경
		str2=str.substring(3, 8); // 문자열 인덱스 3부터 8까지 추출
		
		System.out.println(str1);
		System.out.println(str2);
		*/
		
		
		// split 연습
		
		//String str="오늘은 화요일, 공부하고 티비봄!!";
		/*
		String a[]=str.split(","); // 문자열 분리 후 배열에 저장
		
		for(String b:a) {
			System.out.println(b);
		}
		*/
		
		
		//String a=str.substring(4,7); // 화요일 출력
		//System.out.println(a);
	
		//String b=str.replace("공부","study");
		//System.out.println(b);
		
		
		// concat 문자열 연결
		/*
		String str="오늘은 화요일";
		String str1=str.concat("내일은 수요일");
		
		System.out.println(str1);
		*/
		
		
		// 앞뒤 공백 제거
		/*
		String str="     한글 ABCD efgh       ";
		String str1=str.trim();
		System.out.println(str1);
		*/
		
		
		
		// 두 문자열을 이용한 연습
		/*
		Scanner s=new Scanner(System.in);
		
		String str,str1,str2; // 변수선언
		// 입력 부분
		System.out.print("문자열1 입력: ");
		str1=s.nextLine();
		System.out.print("문자열2 입력: ");
		str2=s.nextLine();
		str=str1.concat(str2);
		// 출력 부분
		System.out.println("합쳐진 문자열: "+str);
		System.out.println("문자열1 길이: "+str1.length());
		System.out.println("문자열2 길이: "+str2.length());
		if(str1.equals(str2)) {
			System.out.println("두 문자열은 같다");
		}
		else {
			System.out.println("두 문자열은 다르다");
		}
		*/
		
		
		// 문제 풀이 연습
		/*
		// 문제 1
		
		System.out.println((int)(50+11.8));
		
		// 문제 2
		
		int n=0;
		
		while(true) {
			if(n%3==0) {
				n++;
				continue;
			}
			else{	
				System.out.print(n+" ");
				n++;				
			}
			if(n==20) {
				break;
			}
		}
		*/
		
		// 문제 3 | 평균 출력
		/*
		Scanner s=new Scanner(System.in);
		
		int a[]=new int[10];
		int sum=0;
		double avg;
		
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
			sum+=a[i];
		}
		avg=(double)sum/a.length;
		System.out.println("평균: "+avg);
		*/
		
		// 문제 3-1 | 7의 배수만 출력
		/*
		Scanner s=new Scanner(System.in);
		
		int a[]=new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%7==0) {
				System.out.print(a[i]+" ");	
			}
		}
		*/
		
		// 문제 4-1 while
		/*
		double sum=0.0;
		double ary[]={1.0, 1.5, 2.0, 2.5};
		
		int i=0;
		while(i<ary.length) {
			sum+=ary[i];
			i++;
		}
		System.out.println(sum);
		*/
		
		// 문제 4-2 do~while
		/*
		double sum=0.0;
		double ary[]={1.0, 1.5, 2.0, 2.5};
		
		int i=0;
		
		do {
			sum+=ary[i];
			i++;
		}while(i<ary.length);
		System.out.println(sum);
		*/
		
		// 문제 4-3 for~each
		/*
		double sum=0.0;
		double ary[]={1.0, 1.5, 2.0, 2.5};
		
		for(double sum1 : ary) {
			sum+=sum1;
		}
		System.out.println(sum);
		*/
		
		
		// 초기화 없이 배열 출력
		/*
		int ary[][]=new int[3][4];
		int n=1;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				ary[i][j]=n;
				n++;
				System.out.print(ary[i][j]+"\t");
			}
			System.out.println();
		}
		*/
		
		
		// String 문자열 바꾸기 replace
		/*
		Scanner s=new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str=s.nextLine();
		System.out.print("문자열 출력:"+ str.replace("a","o"));
		*/
		
		// 문자열 길이 비교 후 긴것 출력
		/*
		Scanner s=new Scanner(System.in);
		
		String a=s.next(); //apple
		String b=s.next(); //strawberry
		
		if(a.length()>b.length()) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
		*/
		
		
		// 문자열 사전적 비교
		/*
		String a="apple";
		String b="banana";
		
		if(a.compareTo(b)>0) { // a>b (a가 b보다 나중에 나온다)
			System.out.println(a);
		}
		else if(a.compareTo(b)<0){ //a<b (b가 a보다 나중에 나온다)
			System.out.println(b);
		}
		else { //a.compareTo(b)==0
			System.out.println("같은 문자열!");
		}
		*/
		
		
		
	}
}
