package com.example.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {
	public Review selectReview(int id); // 파라미터가 1개일땐 @Param("id)를 넣지 않아도 된다.
	
	public int insertReview(Review review);
	
	public int insertReviewAsField(
			// 하나의 맵으로 구성됨
			@Param("storeId") int storeId,
			@Param("menu") String menu,
			@Param("userName") String userName,
			@Param("point") 	Double point,
			@Param("review") String review);
}
