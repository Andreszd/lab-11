package com.lab.promotion.repository;

import com.lab.promotion.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
/*
    @Query("select cu from Customer cu where cu.birthDay = :birthDay")
    List<Customer> findAllWithBirthDayToday(@Param("birthDay") Date birthDay);

 */
}
