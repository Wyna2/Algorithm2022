package DoIt_01_2;

import java.util.Scanner;

//���� �Ʒ��� ������ �̵ �ﰢ�� ���
public class Training1_8_TriangleLB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ�� ���");
		
		do { //�̵ �ﰢ�� �ܼ��� �Է��Ѵ�.
			System.out.print("�� �� �ﰢ�� �Դϱ�? ");
			n = sc.nextInt();
		} while (n<=0); //n�� 0���� ���ų� ������ do �ݺ���
		
		for(int i=0; i<=n; i++) {
			for(int j=1; j<i; j++)
				System.out.print('*');
			System.out.println();
		}
	}
}
