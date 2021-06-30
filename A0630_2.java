import java.util.Scanner;
public class A0630_2 {
	
	public static void func1(int a) {
		a=a+1;
		System.out.println(a); // 11
	}
	public static void main(String[] args) {
		
		int a=10; // 지역변수
		func1(a); // 함수호출
		System.out.println(a); // 10
		
		
		
		
	}
}


