package DoIt_02_1;

import java.util.Scanner;

public class Training2_4_MaxOfArray {
		
	static int maxOf(int[] a) {
	//�迭 a�� �ִ��� ���� maxOf() int max���� ��ȯ��
		int max=a[0]; //�迭 a�� ù��° ���� �켱 max�� ����
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max) //for�� ������ ���� a[0]=max���� ū���� ���� ���
				max=a[i]; //�� ���� max�� ����
		}
		return max; //int max�� ������
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.print("��� ��: ");
		int num=Integer.parseInt(sc.nextLine()); //��� �� �Է�
		
		int[] height = new int[num]; //���̰� �Է°� num�� �迭 ����
		
		for(int i=0; i<num; i++) //�迭 0~(n-1)���� ���ϱ�
		{
			System.out.print("height["+i+"]: "); //�迭 height[0]~height[n-1]
			height[i] = Integer.parseInt(sc.nextLine()); 
		}
		
		System.out.println("�ִ��� "+maxOf(height)+" �Դϴ�.");
	}
}
