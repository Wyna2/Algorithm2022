package DoIt_03_2;

import java.util.Scanner;

public class Practice3 {

	//��ڼ��� n�� �迭 a���� key�� ��ġ�ϴ� ��� ����� �ε����� idx�� ����
	static int Practice3(int[] a, int n, int key, int[] idx) {
			
		a[n] = key;
		int idxn = 0;
		
		for(int i=0; i<n; i++) {
			if(a[i]==key) {
				idx[idxn] = i; //idx�� ��ġ�ϴ� ��ڼ��� ��ġ ��ȯ
				idxn++;
			}
		}
		return idxn==0?-1:idxn;
		
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
		int key = Practice3(x, num, ky, x); //�迭 x���� Ű ���� ky�� ��Ҹ� �˻�
		
		if(key==-1)
			System.out.println("\n�� ���� ��Ұ� �����ϴ�.");
		else {
			System.out.println("\n"+ky+"��(��) ["+key+"]�� �ֽ��ϴ�.");
		}
	}

}
