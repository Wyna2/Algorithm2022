package DoIt_02_1;
//1,000 ������ �Ҽ��� ����(ver 3)
public class Training2_11_PrimeNumber3 {

	public static void main(String[] args) {
		int counter = 0;			//������ �������� Ƚ��
		int ptr = 0;				//ã�� �Ҽ��� ����
		int[] prime = new int[500]; //�Ҽ��� �����ϴ� �迭..���̰� 500�� int�� prime �迭 ����
		
		prime[ptr++] = 2;			//2�� �Ҽ��� prime[0] = 2
		prime[ptr++] = 3;			//3�� �Ҽ��� prime[1] = 3
		
		//prime[2]
		for(int n=5; n<=1000; n+=2) { //����� Ȧ����(5+=2)
			boolean flag = false; //flag �⺻���� false�� �д�
			for(int i=1; prime[i]*prime[i]<=n; i++) { //prime[i]�� ������ n���� �۰ų� ���������� for�� �ݺ�
				counter+=2; //0, 2, 4 ..
				if(n%prime[i]==0) { //������ �������� �Ҽ��� �ƴϴ�
					flag=true; //�Ҽ��� �ƴ� ��� flag���� true�� �ٲ���
					break; //���̻� �ݺ����� �ʰ� ����
				}
			}
			if(!flag) { //flag=false..�� if�� ������� �ʾ��� ���(n�� �Ҽ��� ���)
				prime[ptr++] = n; //������ �������� ������ �Ҽ���� �迭�� ���� prime[2]=5
				counter++; //Ƚ�� 1 ����
			}
		}
		
		for(int i=0; i<ptr; i++) //ã�� ptr���� �Ҽ��� ��Ÿ����.
			System.out.println(prime[i]);
		
		System.out.println("�������� ������ Ƚ��: "+counter);

	}

}
