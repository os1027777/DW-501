package 자바공부2;

public class 자바메소드기능 {
	
	/*
	 * 퍼블릭 스테틱:접근 제어자
	 * 스트링 리턴타입
	 * 겟월드 메소드 이름
	 * 스트링 x 피라미터 타입 
	 */
	public static String getWord(String x) {
		return x;
	}
	public static int getCount(int startNum, int endNum) {
		if(startNum > endNum) return startNum;
		if(startNum > endNum) return endNum;
			
		
		return 0;
	}
	
	public static int 일부터십까지합구하기() {
		int num = 0;
		for(int i=0;i<=10;i++) {
			num +=i;
		}//끝 55
		return num;
		
		
		
	}
	/*
	 * 메소드 사용하는 이유
	 * 엄무분담
	 * 유지보수 편리성
	 */
	public static void main(String[] args) {
			//1. 1~10 까지 합
			//2. 10까지 짝수를 구하시오
		
		
		
				System.out.println("안녕");
				int x = 일부터십까지합구하기();
			System.out.println(x);
	}
}
