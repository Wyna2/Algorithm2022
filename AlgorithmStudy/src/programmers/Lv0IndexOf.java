package programmers;

public class Lv0IndexOf {

	public static void main(String[] args) {
		
		String indexOfTestOne = "Hello world";
		String indexOfTestTwo = "           Hello world           ";
		
		System.out.println(indexOfTestOne.indexOf("o"));
		System.out.println(indexOfTestOne.indexOf("x"));
		System.out.println(indexOfTestOne.indexOf("o",5));
		System.out.println(indexOfTestTwo.indexOf("o"));
		System.out.println(indexOfTestTwo.indexOf("el"));
		
		System.out.println("");

		System.out.println(indexOfTestOne.lastIndexOf("o"));   //7
		System.out.println(indexOfTestOne.lastIndexOf("x"));   //-1
		System.out.println(indexOfTestOne.lastIndexOf("o",5)); //4
		System.out.println(indexOfTestTwo.lastIndexOf("o"));   //18
		System.out.println(indexOfTestTwo.lastIndexOf("el"));  //12
		
		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";
		if(str1.indexOf(str2)!=-1)
			System.out.println("있음");
		else
			System.out.println("없음");
		
		String containsTest = "Hello world";
		
		System.out.println(containsTest.contains("Hello"));
		System.out.println(containsTest.contains("hello"));
		System.out.println(containsTest.contains("lo wo"));
		System.out.println(containsTest.contains("wor"));
		
	}
}
