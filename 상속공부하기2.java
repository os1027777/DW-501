package 자바공부2;
class 관장{
	public void 운동을하다() {
		System.out.println("운동전 뛰기 맞음");
	}
	public void 주먹을날리다(){
		System.out.println("조절한다");
		System.out.println("쨉");
		System.out.println("훅");
}
class 제자 extends 관장{ //익스탠드  :상속
	@Override //꼭해줄것 : 오버라이딩 (자식클레스 재정의)
	//오버로딩 :매소드 이름은 같으나 파라미터 타입이 다르다!!!!!!!!
	//오버 라이딩 부모의 기능을 자식이 재정의!!!!!!!!!
	public void 운동을하다() {
		System.out.println("운동전에 간단하게 뛰겼습니다");
	}
	@Override
	public void 주먹을날리다(){
		System.out.println("조절한다");
		System.out.println("쨉");
		System.out.println("훅");
	
	}
}

public class 상속공부하기2 extends Object{//extends Object : 원래 기본적으로 탑제되어있다!!!!!!!
	//부모없는 자식없음
	//모든 오브젝트를 상속받는다
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		관장 경호관장님 = new 관장();
		경호관장님.운동을하다();
		경호관장님.주먹을날리다();
		System.out.println("==========");
		제자 현상원 = new 제자();
		현상원.운동을하다();
		현상원.운동을하다();
	

	}

}
