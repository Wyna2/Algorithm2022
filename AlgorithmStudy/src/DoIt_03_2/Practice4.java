package DoIt_03_2;

import java.util.Scanner;

public class Practice4 {

	//��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���ʹ����� ���� �˻��մϴ�.
	static int Practice4(int[] a, int n, int key) {
			
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
		int idx = Practice4(x, num, ky); //�迭 x���� Ű ���� ky�� ��Ҹ� �˻�
		
		if(idx==-1)
			System.out.println("\n�� ���� ��Ұ� �����ϴ�.");
		else {
			int pst = 0;
			int plt = num;
			int mid = (pst+plt)/2;
			
			System.out.print("\n  | ");
			for(int i=0; i<num; i++) {
				System.out.print(" "+i+" ");
			}
			System.out.print("\n--+");
			for(int i=0; i<num; i++) {
				System.out.print("---");
			}
			for(int i=0; i<=idx; i++) {
				System.out.print("\n  |  <-");

				for(int s=0; s<=plt; s++) {
					if(s==mid)
						System.out.print(" * ");
					else if(s==plt)
						System.out.print("->");
					else
						System.out.print("  ");
				}
								
				System.out.print("\n"+mid+" | ");
				for(int j=0; j<num; j++) {
					System.out.print(" "+x[j]+" ");
				}
				
				plt = mid;
				mid = plt/2;
			}
			
			System.out.println("\n"+ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
		}
	}

}
