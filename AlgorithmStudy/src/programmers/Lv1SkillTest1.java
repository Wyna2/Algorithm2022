package programmers;

import java.util.Scanner;

public class Lv1SkillTest1 {

	public static String solution(String[] seoul) {
        int num = 0;
        for(int x=0; x<seoul.length; x++){
            if(seoul[x]=="Kim") {
            	num = x;
            }
        }
        
        String answer = "�輭���� "+num+"�� �ִ�";
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] seoul = {
				"Jane",
				"Kim"
		};
		System.out.println(solution(seoul));
		//System.out.println(seoul[1]=="Kim");
	}

}