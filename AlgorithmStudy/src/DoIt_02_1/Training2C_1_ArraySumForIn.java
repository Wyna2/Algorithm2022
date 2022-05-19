package DoIt_02_1;
//배열의 모든 요소의 합을 구하여 출력함(확장 for문)
public class Training2C_1_ArraySumForIn {
	public static void main(String[] args) {
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		for(int i=0; i<a.length; i++)
			System.out.println("a["+i+"] = "+a[i]);
		
		double sum=0; //합계
		
		//확장 for문.. : ~의 안에 있는 (읽을때 in이라 읽음)
		//확장 for문을 for-in문 또는 for-each문 이라고 부른다.
		for(double b : a) //배열 a의 안에 있는 요소(b)를 한개씩 스캔
			sum+=b;
		
		/* 아래 for문과 같다
		for(int b=0; b<a.length; b++)
			sum+=a[i];
		*/
		
		System.out.println("모든 요소의 합은 "+sum+"입니다.");
	}

}
