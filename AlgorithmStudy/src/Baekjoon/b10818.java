package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class b10818 {
	
	//public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�Է¹��� ���� ����
		int num = sc.nextInt();
		
		//�Է¹��� ����
		int[] arr = new int[num];
					
		//���� �Է¹ޱ�
		for(int i=0; i<num; i++) {			
			arr[i] = sc.nextInt();
		}
			
			
//			System.out.print("�̵� ��: ");
//			for(int i=0; i<num; i++)
//				System.out.print(arr[i]+" ");

			//�������� �����
			Arrays.sort(arr);
			
//			System.out.println();
//			System.out.print("��������: ");
//			for(int i=0; i<num; i++)
//				System.out.print(arr[i]+" ");	
//			System.out.println();
			
			System.out.print(arr[0] + " " + arr[num-1]);

	}
}
