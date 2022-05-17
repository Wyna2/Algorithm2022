package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class Lv1IncreaseInterval {
	
	//1�� Ǯ��
	/*
	public static long[] Lv1IncreaseInterval(int x, int n) {
        long[] answer = new long[n]; //�迭 answer�� ���̸� n����ŭ ������� �� ���
        for(int i=0; i<n; i++) {
        	answer[i]=x+x*i;
        }
        return answer;
    }
    >>�׽�Ʈ13, �׽�Ʈ14 ����
    */
		
	public static long[] Lv1IncreaseInterval(int x, int n) {		
		long[] answer = new long[n];
        for(int i=0; i<n; i++) {
        	answer[i]=(long)x*(i+1);
        }
        return answer;
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.print(Arrays.toString(Lv1IncreaseInterval(x, n)));
		//Arrays.toString > �迭 ����Ʈ�Ҷ�
	}

}
