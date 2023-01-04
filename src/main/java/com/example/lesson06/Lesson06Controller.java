package com.example.lesson06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.lesson04.bo.UserBO;

@RequestMapping("/lesson06")
@Controller
public class Lesson06Controller {
	
	@Autowired
	private UserBO userBO;
	
	// 회원가입 페이지 화면
	// http://localhost:8080/lesson06/ex01/add_user_view
	@GetMapping("/ex01/add_user_view")
	public String addUserView() {
		return "lesson06/ex01/addUser";
	}
	
	// 회원가입(일어나는 곳) (form)
//	@PostMapping("/ex01/add_user")
//	public String addUser(
//			@RequestParam("name") String name,
//			@RequestParam("yyyymmdd") String yyyymmdd,
//			@RequestParam(value="email", required=false) String email,
//			@RequestParam(value="introduce", required=false) String introduce
//			) {
//		
//		// form 태그가 화면을 이동시켜준다.
//		// db insert 생략
//		
//		return "lesson06/ex01/afterAddUser";
//	}
	
	// 회원가입 - AJAX 통신으로 오는 요청
	@ResponseBody // 어떤걸 리턴하면 그 리턴하는 값이 통째로 responseBody에 들어가게 된다.
	@PostMapping("/ex01/add_user")
	public String addUser(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam(value="email", required=false) String email,
			@RequestParam(value="introduce", required=false) String introduce
			) {
		
		// db insert
		userBO.adduser(name, yyyymmdd, email, introduce);
		
		return "성공"; // 결과에 대해서 글자로 내린다. // ☆AJAX의 응답값은 항상 String 으로 내려간다.☆
	}
	
	@GetMapping("/ex01/after_add_user_view")
	public String afterAddUserView() {
		return "lesson06/ex01/afterAddUser";
	}
}
