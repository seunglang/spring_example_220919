package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.dao.ReviewDAO;
import com.example.lesson03.model.Review;

@Service
public class ReviewBO {
	
	@Autowired 
	private ReviewDAO reviewDAO;
	
	public Review getReview(int id) { // BO 메소드 호출 시 int는 null 허용X Integer는 null 허용이다.
		return reviewDAO.selectReview(id);
	}
}
