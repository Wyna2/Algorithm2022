package programmers;

public class Lv0제곱수판별하기 {

	public static void main(String[] args) {
		double result = Math.sqrt(25); //25의 제곱근
		int answer;
		if(result%1==0)
			answer = 0;
		else
			answer = 1;
		System.out.println(answer);
	}

}
