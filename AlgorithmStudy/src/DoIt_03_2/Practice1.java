package DoIt_03_2;

import java.util.Scanner;

public class Practice1 {

	//��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���ʹ����� ���� �˻��մϴ�.
	static int Practice1(int[] a, int n, int key) {
			
		a[n] = key;		//���ʸ� �߰�
		
		for(int i=0; i<n; i++) {
			if(a[i]==key) return i;
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		int[] x = new int[num+1];	//��ڼ� num+1
		
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� ��: "); //Ű ���� �Է�
		int ky = sc.nextInt();
		int idx = Practice1(x, num, ky); //�迭 x���� Ű ���� ky�� ��Ҹ� �˻�
		
		if(idx==-1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");

	}

}
