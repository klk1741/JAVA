package poly;

public class PartTime extends Employee {
@Override
public void work() {
	System.out.println(super.getName()+" "+super.getPosition()+" 이(가)업무를 봅니다. ");

}
}
