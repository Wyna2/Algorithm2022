package DoIt_01_2;

public class Practice7_nsum {
	//n�� 7�̸� 1~n�� ���� 28�� ��µǴ� ���α׷� �ۼ�
	public static void main(String[] args) {
		
		System.out.println("1���� 7������ ���� ���մϴ�.");
		int n = 7;
		int sum=0; //��
		
		for(int i=0; i<=n; i++)
			sum+=i; //sum�� i�� ���Ѵ�.
		
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");

	}

}
