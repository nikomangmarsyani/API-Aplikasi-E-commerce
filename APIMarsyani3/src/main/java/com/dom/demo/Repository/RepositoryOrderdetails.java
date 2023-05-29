package com.dom.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dom.demo.Models.Orderdetail;

@Repository
public interface RepositoryOrderdetails extends JpaRepository<Orderdetail, Integer>{
    
}
