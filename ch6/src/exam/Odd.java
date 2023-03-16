package exam;

public class Odd extends OddDetector {

	public Odd(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
@Override
public boolean isOdd() {
//홀수면 true,짝수면 false리턴
	if(getN()%2==1) {
		return true;
	}
	return false;
}
}
