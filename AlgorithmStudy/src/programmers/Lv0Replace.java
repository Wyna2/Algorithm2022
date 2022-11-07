package programmers;

public class Lv0Replace {

	public static void main(String[] args) {
		
		 String str = "Hello Java World!!"; 
		 String text = str.replace('a', 'o');
		 System.out.println(text);
		 
		
		/*
		 * String str = "Hello Java World!!"; 
		 * String text = str.replace("Java",
		 * "Python"); System.out.println(text);
		 */
		
		
		String st = "¶ç\r¾î\n¾²\r±â\n";
		/*
		 * String txt = st.replaceAll("\\r|\\n", ""); 
		 * System.out.println(txt);
		 */
		
		/*
		String txt = st.replaceAll("[\\r\\n]+", "");
		System.out.println(txt);
		
		String str = "¾È³ç , Àß Áö³Â´Ï ..?";
		String text = str.replaceAll("(\\w|[¤¡-¤¾°¡-ÆR]*)(\\s+)([\\.,])", "$1$3");
		System.out.println(text);
		
		String strf = "I Iike Java";
		String txtf = strf.replaceFirst("a", "e");
		System.out.println(txtf);
		*/
		
	}

}
