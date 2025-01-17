package com.ws23.Workshop23.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.ws23.Workshop23.Constant.Queries;
import com.ws23.Workshop23.Model.Order;

@Repository
public class OrderRepo {
    @Autowired
    JdbcTemplate template;
    public List<Order> getOrder(String orderId) {
        SqlRowSet rs = template.queryForRowSet(Queries.getProcessedTableByOrderId, orderId);  
        List<Order> orders = new ArrayList<>();
        Order order = new Order();
        while (rs.next()){
            order.setOrder_date(rs.getLong("order_date"));
            order.setCostPrice(rs.getFloat("cost_price"));
            order.setCustomer_id(rs.getString("customer_id"));
            order.setId(orderId);
            order.setTotal(rs.getFloat("total"));
            orders.add(order);
        }    
        return orders; 
    }
    
}
