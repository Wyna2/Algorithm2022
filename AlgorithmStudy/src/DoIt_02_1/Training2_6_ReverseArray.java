package DoIt_02_1;

import java.util.Scanner;

//배열 요소에 값을 읽어 들여 역순으로 정렬한다.
public class Training2_6_ReverseArray {

	//배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];	//배열 a의 a[idx1] 값을 int t에 대입
		a[idx1] = a[idx2];	//배열 a의 a[idx2] 값을 a[idx1]에 대입
		a[idx2] = t;		//int t(=a[idx1]) 값을 a[idx2]에 대입
	}
	
	//배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++)
			//전체 길이의 양 끝(0, n-1)을 바꿔주며 가운데 수까지 내려오기 때문에 a.length/2 만큼 바꿔준다.
			swap(a, i, a.length-i-1); //int[] a 배열, 바꿔줄값1, 바꿔줄값2
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sc.nextInt(); //요솟수..배열의 길이
		
		int[] x = new int[num]; //요솟수가 num인 배열 x
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt(); //배열 x 안의 수를 입력한다.
		}
		
		reverse(x); //배열 x의 요소를 역순으로 정렬
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i=0; i<num; i++)
			System.out.println("x["+i+"] = "+x[i]);

	}

}
