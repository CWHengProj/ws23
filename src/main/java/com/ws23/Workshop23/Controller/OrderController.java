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
        Order processedOrder = orderService.getOrder(orderId);
        if (processedOrder==null){
            return "error";
        }
        model.addAttribute("processedOrder", processedOrder);
        return "order";
    }
    
}
