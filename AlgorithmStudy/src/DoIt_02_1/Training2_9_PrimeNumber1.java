package DoIt_02_1;
//1,000 ������ �Ҽ��� ����(ver 1)
public class Training2_9_PrimeNumber1 {

	public static void main(String[] args) {
		int counter = 0; //�������� Ƚ��
		
		for(int n=2; n<=1000; n++) {
			int i;
			for(i=2; i<n; i++) { //2~(n-1)���� ����
				counter++;
				if(n%i==0) //2~(n-1)���� ������ ������ �������� �Ҽ��� �ƴϴ�
					break; //���̻� �ݺ����� �ʰ� ����
			}
			if(n==i)
				System.out.println(n);	
		}
		System.out.println("�������� ������ Ƚ��: "+counter);
	}
}
