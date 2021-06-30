import java.util.Scanner;
public class P0134 {

	public static void main(String[] args) {
		
		// 문제 4
		/*
		while(true) {
			
			int x=(int)(Math.random()*6)+1;
			int y=(int)(Math.random()*6)+1;
			
			if(x+y!=5) {
				System.out.println("("+x+","+y+")");
			}
			else {
				System.out.println("("+x+","+y+")");
				break;
			}
		}
		*/
		
		// 문제 5
		/*
		
		for(int x1=0; x1<=10; x1++) {
			for(int y1=0; y1<=10; y1++) {
				if((4*x1)+(5*y1)==60) {
					System.out.println("(" + x1 + "," + y1 + ")");
				}
			}
		}
		*/
		
		// 문제 6
		/*
		for(int x1=1; x1<=5; x1++) {
			for(int y1=1; y1<=x1; y1++) {
					System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		// 문제 7
		/*
		boolean run=true;
		
		int balance=0;

		Scanner s=new Scanner(System.in);
		
		bank:while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
		
			int n=s.nextInt();
			
			switch(n) {
			case 1:
				System.out.print("예금액>");
				int in=s.nextInt();
				if(in>=1) {
					balance+=in;
					System.out.println();
					break;
				}
				else {
					System.out.println("예금은 1원 이상만 가능합니다.\n");
					break;
				}
			case 2:
				System.out.print("출금액>");
				int out=s.nextInt();
				if(out<=balance && out>=1) {
					balance-=out;
					System.out.println();
					break;
				}
				else {
					System.out.println("잔고가 부족합니다.\n");
					break;					
				}
			case 3:
				System.out.print("잔고>"+balance);
				System.out.println("\n");
				break;
			case 4:
				System.out.println();
				break bank;
			default:
				System.out.println("다시 입력해주세요.");
				System.out.println();
				break;
			}
		}
		System.out.println("프로그램 종료");
		*/
		
		
		
		
		
		
		
		
		
	}

}
