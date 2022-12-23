package com.example.lesson03.dao;

import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewDAO {
	public Review selectReview(int id); // 파라미터가 1개일땐 @Param("id)를 넣지 않아도 된다.
}
