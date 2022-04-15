package DoIt_02_1;

import java.util.Scanner;

//�迭 ��ҿ� ���� �о� �鿩 �������� �����Ѵ�.
public class Training2_6_ReverseArray {

	//�迭 ��� a[idx1]�� a[idx2]�� ���� �ٲ�
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];	//�迭 a�� a[idx1] ���� int t�� ����
		a[idx1] = a[idx2];	//�迭 a�� a[idx2] ���� a[idx1]�� ����
		a[idx2] = t;		//int t(=a[idx1]) ���� a[idx2]�� ����
	}
	
	//�迭 a�� ��Ҹ� �������� ����
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++)
			//��ü ������ �� ��(0, n-1)�� �ٲ��ָ� ��� ������ �������� ������ a.length/2 ��ŭ �ٲ��ش�.
			swap(a, i, a.length-i-1); //int[] a �迭, �ٲ��ٰ�1, �ٲ��ٰ�2
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num = sc.nextInt(); //��ڼ�..�迭�� ����
		
		int[] x = new int[num]; //��ڼ��� num�� �迭 x
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt(); //�迭 x ���� ���� �Է��Ѵ�.
		}
		
		reverse(x); //�迭 x�� ��Ҹ� �������� ����
		
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		for(int i=0; i<num; i++)
			System.out.println("x["+i+"] = "+x[i]);

	}

}
