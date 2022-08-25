package com.spring.leaf.usersmanage.mapper;

import java.util.List;

import com.spring.leaf.userlist.command.UserListDetailVO;
import com.spring.leaf.usersmanage.command.CompanyMembersDetailVO;
import com.spring.leaf.usersmanage.command.CompanyMembersVO;
import com.spring.leaf.usersmanage.command.UserMembersDetailVO;
import com.spring.leaf.usersmanage.command.UserMembersVO;

//22-08-19
public interface IUserCompanyManageMapper {

	//유저 사용자 목록 조회
	List<UserMembersVO> userMembers();
	
	//기업 사용자 목록 조회
	List<CompanyMembersVO> companyMembers();
	
	//개발자 목록 상세보기
	UserMembersDetailVO userMembersDetail(int userNO);
			
	//기업 목록 상세보기
	CompanyMembersDetailVO companyMembersDetail(int companyNO);
	
	
}