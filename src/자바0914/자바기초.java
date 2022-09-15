package 자바0914;

public class 자바기초 {

	public static void main(String[] args) {
						
//자바 공부 주의점
	
		
		
		
/*주의점
 * 1.당분갅 코딩은 마인 안에다가 한다
 * 2. 실행하는 방법은 컨트롤 에프십일 을 동시엥 누른다
*  //자바 변수 선언
*  //자바는 엄격한 타입언어이다
*  int x =100: 데이터가 숫자면 int이다
*  //데이터 타입 = int
*  //x 는 변수이름(자바는 한글지원 가능)
*  //= 는 대입 연산자
*  //100은 데이터
*  돈 = 50
*/
	int 고기 = 2;
	고기= 1;
 
	
	int 내지갑 = 50000;
	int 만원몇장 = 0;
	만원몇장 = 내지갑 / 10000;
	System.out.println(만원몇장);
	
	int 국어 = 80;
	int 수학 = 15;
	int 영어 = 65;
	int 평균 = 0;
	
	평균 = (국어 + 수학 + 영어) / 3;
	System.out.println(평균);
	//double 숫자(소수)
	//long 숫자
	//float 숫자 (소수)
	//char 문자
	//String 문자 > 클레스 타입
	//boolean true, false
	//자바 데이터 타입 종류 데이터 타입 8개 클래스 타입 으로 구성댐
	
	String 이름 = "홍길동";
	이름 = 이름 + "철수";
	System.out.println(이름);
	
	String num = "10";
	int num2 = 0;
	
	num2 = Integer.parseInt(num);
	System.out.println(num2 );
	}
}
