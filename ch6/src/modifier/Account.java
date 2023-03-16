package modifier;

public class Account {
	// 속성 ==> private로 막음
	// 외부에서는 속성에 직접적으로 접근이 불가능
	// 인스턴스변수의 값을 얻어내거나 변경하고싶다면? ==> 메소드로 처리한다.
	
	//런타임오류 - 문법이 잘못된경우 ide사용하면 알려줌, 개발능력 우선
	private String ano; 
public String getAno() {
	return ano;
}

public void setAno(String ano) {
	this.ano=ano;
}
}
