package 자바공부2;

import java.util.Scanner;

public class 메소드공부3 {
	
	public static void 캐릭터를생성한다() {
		System.out.println("캐릭터이름을입력해주세요");
		System.out.print("캐릭터 이름 =>");
		Scanner scan = new Scanner(System.in);
		String 캐릭터이름 =scan.next();
		System.out.println("캐릭터 이름은 :" +캐릭터이름);
	}
	
	public static void 직업을선택한다() {
		System.out.println("1 전사 2 마법사 3 궁수");
		System.out.print("직업을 선택해주세요");
		Scanner scan = new Scanner(System.in);
		int 직업 = scan.nextInt();
		String[] 직업배열 = {"전사","마법사","궁수"};
		System.out.println(직업배열[직업-1]+"를 선택하셨습니다!!!");
	}
	public static void 프로그램을종료한다() {
		System.out.println("프로그램을 종료하시겠습니까?");
		System.out.print("프로그램을 종료합니다");
		Scanner scan = new Scanner(System.in);
		
		
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("###게이 프로그램 시작###");
	
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("[1]캐릭터 생성 [2] 캐릭터 조회 [3] 프로그램종료");
			System.out.print("이용하실 서비스를 선택해주세요 ===> ");
			String manu = scan.next();
			switch(manu) {
			case"1" : 
				System.out.println("캐릭터 생성매뉴 선택"); 
				캐릭터를생성한다();
				break;
			case"2" : 
				System.out.println("직업선택"); 
				직업을선택한다();
				break;
			case"3" : 
				System.out.println("프로구램종료");
				System.exit(0);
				break;
			}
		}
	}

}
