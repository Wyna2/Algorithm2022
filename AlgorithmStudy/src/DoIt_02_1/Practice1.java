package DoIt_02_1;

import java.util.Random;
//Ű100~189, ����� 1~20�����϶� Ű�� ��� �� ������ �����ϵ��� ���α׷� �����
public class Practice1 {

	static int maxHeightSu(int[] h) {
		
		int max = h[0];
		
		for(int i=0; i<h.length; i++)
		{
			if(h[i]>max)
				max=h[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		System.out.println("**Ű,����� ������ �ִ� ���ϱ�**");
		int su = rd.nextInt(20)+1;
		int[] height = new int[su]; //�Է��� su�� ��ŭ ���̸� ���� height ����
		
		System.out.println("��� �� : "+su);
		System.out.println("[ �� ���]");
		
		for(int i=0; i<su; i++)
		{
			height[i] = 100+rd.nextInt(90);
			System.out.println("height["+i+"]: "+height[i]);
		}

		System.out.println("�ִ�Ű�� "+maxHeightSu(height)+"cm �Դϴ�.");			
	}

}
