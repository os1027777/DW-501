package cafe.control;

public interface menu_able {
	@Override
	public boolean menu_active() {
		System.out.println("회원가입 양식");
		System.out.println("아이디");
		String id = sc.nextLine();
		System.out.println("이름");
		String name = sc.nextLine();
		System.out.println("연락처");
		String tel = sc.nextLine();
		System.out.println("이메일");
		String email = sc.nextLine();
		
		
		return false;
	}
	//int num;//인스턴스변수
	//final int count = 20;//상수가능
	//static int day=10;
	//public abstract void sum();//추상 메소드
	//static void addd() {
		
	//}
}
//인터페이스 = 추상클래스의 하나 
// 추상클래스는 추상메서드를 가지고 있는클레스이다
//추상클래스는 객ㅊ테 생성에 제한이 있다 
// 고로 인터페이스는 추상메소드를 가지며 객채생성에 제한이있다
// 인터페이스에 정의하는 메소드는 기본적으로 추상 메소드로 정의된다
//인터페이스에는 인스턴스 변수 인스턴스메소드 정의불가
//인터패이스에 추상메소드정의는 abstarct 생략할수 있다
//인터페이스에 추상 메소드가 하나만 있다면 해당 인터페이스를 함수형인터페이스라고 한다
//함수형 인터페이스는 람다 생성할때 사용할수 있는 인터페이스다.
//