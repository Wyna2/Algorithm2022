package DoIt_02_1;

import java.util.Scanner;

//�� �迭�� ��ڼ��� ��Ҵ� ����ڷκ��� �Է¹޴´�
public class Practice5 {

	static void rcopy(int[] a, int[] b) {
		
		for(int i=0; i<(b.length/2); i++) {
			int temp = b[i];
			b[i] = b[b.length-i-1];
			b[b.length-i-1] = temp;
		}
		
		if(a.length<=b.length) {
			for(int i=0; i<a.length; i++) {
				a[i]=b[i];
			}
		} else {
			for(int i=0; i<b.length; i++) {
				a[i]=b[i];
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("int[] a�� ��ڼ� �Է�: ");
		int a = sc.nextInt();
		int[] ra = new int[a];
		System.out.print("int[] a�� ��Ұ� �Է�: ");
		for(int i=0; i<ra.length; i++) {
			int aa = sc.nextInt();
			ra[i] = aa;
		}
		
		System.out.print("int[] b�� ��ڼ� �Է�: ");
		int b = sc.nextInt();
		int[] rb = new int[b];
		System.out.print("int[] b�� ��Ұ� �Է�: ");
		for(int i=0; i<rb.length; i++) {
			int bb = sc.nextInt();
			rb[i] = bb;
		}
		
		System.out.println("*�������� ����*");
		rcopy(ra, rb);
				
		for(int i=0; i<ra.length; i++) {
			System.out.println("a["+i+"] = "+ra[i]);
		}
	}

}
