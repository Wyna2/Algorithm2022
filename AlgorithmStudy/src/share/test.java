package share;

import java.util.Scanner;

public class test {
	
	public static int test(int n) {
		
		int answer = 0;
		
		if(n%3==0 && n%5==0) {
			answer = 3;
		} else if(n%3==0) {
			answer = 1;
		} else if(n%5==0) {
			answer = 2;
		} else
			answer = n;
		
		return answer;
		
	}

	public static void main(String[] args) {
		//1���� 100���� ���� �� ȭ�鿡 3�� ����� 1 ���, 5 ����϶� 2, 3�� 5�� ������϶��� 3 ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�: ");
		int n = sc.nextInt();
		
		System.out.print("��� ��: ");
		System.out.println(test(n));
		
		//1���� 100���� ���� �� 3�� ����� 1 ���, 5 ����϶� 2, 3�� 5�� ������϶��� 3 ���
		//1���� 10���� �� 3 6 9 5  = 5
		
	}

}
