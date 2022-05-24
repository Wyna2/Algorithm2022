package programmers;

import java.util.Scanner;

public class Lv1Collatz {

	//1차 풀이
	/*
	public static int Lv1Collatz(int num) {
	    int answer = 0;	    
	    do {
	    	answer++;
	    	if(num%2==0)
	    		num/=2;
	    	else if(num%2!=0)
	    		num=num*3+1;
	    	//answer++;
	    	if(answer==500)
	    	{ answer=-1;
	    	  break; }
		} while (num!=1);
	    return answer;
	}
	*/
	
	//2차풀이
	public static int Lv1Collatz(long num) {
	    int answer = 0;
	    while (num!=1) {
	    	if(answer==500)
	    	{
	    		answer=-1;
	    		break;
	    	}
	    	
	    	answer++;	    	
	    	num=(num%2==0 ? num/2 : num*3+1);

		}
	    return answer;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input su: ");
		int num=sc.nextInt();
		
		System.out.print("result: ");
		System.out.println(Lv1Collatz(num));
	}

}
