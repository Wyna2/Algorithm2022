package DoIt_01_2;

import java.util.Scanner;

public class Training1_5_SumFor {
	//1~n�� �� ���ϱ�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ��: ");
		int n = sc.nextInt();
		
		int sum=0; //��
		
		for(int i=0; i<=n; i++)
			sum+=i; //sum�� i�� ���Ѵ�.
		
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");

	}

}
