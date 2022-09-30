package 자바공부2;

class 부모님{
	
	public void 아들아공부() {
		System.out.println("공부해라");
	}
	public void 아들아밥먹자() {
		System.out.println("아들아밥먹자");
	}
}
//자식클레스에서 부모님클래스를 상속받기
//상속 == 부모의 기능을 물려받는다
class 자식 extends 부모님{
	@Override
	public void 아들아공부() {
		System.out.println("공부해요");
	}
	@Override
	public void 아들아밥먹자() {
		System.out.println("밥먹어요");
	}
	
}

public class 상속공부하기1 {

	public static void main(String[] args) {
		ㅇ
		

	}

}
