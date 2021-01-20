package com.lambdaschool.orders.repositories;

import com.lambdaschool.orders.models.Order;
import com.lambdaschool.orders.views.CustomerCountOrders;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends CrudRepository<Order, Long> {

}
