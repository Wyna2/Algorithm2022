package Baekjoon;
/*
����: 9���� ���� �ٸ� �ڿ����� �־��� ��,
	 �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 ���� ���, ���� �ٸ� 9���� �ڿ���
	 3, 29, 38, 12, 57, 74, 40, 85, 61
	 �� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
�Է�: ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����.
	 �־����� �ڿ����� 100 ���� �۴�.
���: ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.
*/
import java.util.Scanner;

public class b2562 {
	
	//public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("���� �Է�");
		int[] num = new int[9];
		int max = num[0];
		int n = 0;
		
		for(int i=0; i<num.length; i++)
		{
			num[i]=sc.nextInt();
			if(num[i]>max)
			{
				max=num[i];
				n=i;
			}
		}
		
		System.out.println(max);
		System.out.println(n+1);
	}
}
