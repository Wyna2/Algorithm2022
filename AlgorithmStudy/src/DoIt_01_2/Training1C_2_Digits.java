package DoIt_01_2;

import java.util.Scanner;

public class Training1C_2_Digits {
	//2�ڸ��� ���(10~99)�� �Է��մϴ�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("2�ڸ��� ������ �Է��ϼ���.");
		
		do { //do~while n�� 10���� �۰ų� 99���� Ŭ ��� ������ �ݺ��Ѵ�.
			System.out.print("�Է�: ");
			n = sc.nextInt();
		} while(n<10 || n>99);
					
		System.out.println("���� n�� ���� "+n+"��(��) �Ǿ����ϴ�.");
	}

}
