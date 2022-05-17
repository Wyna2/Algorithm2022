package DoIt_02_1;

import java.util.Scanner;

//각 배열의 요솟수와 요소는 사용자로부터 입력받는다
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
		System.out.print("int[] a의 요솟수 입력: ");
		int a = sc.nextInt();
		int[] ra = new int[a];
		System.out.print("int[] a의 요소값 입력: ");
		for(int i=0; i<ra.length; i++) {
			int aa = sc.nextInt();
			ra[i] = aa;
		}
		
		System.out.print("int[] b의 요솟수 입력: ");
		int b = sc.nextInt();
		int[] rb = new int[b];
		System.out.print("int[] b의 요소값 입력: ");
		for(int i=0; i<rb.length; i++) {
			int bb = sc.nextInt();
			rb[i] = bb;
		}
		
		System.out.println("*역순으로 복사*");
		rcopy(ra, rb);
				
		for(int i=0; i<ra.length; i++) {
			System.out.println("a["+i+"] = "+ra[i]);
		}
	}

}
