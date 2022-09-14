package DoIt_02_2;

import java.util.Scanner;

//신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분포를 구함
public class Practice10 {

	static final int VMAX = 21; //시력 분포(0.0~2.0 0.1단위로 21개 생성)
	
	static class PhyscData {
		String name;	//String 이름 변수 생성
		int height;		//int 키 변수 생성
		double vision;	//double 시력 변수 생성
		
		//생성자
		public PhyscData(String name, int height, double vision) {
			this.name = name; //name 값을 name에 대입
			this.height = height;
			this.vision = vision;
		}
	}
	
	//키와 평균값을 구함
	static double aveHeight(PhyscData[] dat) {
		double sum = 0; //누적시켜줄 sum 생성
		for(int i=0; i<dat.length; i++)
			sum+=dat[i].height; //dat의 길이만큼 height 누적으로 더해 sum에 넣어줌
		return sum/dat.length; //누적된 값에 더한 개수를 나누어 평균값 반환
	}
	
	
	//시력 분포를 구함
	static void disVision(PhyscData[] dat, int[] dist) {
		int i=0;
		dist[i]=0; //dist[0]=0;
		for(i=0;i<dat.length;i++) //dat 배열의 길이만큼 반복문 실행
			if(dat[i].vision>=0.0 && dat[i].vision<=VMAX/10.0) //시력이 0 이상이면서 VMAX(21)/10.0 2.1이하일 경우
				dist[(int)(dat[i].vision*10)]++; //시력에 해당하는 사람이 있을경우 해당 시력 분포의 dist[ (int)시력*10 ]++ 값을 1씩 증가한다 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = { //생성자에 값을 넣어준다
				new PhyscData("박현규", 162, 0.3),
				new PhyscData("함진아", 173, 0.7),
				new PhyscData("최윤미", 175, 2.0),
				new PhyscData("홍연의", 171, 1.5),
				new PhyscData("이수진", 168, 0.4),
				new PhyscData("김영준", 174, 1.2),
				new PhyscData("박용규", 169, 0.8),
				new PhyscData("박용규", 169, 0.8),
				new PhyscData("박용규", 169, 0.8)
		};
		int[] vdist = new int[VMAX]; //시력 분포담는 배열 변수 선언
		
		//출력
		System.out.println("**신체검사 리스트**");
		System.out.println("이름       키   시력");
		for(int i=0;i<x.length;i++)
			System.err.printf("%-8s%3d%5.1f\n",x[i].name,x[i].height,x[i].vision);
		
		System.out.printf("\n평균키: %5.1fcm\n", aveHeight(x));
		disVision(x, vdist); //시력분포를 구함
		
		System.out.println("\n시력 분포");
		for(int i=0;i<VMAX;i++) {
			//System.out.printf("%3.1f~:%2d\n", i/10.0, vdist[i]);
			String star="";
			if(vdist[i]>0) {
				for(int j=0;j<vdist[i];j++)
					star+="*";
			}
			System.out.printf("%3.1f~: %s\n", i/10.0, star);
		}
	}
}
