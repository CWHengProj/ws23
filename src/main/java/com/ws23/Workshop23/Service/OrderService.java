package com.ws23.Workshop23.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ws23.Workshop23.Model.Order;
import com.ws23.Workshop23.Repository.OrderRepo;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;
    public Order getOrder(String orderId) {
        return orderRepo.getOrder(orderId);         
    }
    
}
