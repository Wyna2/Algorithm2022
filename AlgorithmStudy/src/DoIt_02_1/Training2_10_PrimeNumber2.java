package DoIt_02_1;
//1,000 ������ �Ҽ��� ����(ver 2)
public class Training2_10_PrimeNumber2 {

	public static void main(String[] args) {
		int counter = 0;			//�������� Ƚ��
		int ptr = 0;				//ã�� �Ҽ��� ����
		int[] prime = new int[500]; //�Ҽ��� �����ϴ� �迭
		
		prime[ptr++] = 2;			//2�� �Ҽ���
		
		for(int n=3; n<=1000; n+=2) { //����� Ȧ����
			int i;
			for(i=1; i<ptr; i++) { //�̹� ã�� �Ҽ��� ������ ����
				counter++;
				if(n%prime[i]==0) //������ �������� �Ҽ��� �ƴϴ�
					break; //���̻� �ݺ����� �ʰ� ����
			}
			if(ptr==i)
				prime[ptr++] = n; //������ �������� ������ �Ҽ���� �迭�� ����	
		}
		
		for(int i=0; i<ptr; i++) //ã�� ptr���� �Ҽ��� ��Ÿ����.
			System.out.println(prime[i]);
		
		System.out.println("�������� ������ Ƚ��: "+counter);
	}
}
