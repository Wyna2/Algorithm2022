package DoIt_01_2;

import java.util.Scanner;

public class Practice10_subtraction {
	//두 변수 a,b 입력하면 b-a 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 수를 입력하세요.");
		
		int a=0;
		int b=0;
		
		System.out.print("a의 값: ");
		a=sc.nextInt();
		System.out.print("b의 값: ");
		b=sc.nextInt();
		
		do {
			System.out.println(a+"보다 큰 값을 입력하세요.");
			System.out.print("b의 값: ");
			b=sc.nextInt();
		} while (b<=a);
		
		System.out.println(b+"-"+a+"는 "+(b-a)+"입니다.");
	}

}
