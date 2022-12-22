package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/ex01")
@Controller   // 스프링빈(Spring bean)
public class Lesson01Ex01Controller {
	
	// String 출력하기 - content type HTML
	// http://localhost:8080/lesson01/ex01/1 - 요청주소
	@ResponseBody() // 리턴되는 값을 HTML Response Body에 넣어 보낸다. 
	@RequestMapping("/1") // 주소 맵핑
	public String printString() {
		String text = "예제1번<br>문자열을 response body로 보내는 예제";
		return text;
	}
	
	// Map 출력하기
	// http://localhost:8080/lesson01/ex01/2 - 요청주소
	@RequestMapping("/2")
	public @ResponseBody Map<String, Object> printMap() {
		// {"aaaa"=1111, "bbbb"=1111....} ':'(Json) or '=' 로 자바의 맵인지 구분 가능하다.
		Map<String, Object> map = new HashMap<>();
		map.put("aaaa", 1111);
		map.put("bbbb", 1234);
		map.put("cccc", 1234);
		map.put("dddd", 5678);
		
		// spring web starter 때문에 jackson이라는 라이브러리가 포함되어 있음
		return map; // map을 리턴하면 json으로 나타난다.
	}
}
