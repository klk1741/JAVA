package ch6;

public class Member {
//아이디 user id ex)hong123
//비밀번호 password
//비밀번호 확인 comfirmPassr
//전화번호 hp ex)0101231292
//주소 address ex)	
	
	String id;
	String password;
	String address;
	String confirmPassword;
	String hp;
	
	public Member(String id, String password, String address, String comfirmPassword, String hp) {
		super();
		this.id = id;
		this.password = password;
		this.address = address;
		this.confirmPassword = comfirmPassword;
		this.hp = hp;
	}

	public Member(String id, String password, String comfirmPassword, String hp) {
		super();
		this.id = id;
		this.password = password;
		this.confirmPassword = comfirmPassword;
		this.hp = hp;
	}
	
	boolean passwordAndConfirmPasswordEquals() {
		return password.equals(confirmPassword);
	
	}
	
	
}
