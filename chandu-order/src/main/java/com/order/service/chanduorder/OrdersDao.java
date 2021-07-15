package com.order.service.chanduorder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class OrdersDao {
	

    public List<Orders> getOrders() {
        return Stream.of(
                new Orders(101, "Mobile", 1, 30000),
                new Orders(58, "Book", 4, 2000),
                new Orders(205, "Laptop", 1, 150000),
                new Orders(809, "headset", 1, 1799))
                .collect(Collectors.toList());
    }
}