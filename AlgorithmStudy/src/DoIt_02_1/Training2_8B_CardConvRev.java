package DoIt_02_1;

import java.util.Scanner;

public class Training2_8B_CardConvRev {

	//������ x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ����� ��ȯ�Ѵ�.
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0; //��ȯ ���� �ڸ���
		
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r); //r�� ���� �������� ����
			x/=r; //x�� r�� ���� ���� x�� ����
		} while (x != 0); //x�� 0�� �ƴҵ��� �ݺ�.. x=0�̸� �ݺ��� ����
		
		return digits; //x�� 0�� �Ǹ� �� ��ȯ
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no;		//��ȯ�ϴ� ����
		int cd;		//���
		int dno;	//��ȯ ���� �ڸ���
		int retry;	//�ٽ� �� ��?(�ݺ��� �ٽ� ���� ����)
		
		char[] cno = new char[32]; //��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ���� �迭
		
		System.out.println("10������ ��� ��ȯ�Ѵ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ����: ");
				no = sc.nextInt(); //��ȯ�ϴ� ���� �Է�
			} while (no < 0); //��ȯ�ϴ� ������ 0���� ���� ���� do�� �ݺ� ���
			
			do {
				System.out.print("� ������ ��ȯ�ұ��?(2~36): ");
				cd = sc.nextInt(); //��� �Է�
			} while (cd < 2 || cd > 36); //����� 2���� �۰ų� 36���� Ŭ ��� do�� �ݺ� ���
			
			dno = cardConvR(no, cd, cno); //no�� cd������ ��ȯ
			
			System.out.print(cd + "�����δ� ");
			for(int i=dno-1; i>=0; i--) //���ڸ����� ���ʷ� ��Ÿ��
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");
			
			System.out.print("\n�� �� �� �ұ��? (1.��/0.�ƴϿ�): ");
			retry = sc.nextInt();

		} while (retry == 1); //retry�� 1�̸� do�� �ٽ� �ݺ�
	}
}
