package DoIt_01_2;

import java.util.Scanner;

public class Training1_4_SumWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=n) { //i가 n이하면 반복
			sum += i; //sum에 i를 더한다
			i++;	  //i값을 1만큼 증가시킨다.
		}
		System.out.println("1부터 "+n+"까지의 합은 "+sum+" 입니다.");
	}

}
