package DoIt_03_2;

import java.util.Scanner;

//���� �˻�
public class Training3_2_SeqSearchFor {

	//�迭 a�� ���� n���� ��ҿ��� key�� ���� ��Ҹ� ���� �˻�
	static int Training3_1_SeqSearch(int[] a, int n, int key) {
		for(int i=0; i<n; i++)
			if(a[i]==key)
				return i;  //�˻� ������ �ε��� ��ȯ
		return -1;		   //�˻� ���н� -1 ��ȯ
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num = sc.nextInt();
		int[] x = new int[num];	//��ڼ��� num�� �迭
		
		for(int i = 0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻��� ��: "); //Ű ���� �Է�
		int ky = sc.nextInt();
		int idx = Training3_1_SeqSearch(x, num, ky); //�迭 x���� Ű ���� ky�� ��Ҹ� �˻�
		
		if(idx==-1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");

	}

}
