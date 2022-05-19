package programmers;

import java.util.Scanner;

public class Lv1PhonNumberHidden {

	public static String Lv1PhonNumberHidden(String phone_number) {
		String answer = "";
		char[] temp = phone_number.toCharArray();
		for(int i=0; i<temp.length-4; i++)
			answer+="*";
		for(int i=temp.length-4; i<temp.length; i++)
			answer+=temp[i];
        return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phoneNumber = sc.nextLine();
		System.out.println(Lv1PhonNumberHidden(phoneNumber));		
	}

}
