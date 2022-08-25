package com.spring.leaf.usersmanage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.leaf.userlist.command.UserListDetailVO;
import com.spring.leaf.usersmanage.command.CompanyMembersDetailVO;
import com.spring.leaf.usersmanage.command.CompanyMembersVO;
import com.spring.leaf.usersmanage.command.UserMembersDetailVO;
import com.spring.leaf.usersmanage.command.UserMembersVO;
import com.spring.leaf.usersmanage.service.IUserCompanyManageService;

//22-08-19 사용자 리스트 컨트롤러
@Controller
@RequestMapping("/membersList")
public class UserCompanyManageController {
	
	@Autowired
	private IUserCompanyManageService service;
	
	// 로그 출력을 위한 Logger 객체 생성
	private static final Logger logger = LoggerFactory.getLogger(UserCompanyManageController.class);
		
		
		// 사용자관리 이동 요청
		@GetMapping("/membersList")
		public String membersList(Model model) {
			logger.info("/membersList/membersList: GET (일반회원 목록 페이지 이동)");
			model.addAttribute("userMembers", service.userMembers());
			model.addAttribute("companyMembers", service.companyMembers());
			return "/admin/members-list";
		}
		
		//일반회원 목록 상세보기
		@GetMapping("/membersUser")
		@ResponseBody
		public UserMembersDetailVO userMembersDetail(int userNO) {
			logger.info("/membersList/membersUser : GET (개발자목록 상세 보기 요청)");
			return service.userMembersDetail(userNO);
		}
		
		//기업회원 목록 상세보기
		@GetMapping("/membersCompany")
		@ResponseBody
		public CompanyMembersDetailVO companyMembersDetail(int companyNO) {
			logger.info("/membersList/membersCompany : GET (기업목록 상세 보기 요청)");
			return service.companyMembersDetail(companyNO);
		}
	
}