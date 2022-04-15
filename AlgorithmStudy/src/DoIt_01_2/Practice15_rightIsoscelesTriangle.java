package DoIt_01_2;

import java.util.Scanner;

public class Practice15_rightIsoscelesTriangle {
	

	//���� �Ʒ��� ������ �����̵�ﰢ�� ��� �޼���
	static void triangleLB(int n) {
		System.out.print("\n**���� �Ʒ��� ������ �����̵�ﰢ�� ���**");
		
		for(int i=0; i<=n; i++) {
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	//���� ���� ������ �����̵�ﰢ�� ��� �޼���
	static void triangleLU(int n) {
		System.out.print("\n\n**���� ���� ������ �����̵�ﰢ�� ���**\n");
		
		for(int i=n; i>=0; i--) {
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}		
	}
	
	//������ ���� ������ �����̵�ﰢ�� ��� �޼���
	static void triangleRU(int n) {
		System.out.print("\n\n**������ ���� ������ �����̵�ﰢ�� ���**\n"); ////
		
		for(int i=n; i>=0; i--) {
			for(int j=1; j<=n-i; j++)
				System.out.print(' ');
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	//������ �Ʒ��� ������ �����̵�ﰢ�� ��� �޼���
	static void triangleRB(int n) {
		System.out.print("\n\n**������ �Ʒ��� ������ �����̵�ﰢ�� ���**"); ////
		
		for(int i=0; i<=n; i++) {
			for(int j=1; j<=n-i; j++)
				System.out.print(' ');
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}	
	}
	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		
		do {
			System.out.print("���� �Է�: ");
			n = sc.nextInt();
		} while(n<=0);
		
		triangleLB(n); //���� �Ʒ� �����ﰢ��
		triangleLU(n); //���� ��
		triangleRU(n); //������ ��
		triangleRB(n); //������ �Ʒ�
	}

}
