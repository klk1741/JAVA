package ch5;

public class ArrayEx4 {
    public static void main(String[]args) {
	int score[]= {78,65,76,45,34,76,58,86};
	
    	//최대값 최소값구하기
    	
    	int max= score[0];
    	int min= score[0];
    	for (int i=0; i<score.length; i++) {
			if(max<score[i])
			{
				max=score[i];
		 }
			else if(min>score[i])
			{
			min=score[i];
			}
    	}
    	System.out.printf("최대값: %d,최소값: %d; ",max,min);
    	
    	
    }
}
