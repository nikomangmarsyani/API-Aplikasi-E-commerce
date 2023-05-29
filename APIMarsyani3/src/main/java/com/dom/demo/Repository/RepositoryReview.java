package com.dom.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dom.demo.Models.Review;

@Repository
public interface RepositoryReview extends JpaRepository<Review, Integer>{
    
}
