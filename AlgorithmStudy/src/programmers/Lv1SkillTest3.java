package programmers;

import java.util.Scanner;

public class Lv1SkillTest3 {

	public static String solution(int a, int b) {
        String[] day = {
        	"SUN","MON","TUE","WED","THU","FRI","SAT"
        };
        String answer = "";
        
        //31�� 1,3,5,7,8,10,12(�Ϳ�:������ۿ���+3)
        //30�� 4,6,9,11(�Ϳ�:������ۿ���+2)
        //29�� 2(�Ϳ�:������ۿ���+1)
        
        if(a==1||a==4||a==7) {
        	if(b==1||b%7==1) answer=day[5];
        	else if(b==2||b%7==2) answer=day[6];
        	else if(b==3||b%7==3) answer=day[0];
        	else if(b==4||b%7==4) answer=day[1];
        	else if(b==5||b%7==5) answer=day[2];
        	else if(b==6||b%7==6) answer=day[3];
        	else if(b==7||b%7==7) answer=day[4];
        } else if(a==2||a==8) {
        	if(b==1||b%7==1) answer=day[1];
        	else if(b==2||b%7==2) answer=day[2];
        	else if(b==3||b%7==3) answer=day[3];
        	else if(b==4||b%7==4) answer=day[4];
        	else if(b==5||b%7==5) answer=day[5];
        	else if(b==6||b%7==6) answer=day[6];
        	else if(b==7||b%7==7) answer=day[0];
        } else if(a==3||a==11) {
        	if(b==1||b%7==1) answer=day[2];
        	else if(b==2||b%7==2) answer=day[3];
        	else if(b==3||b%7==3) answer=day[4];
        	else if(b==4||b%7==4) answer=day[5];
        	else if(b==5||b%7==5) answer=day[6];
        	else if(b==6||b%7==6) answer=day[0];
        	else if(b==7||b%7==7) answer=day[1];
        } else if(a==5) {
        	if(b==1||b%7==1) answer=day[0];
        	else if(b==2||b%7==2) answer=day[1];
        	else if(b==3||b%7==3) answer=day[2];
        	else if(b==4||b%7==4) answer=day[3];
        	else if(b==5||b%7==5) answer=day[4];
        	else if(b==6||b%7==6) answer=day[5];
        	else if(b==7||b%7==7) answer=day[6];
        } else if(a==6) {
        	if(b==1||b%7==1) answer=day[3];
        	else if(b==2||b%7==2) answer=day[4];
        	else if(b==3||b%7==3) answer=day[5];
        	else if(b==4||b%7==4) answer=day[6];
        	else if(b==5||b%7==5) answer=day[0];
        	else if(b==6||b%7==6) answer=day[1];
        	else if(b==7||b%7==7) answer=day[2];
        } else if(a==9||a==12) {
        	if(b==1||b%7==1) answer=day[4];
        	else if(b==2||b%7==2) answer=day[5];
        	else if(b==3||b%7==3) answer=day[6];
        	else if(b==4||b%7==4) answer=day[0];
        	else if(b==5||b%7==5) answer=day[1];
        	else if(b==6||b%7==6) answer=day[2];
        	else if(b==7||b%7==7) answer=day[3];
        } else if(a==10) {
        	if(b==1||b%7==1) answer=day[6];
        	else if(b==2||b%7==2) answer=day[0];
        	else if(b==3||b%7==3) answer=day[1];
        	else if(b==4||b%7==4) answer=day[2];
        	else if(b==5||b%7==5) answer=day[3];
        	else if(b==6||b%7==6) answer=day[4];
        	else if(b==7||b%7==7) answer=day[5];
        } 
		
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է�: ");
		int a = sc.nextInt();
		System.out.print("�� �Է�: ");
		int b = sc.nextInt();
		System.out.println(solution(a, b));
	}

}