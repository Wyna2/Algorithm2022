package DoIt_02_1;
//�迭 ����
public class Training2_3_CloneArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = a.clone(); //b�� a�� �����ϴ� �迭 ��ü�� ������ ����
		
		b[3] = 0; // 0 ����
		
		System.out.print("a ="); // 1 2 3 4 5
		for(int i=0; i<a.length; i++)
			System.out.print(" "+a[i]);
		
		System.out.print("\nb ="); // 1 2 3 0 5
		for(int i=0; i<b.length; i++)
			System.out.print(" "+b[i]);
	}
}
