package com.dw.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.emp.mapper.EmpMapper;
import com.dw.emp.vo.EmpVO;

@Service
public class EmpService {

	@Autowired
	EmpMapper empMapper;

public boolean checkUser(String id) {
		EmpVO vo = new EmpVO();
		vo.setid(id);
		
		int rows = empMapper.selectUsersFindById(vo);
		if(rows > 0) {
			return true;
		}
		return false;
}
}
