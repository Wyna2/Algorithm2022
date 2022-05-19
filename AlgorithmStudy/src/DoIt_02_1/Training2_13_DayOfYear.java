package DoIt_02_1;

import java.util.Scanner;

//�� �� ��� �� ���� ����
public class Training2_13_DayOfYear {

	//�� ���� �ϼ�
	static int[][] mdays = {
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //���(�� �� �ϼ�..2�� 28�ϱ���)
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  //����(�� �� �ϼ�..2�� 29�ϱ���)
	};
	
	//���� year���� �����ΰ�?(����:1/���:0)
	static int isLeap(int year) {
		return ((year%4==0 && year%100!=0) || year%400==0)?1:0;
		//�ش� ������ 4�� ���� ���� 0�̸鼭 100�� ���� ���� 0�� �ƴ� ���
		//400�� ���� ���� 0�� ��� ����
		//������ ���� ��� 1, ������ �ƴ� ���(���) 0
	}
	
	//���� y�� m�� d���� �� �� ��� �� ���� ����
	static int dayOfYear(int y, int m,int d) {
		int days = d; 			//�ϼ�
		for(int i=1; i<m; i++) //1��~(m-1)���� �� ���� ����
			days+=mdays[isLeap(y)][i-1];
			//isLeap�� �����̸� 1�� �� [1][i-1], ����̸� 0�� �� [0][i-1]
		return days;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry; //�ٽ� ���� ����
		
		System.out.println("�� �� ��� �ϼ��� ���մϴ�.");
		
		do {
			System.out.print("��:"); int year = sc.nextInt(); //�� �Է�
			System.out.print("��:"); int month = sc.nextInt(); //�� �Է�
			System.out.print("��:"); int day = sc.nextInt(); //�� �Է�
			
			System.out.printf("�� �� %d��°�Դϴ�.\n", dayOfYear(year, month, day));
			
			System.out.print("�� �� �� �ұ��?(1.��/0.�ƴϿ�): ");
			retry=sc.nextInt();			
		} while (retry==1);
	}
}
