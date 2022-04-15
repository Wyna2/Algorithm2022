package DoIt_02_1;

import java.util.Random;
import java.util.Scanner;

//�迭 ����� �ִ�(���� ������ ����)
public class Training2_5_MaxOfArrayRand {

	static int maxOf(int[] a) {
		int max=a[0]; //a[0]��°�� �켱 int max�� ����
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max) //a[1]~a[n-1] �� �� a[0]���� ū ���� max�� ����
				max=a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		Random rand = new Random(); //random Ŭ�������� ������ ����� ���� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**Ű�� �ִ� ���ϱ�**");
		System.out.print("��� ��: ");
		int num = sc.nextInt();
		
		int[] height = new int[num]; //�Է��� num����ŭ�� ���̸� ���� �迭 height ����
		
		System.out.println("Ű ���� �Ʒ��� �����ϴ�.");
		
		for(int i=0; i<num; i++) //0~(n-1) : �� n�� �ݺ�
		{
			height[i] = 100+rand.nextInt(90);
			//������ ������ 90���� ���� ������(0~89)�� 100�� ���� ��: 100~189
			System.out.println("height["+i+"]: "+height[i]);
		}
		System.out.println("�ִ��� "+maxOf(height)+" �Դϴ�.");
	}
}
