package DoIt_01_2;

import java.util.Scanner;

public class Practice15_rightIsoscelesTriangle {
	

	//왼쪽 아래가 직각인 직각이등변삼각형 출력 메서드
	static void triangleLB(int n) {
		System.out.print("\n**왼쪽 아래가 직각인 직각이등변삼각형 출력**");
		
		for(int i=0; i<=n; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	//왼쪽 위가 직각인 직각이등변삼각형 출력 메서드
	static void triangleLU(int n) {
		System.out.print("\n\n**왼쪽 위가 직각인 직각이등변삼각형 출력**\n");
		
		for(int i=n; i>=0; i--) {
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}		
	}
	
	//오른쪽 위가 직각인 직각이등변삼각형 출력 메서드
	static void triangleRU(int n) {
		System.out.print("\n\n**오른쪽 위가 직각인 직각이등변삼각형 출력**\n"); ////
		
		for(int i=n; i>=0; i--) {
			for(int j=1; j<=n-i; j++)
				System.out.print(' ');
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	//오른쪽 아래가 직각인 직각이등변삼각형 출력 메서드
	static void triangleRB(int n) {
		System.out.print("\n\n**오른쪽 아래가 직각인 직각이등변삼각형 출력**"); ////
		
		for(int i=0; i<=n; i++) {
			for(int j=1; j<=n-i; j++)
				System.out.print(' ');
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}	
	}
	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		
		do {
			System.out.print("숫자 입력: ");
			n = sc.nextInt();
		} while(n<=0);
		
		triangleLB(n); //왼쪽 아래 직각삼각형
		triangleLU(n); //왼쪽 위
		triangleRU(n); //오른쪽 위
		triangleRB(n); //오른쪽 아래
	}

}
