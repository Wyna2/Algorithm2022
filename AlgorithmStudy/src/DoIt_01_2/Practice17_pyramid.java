package DoIt_01_2;

import java.util.Scanner;

//n���� ���� �Ƕ�̵带 ����ϴ� �޼��� �ۼ�
public class Practice17_pyramid {

	static void npira(int n) {
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
				System.out.print(' ');
			for(int j=1; j<=(i-1)*2+1; j++)
				System.out.print(i%10);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int n=sc.nextInt();
		
		npira(n);
	}

}
