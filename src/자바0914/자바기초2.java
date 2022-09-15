package 자바0914;

import java.util.Scanner;

public class 자바기초2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 임력해주세여");
		int num = scan.nextInt();
		for( int i=0;i<1000;i++) { 
			if(i%2 == 1) {
				
				System.out.println("값은>" +num);
			}
		}
		
		int sum=0;
		for(int i=3;i<=6;i++) {
			sum = sum +i;
			
		}
		System.out.println(sum);
		
		
		
		
		
		
		int a = 2;
		if((a%2) == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}
		
		
	
		
		
		
		
		int x = 10;
		if(x == 10) {
			System.out.println("a");
		}
		if(x > 5) {
			System.out.println("실행");
		}
		if(4 == 4) {
			System.out.println("이프 실행");
		}else {
			System.out.println("엘스실행");
		}
		System.out.println();
	}
	
	

}
