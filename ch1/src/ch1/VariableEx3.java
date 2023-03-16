package ch1;

public class VariableEx3 {

	public static void main(String[] args) {
		int x=10, y=20;
		
		int temp=0;
		temp=x;
         x=y;
         y=temp;
         System.out.println("x = "+x+",y= "+y);
         System.out.println("x = "+x);
         System.out.println(x);
         

         
         
         
	}
}