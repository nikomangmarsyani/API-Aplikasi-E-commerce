package com.dom.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dom.demo.Models.Addresses;

@Repository
public interface RepositoryAddresses extends JpaRepository<Addresses, Integer>{
    
}
