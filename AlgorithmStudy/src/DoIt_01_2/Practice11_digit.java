package DoIt_01_2;

import java.util.Scanner;

public class Practice11_digit {
	//���� ���� �Է��ϰ� �ڸ��� ����ϴ� ���α׷�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���: ");
		int num=sc.nextInt();
		
		int d=0;
		int su=1;
		int cnt=0;
		do {
			cnt++;
			su*=10;
			d=num/su;
		} while (d>=1);
		
		System.out.println("�� ���� "+cnt+"�ڸ� �Դϴ�.");
		
	}

}
