package DoIt_01_2;

import java.util.Scanner;

public class Training1_6_SumForPos {
	//1~n������ �� ���ϱ�(����� �Է�)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		
		do { //do~while n�� 0���� Ŭ������ �ݺ��Ѵ�.
			System.out.print("n�� ��: ");
			n = sc.nextInt();
		} while(n<=0);
			
		int sum=0;
		
		for(int i=0; i<=n; i++)
			sum+=i;
		
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");
	}

}
