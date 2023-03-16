package ch5;
//참조타입에서 특정한 값이 할당되지 않은 상태: null
import java.util.Arrays;

public class ArrayEx10 {
	public static void main(String[]args) {
		int score[][]= {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};

		
int korTotal=0,  engTotal=0,  mathTotal=0;
		
System.out.println("번호  국어   영어   수학   총점    평균");
System.out.println("=================================");


//국어 점수 총점

//score[0][0]+score[1][0]+score[2][0]+score[3][0]+score[4][0];
		
//평균 = sum/3.0
for (int i = 0; i < score.length; i++) {
int sum=0;//개인별 총점
			
			
			
			//번호
			System.out.printf("%3d",i+1);
			
			for (int j = 0; j < score[i].length; j++) {
				sum+=score[i][j];
				//점수
				System.out.printf("%5d",score[i][j]);
			}
              
			
			//평균= sum/3 
			float avg= sum / (float)score[i].length;
			//korTotal=score[0][0]+score[1][0]+score[2][0]+score[3][0]+score[4][0];
			//engTotal=score[0][1]+score[1][1]+score[2][1]+score[3][1]+score[4][1];
			//mathTotal=score[0][2]+score[1][2]+score[2][2]+score[3][2]+score[4][2];
			korTotal+=score[i][0];
			engTotal+=score[i][1];
			mathTotal+=score[i][2];
			
			
			System.out.printf("%5d %5.1f\n",sum,avg);
			
			
		}
		
 
	System.out.println("=================================");
	System.out.printf("총점:%3d %4d %4d\n",korTotal,engTotal,mathTotal);
	}
	}