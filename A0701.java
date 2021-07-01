// 배열안의 수중 최댓값 출력하기

import java.util.Scanner;

public class A0701_1 {
	public static int big(int a[]) {
		int max=0;
		
		for(int n:a) {
			if(n>max) {
				max=n;
			}
		}return max;
	}
	
	public static void main(String[] args) {
	
		int a[]=new int[7];
		Scanner s=new Scanner(System.in);
		
		System.out.println("정수 7개 입력: ");
		for(int i=0;i<a.length;i++) {
			
			a[i]=s.nextInt();
		}
		System.out.println(big(a)); // 매개변수가 배열명일때, 호출할때 배열명만 적음
	}

}
