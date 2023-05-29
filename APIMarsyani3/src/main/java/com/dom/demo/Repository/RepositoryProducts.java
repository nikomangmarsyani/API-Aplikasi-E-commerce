package com.dom.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dom.demo.Models.Products;

@Repository
public interface RepositoryProducts extends JpaRepository<Products, Integer>{
    
}
