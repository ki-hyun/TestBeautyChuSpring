package beautychu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beautychu.dao.ReviewDao;
import beautychu.domain.Review;

@Service
public class ReviewService {
  @Autowired ReviewDao reviewDao;
  
  public Review get(int styleNo) {
	    Review review = reviewDao.selectReviewList(styleNo);
	    return review;
	  }
}







