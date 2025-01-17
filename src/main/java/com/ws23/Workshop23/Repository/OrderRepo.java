package com.ws23.Workshop23.Repository;

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
    public Order getOrder(String orderId) {
        SqlRowSet rs = template.queryForRowSet(Queries.getProcessedTableByOrderId, orderId);  
        Order order = new Order();
        if (rs.next()){
            order.setOrder_date(rs.getString("order_date"));
            order.setCostPrice(rs.getFloat("cost_price"));
            order.setCustomer_id(rs.getString("customer_id"));
            order.setId(orderId);
            order.setTotal(rs.getFloat("total"));
            return order; 
        }    
        return null;
    }
    
}
