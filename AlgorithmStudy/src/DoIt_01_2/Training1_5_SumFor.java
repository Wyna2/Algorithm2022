package DoIt_01_2;

import java.util.Scanner;

public class Training1_5_SumFor {
	//1~n의 합 구하기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		int n = sc.nextInt();
		
		int sum=0; //합
		
		for(int i=0; i<=n; i++)
			sum+=i; //sum에 i를 더한다.
		
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");

	}

}
