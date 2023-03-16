package inter;
/*
 * 인터페이스
 * 추상화 클래스
 * 추상 클래스보다 추상화 정도가 높음==> 일반메서드, 멤버변수 가질수 없음
 * 기본 설계도
 */
public interface Account {
 int x=0,y=0;//모든 멤버변수는 public static final 이다
// void stop() {} 모든 메서드는 public abstract임(생략가능)
 void stop();
 
 static void print() {};
 default void add() {}
}
