package DoIt_01_2;

import java.util.Scanner;

public class Practice8_gaussum {
	//가우스의 덧셈을 이용해 1부터 n까지의 정수 합을 구하는 프로그램 작성
	//1~10까지의 합은 (1+10)*5와 같은 방법으로 구할 수 있다.
	/*1 2 3 4 5 6 7 8 9 10
	  1                 10 = 11
	    2             9    = 11
	      3         8      = 11
	        4     7        = 11
	          5 6          = 11
	          
	          11*5  -> (n+1)*(n/2)
	 
	  1 2 3 4 5 6 7 8 9 10 11
	  1                    11 = 12
	    2               10    = 12
	      3           9       = 12
	        4       8         = 12
	          5   7           = 12
	            6             = 6
	          
	        12*5+6  -> (n+1)*(n/2)+(n/2+1)
	 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력한 값: ");
		
		int n=sc.nextInt();
		int sum=0;
		
		if(n%2==0)
			sum=(1+n)*(n/2);
		else
			sum=(1+n)*(n/2)+(n/2+1);
		
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");

	}

}
