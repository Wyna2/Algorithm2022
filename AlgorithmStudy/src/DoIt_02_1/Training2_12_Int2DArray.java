package DoIt_02_1;
//2행 4열의 2차원 배열
public class Training2_12_Int2DArray {

	public static void main(String[] args) {
		int[][] x = new int[2][4]; //2행 4열의 2차원 배열 x 선언
		
		/*
		 [ 0][ 0][ 0][ 0]
		 [ 0][ 0][ 0][ 0]
		 */
		
		x[0][1] = 37;
		x[0][3] = 54;
		x[1][2] = 65;
		
		/*
		 [ 0][37][ 0][54]
		 [ 0][ 0][65][ 0]
		 */
		
		for(int i=0; i<2; i++)
			for(int j=0; j<4; j++)
				System.out.println("x["+i+"]["+j+"] = "+x[i][j]); //각 요소 값 출력
	}
}
