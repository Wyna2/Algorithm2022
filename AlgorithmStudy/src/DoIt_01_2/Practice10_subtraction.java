package DoIt_01_2;

import java.util.Scanner;

public class Practice10_subtraction {
	//�� ���� a,b �Է��ϸ� b-a ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��ϼ���.");
		
		int a=0;
		int b=0;
		
		System.out.print("a�� ��: ");
		a=sc.nextInt();
		System.out.print("b�� ��: ");
		b=sc.nextInt();
		
		do {
			System.out.println(a+"���� ū ���� �Է��ϼ���.");
			System.out.print("b�� ��: ");
			b=sc.nextInt();
		} while (b<=a);
		
		System.out.println(b+"-"+a+"�� "+(b-a)+"�Դϴ�.");
	}

}
