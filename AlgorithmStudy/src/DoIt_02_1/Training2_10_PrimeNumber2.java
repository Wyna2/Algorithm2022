package DoIt_02_1;
//1,000 ������ �Ҽ��� ����(ver 2)
public class Training2_10_PrimeNumber2 {

	public static void main(String[] args) {
		int counter = 0;			//�������� Ƚ��
		int ptr = 0;				//ã�� �Ҽ��� ����
		int[] prime = new int[500]; //�Ҽ��� �����ϴ� �迭
		
		prime[ptr++] = 2;			//2�� �Ҽ���..prime[0]=2
		
		for(int n=3; n<=1000; n+=2) { //����� Ȧ����..n=3, 5, 7...
			int i;
			for(i=1; i<ptr; i++) { //1<1 ��������x for�� �������� �ʴ´�!
				counter++;		   //ptr:2 n:5�϶� counter:1
				if(n%prime[i]==0) //n%[�Ҽ�]�� 0���� ������ �������� �Ҽ��� �ƴϴ�
					break; //���̻� �ݺ����� �ʰ� ����
			}
			if(ptr==i) //for�� �������� �ʰ� if�� �Ѿ�´�..1==1 true �̹Ƿ� if�� ����!
				prime[ptr++] = n; //������ �������� ������ �Ҽ���� �迭�� ����..prime[1]=3; prime[2]=5...
		}
		
		for(int i=0; i<ptr; i++) //ã�� ptr���� �Ҽ��� ��Ÿ����.
			System.out.println(prime[i]);
		
		System.out.println("�������� ������ Ƚ��: "+counter);
	}
}
