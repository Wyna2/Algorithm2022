package DoIt_02_1;
//���� �ڷ����� int���� �迭
public class Training2_2_IntArrayInit {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5}; //�迭 ��ü ������ ���ÿ� �� ��� �ʱ�ȭ
		
		for(int i=0; i<a.length; i++) //�迭 a�� ��ڼ��� 5�̱� ������ for(int i=0; i<5; i++)
			System.out.println("a["+i+"] = "+a[i]); //a[0]~a[4] ������ �� ���
	}
}
