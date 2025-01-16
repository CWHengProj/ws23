package com.ws23.Workshop23.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@RequestMapping("/order")
public class OrderController {
    //search for total price of an order, discount that was given.
    //send this to the spring boot backend when user enters an order
    //GET /order/total/<order_id>
    // Accept: text/html

    @GetMapping("total/{orderId}")
    public String getMethodName(@PathVariable String orderId) {
        return "order";
    }
    
}
