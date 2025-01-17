package com.ws23.Workshop23.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ws23.Workshop23.Model.Order;
import com.ws23.Workshop23.Service.OrderService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @GetMapping("/total/{orderId}")
    public String getMethodName(@PathVariable String orderId, Model model) {
        //search for total price of an order, discount that was given.
        Order processedOrder = orderService.getOrder(orderId);
        // we want to get only the processed information by the user instead of the entire object (do it via queries)
        model.addAttribute("processedOrder", processedOrder);
        return "order";
    }
    
}
