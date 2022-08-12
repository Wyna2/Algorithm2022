package programmers;

import java.util.Scanner;

public class Lv1SkillTest2 {

	public static double solution(int[] arr) {
        double sum = 0;
		for(int i=0; i<arr.length; i++) {
        	sum += arr[i];
        }
		double answer = sum/arr.length;
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {
				1,2,3,4
		};
		System.out.println(solution(arr));
		//System.out.println(seoul[1]=="Kim");
	}

}