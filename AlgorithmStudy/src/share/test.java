package share;

import java.util.Scanner;

public class test {
	
	public static int test(int n) {
		
		int answer = 0;
		
		if(n%3==0 && n%5==0) {
			answer = 3;
		} else if(n%3==0) {
			answer = 1;
		} else if(n%5==0) {
			answer = 2;
		} else
			answer = n;
		
		return answer;
		
	}

	public static void main(String[] args) {
		//1부터 100까지 숫자 중 화면에 3의 배수는 1 출력, 5 배수일땐 2, 3과 5의 공배수일때는 3 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int n = sc.nextInt();
		
		System.out.print("결과 값: ");
		System.out.println(test(n));
		
		//1부터 100까지 숫자 중 3의 배수는 1 출력, 5 배수일땐 2, 3과 5의 공배수일때는 3 출력
		//1부터 10까지 합 3 6 9 5  = 5
		
	}

}
