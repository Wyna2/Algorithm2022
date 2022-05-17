package programmers;

import java.util.Scanner;

public class Lv1RectangularStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i=0; i<m; i++) { //ї­
            for(int j=0; j<n; j++) { //За
                System.out.print("*");
            }
            System.out.println();
        }
	}

}
