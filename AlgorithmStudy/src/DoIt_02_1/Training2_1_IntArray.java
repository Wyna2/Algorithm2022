package DoIt_02_1;
//���� ����� �ڷ����� int���� �迭
public class Training2_1_IntArray {
	
	public static void main(String[] args) {
		int[] a = new int[5]; //�迭�� ���̰� 5�� int�� �迭 ����

		a[1] = 37; //a[1]�� 37 ����
		a[2] = 51; //a[2]�� 51 ����
		a[4] = a[1]*2; //a[4]�� a[1]*2 = 37*2 = 74 ����
		
		for(int i=0; i<a.length; i++) //�� ��Ұ� ���
			System.out.println("a["+i+"] = "+a[i]);
	}
}
