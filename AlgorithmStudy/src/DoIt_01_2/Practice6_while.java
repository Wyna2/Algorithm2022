package DoIt_01_2;

import java.util.Scanner;

public class Practice6_while {
	//�ǽ� 1-4���� while���� ����� �� ���� i���� n+1�� ���� Ȯ���ϼ���.
	//���� i���� ����ϵ��� ���α׷��� �����ϼ���.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n�� ��: ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=n) { //i�� n���ϸ� �ݺ�
			sum += i; //sum�� i�� ���Ѵ�
			i++;	  //i���� 1��ŭ ������Ų��.
		}
		System.out.println("���� i��: "+i);

	}

}
