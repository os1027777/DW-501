package 자바공부2;

class 소녀시대{
	
	public static String 멤버소개(String 맴버이름 ) {
	return"제이름은"+맴버이름+"입니다";
	}
}

public class ㅈ0926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		소녀시대 태연 = new 소녀시대();
		System.out.println(태연.멤버소개("태현"));
		
		소녀시대 수염 = new 소녀시대();
		System.out.println(수염.멤버소개("수염"));

	}

}
