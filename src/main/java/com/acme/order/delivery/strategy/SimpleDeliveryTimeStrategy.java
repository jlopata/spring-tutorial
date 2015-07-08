package com.acme.order.delivery.strategy;

import org.springframework.stereotype.Service;

import com.acme.order.Customer;
import com.acme.order.pizza.PizzaType;

@Service
public class SimpleDeliveryTimeStrategy implements DeliveryTimeStrategy {

	@Override
	public int provideDeliveryMinutesOffset(Customer customer, PizzaType pizzaType) {
		return 30;
	}
}
