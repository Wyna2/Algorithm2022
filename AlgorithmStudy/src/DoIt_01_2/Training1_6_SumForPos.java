package DoIt_01_2;

import java.util.Scanner;

public class Training1_6_SumForPos {
	//1~n까지의 합 구하기(양수만 입력)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do { //do~while n이 0보다 클때까지 반복한다.
			System.out.print("n의 값: ");
			n = sc.nextInt();
		} while(n<=0);
			
		int sum=0;
		
		for(int i=0; i<=n; i++)
			sum+=i;
		
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
	}

}
