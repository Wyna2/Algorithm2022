package programmers;

public class Lv0CharAt {

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println(str.charAt(6));
		
		String a = "0";
		int b = a.charAt(0) - 47; //0-9까지는 유니코드상 48-57
		System.out.println(a + ", " + b);
		
		String answer = "";
		String my_string = "hello";
		int n = 3;
		for(int i=0; i<my_string.length(); i++){
            answer+=(my_string.charAt(i));
            answer+=(my_string.charAt(i));
            answer+=(my_string.charAt(i));
        }
		System.out.println(answer);
	}

}
