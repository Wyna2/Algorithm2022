package DoIt_01_2;

import java.util.Scanner;

public class Training1_4_SumWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n�� ��: ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=n) {
			sum += i;
			i++;
		}
		System.out.println("1���� "+n+"������ ���� "+sum+" �Դϴ�.");
	}

}
