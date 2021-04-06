package com.takeaway.demo.controller;

import com.takeaway.demo.dao.ReviewRepository;
import com.takeaway.demo.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    //create review
    @PostMapping
    public Review createReview(@RequestBody Review review){
        return this.reviewRepository.save(review);
    }

}
