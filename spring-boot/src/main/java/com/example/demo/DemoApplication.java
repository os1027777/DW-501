package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	
	/*
	 * 어플리케이션 (소프트 웨어 프로그램)을 만들때 패키지 3개부터 시작
	 * com.example.demo
	 * 1번째 패키지 이름   .net , .com , .kr(닷컴)
	 * 2번째 패키지 이름 : 조직이름 (dw ,naver , 구글)
	 * 3번째 패키지 이름 (admin , game , drone, app)
	 * 
	 */

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
}//TreeSet 검색 방법 - 이진 트리 안에 저장되어 있는 값 기준으로 검색 
//이진트리 안에 저장되어있는 값은 객체 의 주소 값이 저장되어있다
// 검색시에 저장되어있는 순서에 의해서 결과값이 나온다
// 그러므로 위와 같이 검색하고 자하는 회사이름을 따로 입력해서 객체를 생성하여 검색에 사용하는 방식은
// 트리셋 안에 없는 값이기 때문에 검색이 이루어 지지 않는다 
// 되는 경우 있음 무조건은 아님