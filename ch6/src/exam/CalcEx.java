package exam;

import java.util.Scanner;

public class CalcEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input num: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.print("연산자를 입력하세요: ");
		String operator = scanner.next();

		// calc=null;
		switch (operator) {
		case "+":
		  Add calc = new Add();
			break;
		case "-":
		 Sub	calc1 = new Sub();
			break;
		case "*":
			Mul calc2 = new Mul();
			break;
		case "/":
			Div calc3 = new Div();
			break;
		default:
			System.out.println("Invalid operator!");
			return;
		}

		// Calc 객체에 두 개의 정수 값 설정 후 계산 결과 출력
		calc.setValue(a, b);
		System.out.println("Result: " + calc.calculate());
	}

}


