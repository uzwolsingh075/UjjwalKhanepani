package com.ujjwalkhanepani.repository;

import com.ujjwalkhanepani.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderRepository extends PagingAndSortingRepository<Order, Long>, JpaRepository<Order, Long> {

}
