package 자바0914;

import java.util.Scanner;

public class 자바문제 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("값을 임력해주세여");
		int num = scan.nextInt();
		
		for(int i=3; i<=1000; i++) {
			if(num%i == 1) {
				System.out.println("가장 작은 자연수는 "+i);
				break;
			}
		}
		
		
	}
}
