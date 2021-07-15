package com.order.service.chanduorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Orders {
	private int id;
	private String name;
	private int quantity;
	private long price;
}
