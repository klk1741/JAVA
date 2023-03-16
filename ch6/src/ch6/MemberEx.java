package ch6;

public class MemberEx {

	public static void main(String[] args) {
Member member1= new Member("hong123","hong123@","HONG123@!","012341234");
Member member2= new Member("hong123","hong123@","HONG123@!","012341234","서울 종로구");

if(member1.passwordAndConfirmPasswordEquals())
{
	System.out.println("비밀번호가 일치합니다.");
}else{
	System.out.println("비밀번호 확인해주세요");
}

System.out.println(member2.passwordAndConfirmPasswordEquals()?"비밀번호가 일치합니다.":"비밀번호를 확인해주세요");
MemberEx obj= new MemberEx();
obj.memberInfo(member1);
obj.memberInfo(member2);
	}	 //문자열 비교== 사용하면 안됨
static void memberInfo(Member member) {
	//출력결과
	System.out.println("아이디 : "+member.id);//아이디:초기값출력
	System.out.println("비밀번호 : "+member.password);//아이디:초기값출력
	System.out.println("주소 : "+member.address);//아이디:초기값출력
	System.out.println("전화번호 : "+member.hp);//아이디:초기값출력
	//비밀번호: 초기값출력
	//전화번호: 초기값출력	
    //주소: 초기값출력
}

}
