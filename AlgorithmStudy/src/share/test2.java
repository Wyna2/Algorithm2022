package share;

import java.util.Scanner;

public class test2 {
	
	public static int test2(int n, int answer) {
				
		if(n == 0) {
			//System.out.println(answer);
			return answer;
		}

		if(n%3==0 && n%5==0) {
			answer += 3;
		} else if(n%3==0) {
			answer += 1;
		} else if(n%5==0) {
			answer += 2;
		} 
		
		//System.out.println(answer);
		return test2(n-1, answer);		
	}

	public static void main(String[] args) {
				
		//1���� 100���� ���� �� 3�� ����� 1 ���, 5 ����϶� 2, 3�� 5�� ������϶��� 3 ���
		//1���� 10���� �� 3 6 9 5 10  = 7
		test2(100, 0);
		System.out.println(test2(100, 0));
		
		int s = 0;
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%5==0) {
				s += 3;
			} else if(i%3==0) {
				s += 1;
			} else if(i%5==0) {
				s += 2;
			} 
		}
		System.out.println(s);
	}

}
