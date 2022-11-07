package programmers;

public class Lv0배열원소의길이 {

	public static void main(String[] args) {
		String[] strlist = {"We", "are", "the", "world!"};
		
		int leg = strlist.length;
		int leg0 = strlist[0].length();
		int leg1 = strlist[1].length();
		int leg2 = strlist[2].length();
		int leg3 = strlist[3].length();
		
		System.out.println(leg);
		System.out.println(leg0);
		System.out.println(leg1);
		System.out.println(leg2);
		System.out.println(leg3);
		
		/*
		 * int[] answer = new int[strlist.length];
		 * for(int i=0; i<strlist.length; i++)
		 * answer[i] = strlist[i].length();
		 * return answer;
		 */
        
	}

}
