package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Order;
import com.lambdaschool.orders.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service(value = "ordersService")
public class OrdersServiceImpl implements OrdersService{
    @Autowired
    private OrdersRepository ordersrepo;

    @Transactional
    @Override
    public Order save(Order order) {
        return ordersrepo.save(order);
    }

    @Override
    public Order findOrderById(long id)
        throws EntityNotFoundException {
        return ordersrepo.findById(id)
                .orElseThrow(() ->new EntityNotFoundException("Order " + id + " Not Found"));
    }
}
