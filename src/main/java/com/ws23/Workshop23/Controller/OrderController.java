package com.ws23.Workshop23.Controller;

import java.util.List;

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
        List<Order> processedOrders = orderService.getOrder(orderId);
        if (processedOrders.size()==0){
            return "error";
        }
        model.addAttribute("processedOrders", processedOrders);
        return "order";
    }
    
}
