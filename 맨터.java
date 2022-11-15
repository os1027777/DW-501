package 공부12;

public class 맨터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		member m1 = new member();
		
		
m1.성별 = "여자";
m1.아이디 = "limit";
m1.이름="이순자";
m1.주소="대전 중구 선화동";

System.out.println("아이디:"+m1.아이디+"이름"+m1.이름+m1.성별+m1.주소);

member m2 = new member();
m2.성별 ="남자";
m2.이름 ="남자";
m2.아이디 ="남자";
m2.주소 ="남자";
m2.oyo();


	}
	static void oyo(member m) {
		System.out.println("아이디:"+m.아이디+"이름"+m.이름+m.성별+m.주소);
	}

}



