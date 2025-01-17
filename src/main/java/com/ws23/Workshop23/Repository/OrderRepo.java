package com.ws23.Workshop23.Repository;

import org.springframework.stereotype.Repository;

import com.ws23.Workshop23.Model.Order;

@Repository
public class OrderRepo {

    public Order getOrder(String orderId) {
        //get the data from the database using jdbc template
        return null;
        // get the order here via the query, and process the calculations here        
    }
    
}
