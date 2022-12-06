package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.mapper.EmpMapper;
import com.example.demo.vo.UsersVO;

@SpringBootTest
class DemoApplicationTests {

	
	@Autowired
	EmpMapper empMapper;
	@Test
	void contextLoads() {
			UsersVO vo = new UsersVO();
			vo.setId("바보");
			
			System.out.println("idL"+vo.getId());

			System.out.println("Pw"+vo.getPw());
			
			int rows = empMapper.selectUsersFindById(vo);
			System.out.println("rows=>" + rows );
		
	}

}
