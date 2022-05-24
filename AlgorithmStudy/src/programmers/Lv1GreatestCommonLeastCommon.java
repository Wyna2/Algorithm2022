package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class Lv1GreatestCommonLeastCommon {

	//n차 풀이
	public static int[] Lv1GreatestCommonLeastCommon(int n, int m) {
	    
	    //큰값을 m, 작은값을 n 대입
	    if(n>m)
	    {
	    	int temp = n;
	    	n = m;
	    	m = temp;
	    }
	    
	    //m에서 n을 나눈 나머지값을 r에 대입
	    int r = m%n;

    	if(r!=0) {
    		int a=n;
    		int b=m;
        	do {
        		b=a;
        		a=r;
        		r=b%a;
    		} while (r!=0);
        	
        	if(a==1) {
        		m=n*m;
        		n=1;    		
        	} else if(a!=1) {
        		m=n*m/a;
        		n=a;
        	}
    	}
    	
	    //구해준 n과 m을 다시 대입	    
	    int[] answer = {n,m};
	    return answer;
	}
	
	//참고 풀이
	/*
	class Solution {
	    public int[] solution(int n, int m) {
	        int[] answer = new int[2];
	        for (int i = 1; i < n + m; i++) {
	            if (n % i == 0 && m % i == 0) {
	                answer[0] = i;
	                answer[1] = n * m / answer[0];
	            }
	        }
	        return answer;
	    }

	}
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input: ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		System.out.print("result: ");
		System.out.println(Arrays.toString(Lv1GreatestCommonLeastCommon(n,m)));
	}

}
