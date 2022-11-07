package DoIt_03_2;

import java.util.Scanner;

public class Practice5 {

	//�迭 a�� ���� n�� ��ҿ��� key�� ���� ��Ҹ� �����˻�
	static int Practice5(int[] a, int n, int key) {
		
		int pl = 0;		//�˻����� �� ���� idx
		int pr = n-1;	//�˻����� �� ���� idx
		
		do {
			int pc = (pl+pr) / 2; //�߾ӿ���� idx
			if(a[pc]==key) {
				for(; pc>pl; pc--) //key�� ���� �� ���� ��Ҹ� ã�´�.
					if(a[pc-1]<key)
						break;
				return pc;	//�˻� ����
			} else if(a[pc]<key) {
				pl = pc+1;	// �˻������� ���� �������� ����
			} else
				pr = pc-1;	//�˻������� ���� �������� ����

		} while (pl <= pr);
		
		return -1;		//�˻� ����
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		int[] x = new int[num];	//��ڼ� num
		
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� ��: "); //Ű ���� �Է�
		int ky = sc.nextInt();
		int idx = Practice5(x, num, ky); //�迭 x���� Ű ���� ky�� ��Ҹ� �˻�
		
		if(idx==-1)
			System.out.println("\n�� ���� ��Ұ� �����ϴ�.");
		else {
			System.out.println("\n"+ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
		}
	}

}
