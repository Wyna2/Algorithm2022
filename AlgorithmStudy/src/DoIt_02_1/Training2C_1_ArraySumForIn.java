package DoIt_02_1;
//�迭�� ��� ����� ���� ���Ͽ� �����(Ȯ�� for��)
public class Training2C_1_ArraySumForIn {
	public static void main(String[] args) {
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		for(int i=0; i<a.length; i++)
			System.out.println("a["+i+"] = "+a[i]);
		
		double sum=0; //�հ�
		
		//Ȯ�� for��.. : ~�� �ȿ� �ִ� (������ in�̶� ����)
		//Ȯ�� for���� for-in�� �Ǵ� for-each�� �̶�� �θ���.
		for(double b : a) //�迭 a�� �ȿ� �ִ� ���(b)�� �Ѱ��� ��ĵ
			sum+=b;
		
		/* �Ʒ� for���� ����
		for(int b=0; b<a.length; b++)
			sum+=a[i];
		*/
		
		System.out.println("��� ����� ���� "+sum+"�Դϴ�.");
	}

}
