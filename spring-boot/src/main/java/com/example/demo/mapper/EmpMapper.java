package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.DeptVO;
import com.example.demo.vo.EmpVO;
import com.example.demo.vo.UsersVO;


/*
 * 
 * 
 * 추상클레스와 인터페이스 차이점
 */
@Mapper
public interface EmpMapper {
	
	/**
	 * @Since : 2022. 11. 28.
	 * @Author : mr.HAN
	 * @Return : List<EmpVO>
	 * @Comment : EMP 테이블 전체 조회
	 */
	List<EmpVO> selectEmp();
	
	
	int insertEmp(EmpVO vo);
	
	int deleteEmp(int empno);



	
	int updateEmp(EmpVO vo);
	

	List<UsersVO> selectUsers();

	
	int insertUsers(UsersVO vo);
	
	
	int selectUsersFindById(UsersVO vo);


	int deleteUsers(String id);
 
    UsersVO selectUsersPassword(UsersVO vo);
	


	
}
	
