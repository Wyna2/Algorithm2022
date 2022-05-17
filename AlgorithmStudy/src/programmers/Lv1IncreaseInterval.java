package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class Lv1IncreaseInterval {
	
	//1차 풀이
	/*
	public static long[] Lv1IncreaseInterval(int x, int n) {
        long[] answer = new long[n]; //배열 answer의 길이를 n개만큼 만들어준 후 계산
        for(int i=0; i<n; i++) {
        	answer[i]=x+x*i;
        }
        return answer;
    }
    >>테스트13, 테스트14 실패
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
		//Arrays.toString > 배열 프린트할때
	}

}
