package com.dom.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dom.demo.Models.Orders;

@Repository
public interface RepositoryOrders extends JpaRepository<Orders, Integer>{
    
}
