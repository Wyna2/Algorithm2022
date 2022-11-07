package programmers;

import java.util.Arrays;

class Lv1전화번호목록 {

    public static boolean solution(String[] phone_book) {
            boolean answer = true;
            
            
            Arrays.sort(phone_book);
            int len = phone_book[0].length();
            System.out.println(len);
            
            for(int i=1; i<phone_book.length; i++) {
            
            	System.out.println(phone_book[0].substring(0, 1));
                System.out.println(phone_book[i].substring(0, 1));
            	
            	
            	
            	String str = phone_book[i].substring(0, len);
                System.out.println(str);
                int sub = Integer.parseInt(str);
                if(phone_book[0].equals(str))
                    answer = false;
            }
            return answer;
    }
	
	
	public static void main(String[] args) {
		String[] phone_book = { "119", "97674223", "1195524421"};
		
		System.out.println(Lv1전화번호목록.solution(phone_book));
	}

}
