package com.order.service.chanduorder;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/orders")
public class ChanduOrderApplication {

    @Autowired
    private OrdersDao orderDao;

    @GetMapping
    public List<Orders> fetchOrders() {
        return orderDao.getOrders().stream().
                sorted(Comparator.comparing(Orders::getPrice)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        SpringApplication.run(ChanduOrderApplication.class, args);
    }

}
	