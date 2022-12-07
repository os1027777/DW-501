package com.dw.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.emp.vo.EmpVO;

@Mapper
public interface EmpMapper {
	List<EmpVO> selectEmp();
	
	
	int insertEmp(EmpVO vo);


	int selectUsersFindById(EmpVO vo);

}
