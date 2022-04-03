package DoIt_01_2;

import java.util.Scanner;

public class Practice11_digit {
	//양의 정수 입력하고 자릿수 출력하는 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요: ");
		int num=sc.nextInt();
		
		int d=0;
		int su=1;
		int cnt=0;
		do {
			cnt++;
			su*=10;
			d=num/su;
		} while (d>=1);
		
		System.out.println("그 수는 "+cnt+"자리 입니다.");
		
	}

}
