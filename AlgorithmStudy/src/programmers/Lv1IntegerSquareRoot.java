package programmers;

import java.util.Scanner;

public class Lv1IntegerSquareRoot {


	public static long Lv1IntegerSquareRoot(long n) {
	    long answer = -1;
	    long i = su(n, 1);
	    answer = (i+1)*(i+1);
	    return answer;
	}
	
	public static long su(long a, long b) {
		
		if(a%b==0&&b*b==a)
			return b;
		b++;
		return su(a,b);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		System.out.println("---------------------");
		System.out.println(Lv1IntegerSquareRoot(a));
		System.out.println(su(a,1));
	}

}
