package DoIt_02_1;
//구성 자료형이 int형인 배열
public class Training2_2_IntArrayInit {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5}; //배열 본체 생성과 동시에 각 요소 초기화
		
		for(int i=0; i<a.length; i++) //배열 a의 요솟수는 5이기 때문에 for(int i=0; i<5; i++)
			System.out.println("a["+i+"] = "+a[i]); //a[0]~a[4] 까지의 값 출력
	}
}
