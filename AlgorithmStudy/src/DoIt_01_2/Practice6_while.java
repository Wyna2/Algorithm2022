package DoIt_01_2;

import java.util.Scanner;

public class Practice6_while {
	//실습 1-4에서 while문이 종료될 때 변수 i값이 n+1이 됨을 확인하세요.
	//변수 i값을 출력하도록 프로그램을 수정하세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n의 값: ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=n) { //i가 n이하면 반복
			sum += i; //sum에 i를 더한다
			i++;	  //i값을 1만큼 증가시킨다.
		}
		System.out.println("변수 i값: "+i);

	}

}
