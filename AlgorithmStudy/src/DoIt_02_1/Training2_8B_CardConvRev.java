package DoIt_02_1;

import java.util.Scanner;

public class Training2_8B_CardConvRev {

	//정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 변환한다.
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0; //변환 후의 자릿수
		
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r); //r로 나눈 나머지를 저장
			x/=r; //x를 r로 나눈 값을 x에 대입
		} while (x != 0); //x가 0이 아닐동안 반복.. x=0이면 반복문 종료
		
		return digits; //x가 0이 되면 값 반환
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int no;		//변환하는 정수
		int cd;		//기수
		int dno;	//변환 후의 자릿수
		int retry;	//다시 한 번?(반복문 다시 실행 여부)
		
		char[] cno = new char[32]; //변환 후 각 자리의 숫자를 넣어두는 문자 배열
		
		System.out.println("10진수를 기수 변환한다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수: ");
				no = sc.nextInt(); //변환하는 정수 입력
			} while (no < 0); //변환하는 정수가 0보다 작을 동안 do문 반복 출력
			
			do {
				System.out.print("어떤 진수로 변환할까요?(2~36): ");
				cd = sc.nextInt(); //기수 입력
			} while (cd < 2 || cd > 36); //기수가 2보다 작거나 36보다 클 경우 do문 반복 출력
			
			dno = cardConvR(no, cd, cno); //no를 cd진수로 변환
			
			System.out.print(cd + "진수로는 ");
			for(int i=dno-1; i>=0; i--) //윗자리부터 차례로 나타냄
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.print("\n한 번 더 할까요? (1.예/0.아니오): ");
			retry = sc.nextInt();

		} while (retry == 1); //retry가 1이면 do문 다시 반복
	}
}
