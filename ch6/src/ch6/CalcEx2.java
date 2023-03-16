package ch6;

public class CalcEx2 {

	public static void main(String[] args) {
Calc2 calc= new Calc2();
calc.add(5,3);
calc.add(5,3L);
calc.add(5,3.0f);

int num[]= {100,200,300,400};
calc.add(num);

	}

}
