package com.practice.loanApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.practice.loanApp.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long>{

}
