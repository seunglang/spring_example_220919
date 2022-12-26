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
	
	// input: Review 객체 하나를 받아옴. 하나의 행을 받아서 insert 요청
	// output: select는 결과를 리턴하지만 insert는 아무것도 리턴 안해도 되고, 성공된 행이 몇개인지 리턴을 받아도 된다.
	//         int(인서트가 성공된 행 수)
	public int addReview(Review review) {
		return reviewDAO.insertReview(review);
	}
	
	// addReviewAsField(4, "콤비네이션R", "신바다", 5.0, "역시 맛있따!");
	public int addReviewAsField(
			int storeId, String menu, String userName,
			Double point, String review) {
		
		return reviewDAO.insertReviewAsField(storeId, menu, userName, point, review);
	}
}
