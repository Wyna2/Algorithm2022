package DoIt_01_2;

import java.util.Scanner;

public class Practice9_nsum {
	//���� a,b�� �����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ��ȯ�ϴ� �޼��� �ۼ�
	static int sumof(int a,int b) {
		
		int suma=0;
		int sumb=0;
		int sum=0;
		if(a>b) {
			for(int i=1; i<=a; i++) suma+=i;
			for(int j=1; j<b; j++) sumb+=j;
			sum=suma-sumb;
		} else if (a<b) {
			for(int i=1; i<=b; i++) sumb+=i;
			for(int j=1; j<a; j++) suma+=j;
			sum=sumb-suma;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �� �Է�");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result=sumof(a, b);
		System.out.println("�� ���� ������ ���� "+result+"�Դϴ�.");
	}

}
