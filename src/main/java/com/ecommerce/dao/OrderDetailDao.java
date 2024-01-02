package com.ecommerce.dao;

import com.ecommerce.entity.OrderDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailDao extends CrudRepository<OrderDetail, Integer> {
}
