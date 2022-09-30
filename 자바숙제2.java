package 자바공부2;

public class 자바숙제2 {

	
	public static int 짝수개수구하기() {
		int num = 0;
		for(int i=1;i<=20;i++) {
			if(i%2 == 0) {
				++num;
			}
		}
		//2,4,6,8,10,12,14,16,18,20
		return num;
		}
		
	public static void main(String[] args) {
	 
		int x = 짝수개수구하기();
		System.out.println("짝수 개수는 ? "+x);
	}

}
