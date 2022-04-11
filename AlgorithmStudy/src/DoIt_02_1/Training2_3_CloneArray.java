package DoIt_02_1;
//배열 복제
public class Training2_3_CloneArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = a.clone(); //b는 a가 참조하는 배열 본체의 복제를 참조
		
		b[3] = 0; // 0 대입
		
		System.out.print("a ="); // 1 2 3 4 5
		for(int i=0; i<a.length; i++)
			System.out.print(" "+a[i]);
		
		System.out.print("\nb ="); // 1 2 3 0 5
		for(int i=0; i<b.length; i++)
			System.out.print(" "+b[i]);
	}
}
