package programmers;

import java.util.Scanner;

public class Lv1SkillTest4 {

	public static int solution(int[] absolutes, boolean[] signs) {
        int sum=0;
        int num=0;
		for(int i=0; i<absolutes.length; i++) {
			if(signs[i]==true)
				num=absolutes[i];
			else
				num=-absolutes[i];
			sum+=num;
        }
		
		int answer = sum;
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] absolutes = {
				4,7,12
		};
		boolean[] signs = {
				true,false,true
		};
		System.out.println(solution(absolutes, signs));
	}

}