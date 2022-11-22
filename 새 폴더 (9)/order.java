package cafe.control;

public class order implements menu_able {
	
	@Override
	public boolean menu_active() {
		return false;
	}

}
//오버로딩 - 클래스 내부에서 메서드이름은 같고 매개변수가 다른 형태로 메서드를 정의하는것
	// int a (int num){}
	// int a(int num , int num2){}
	// void a(String name{}
	//새로운 메소드를 정의하는것
// 오버라이딩 - 다른 클래스(자식또는 implements 되어 있는 클래스)에 리턴타입 메소드이름 매개변수 모두 똑같이 정의하고 내용만 다르게 만드는 메소드
// 오버라이딩   - 덮어쓰기
// 기존의 메소드를 내용만  변경  하는것
