package programmers;

import java.util.Arrays;

public class Lv1MatrixAddition {

	public static int[][] Lv1MatrixAddition(int[][] arr1, int[][] arr2) {
		
		int x=arr1.length; //행의 개수
		int y=arr1[0].length; //열의 개수
		
		int[][] answer = new int[x][y];
		for(int i=0; i<x; i++)
			for(int j=0; j<y; j++)
				answer[i][j]=arr1[i][j]+arr2[i][j];
		return answer;
	}

	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{2,3},{4,5}};
		int[][] arr2 = {{3,4},{5,6},{7,8}};
		System.out.print(Arrays.deepToString(Lv1MatrixAddition(arr1,arr2))); //2차원 이상 배열 출력
		System.out.println();
		System.out.print(Arrays.toString(Lv1MatrixAddition(arr1,arr2))); //1차원 배열 출력
		//System.out.println(arr1.length); 행 찍어보기
		//System.out.println(arr1[0].length); 열 찍어보기
		
	}
}
