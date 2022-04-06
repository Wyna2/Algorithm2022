package DoIt_01_2;

import java.util.Scanner;

public class Training1C_2_Digits {
	//2자리의 양수(10~99)를 입력합니다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("2자리의 정수를 입력하세요.");
		
		do { //do~while n이 10보다 작거나 99보다 클 경우 루프를 반복한다.
			System.out.print("입력: ");
			n = sc.nextInt();
		} while(n<10 || n>99);
					
		System.out.println("변수 n의 값은 "+n+"가(이) 되었습니다.");
	}

}
