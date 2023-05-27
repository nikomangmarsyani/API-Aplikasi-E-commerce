package com.dom.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dom.demo.Models.Users;

@Repository
public interface RepositoryUsers extends JpaRepository<Users, Integer>{
    
}
