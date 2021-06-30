import java.util.Scanner;
public class A0630_1 {
	public static int cal(int a, int b, int oper) {
		int result;
	
		switch(oper) {
		case 1:
			result=a+b;
			break;
		case 2:
			result=a*b;
			break;
		case 3:
			result=a-b;
			break;
		default:
			result=0;
		}
		return result;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int r;
		int oper,a,b;
		
		System.out.println("1 : +, 2 : *, 3 : -");
		oper=sc.nextInt();
		
		System.out.println("첫번째 숫자 입력");
		a=sc.nextInt();
		
		System.out.println("두번째 숫자 입력");
		b=sc.nextInt();
		
		r=cal(a,b,oper);
		
		System.out.println("결과 "+r);
		
	}
}

