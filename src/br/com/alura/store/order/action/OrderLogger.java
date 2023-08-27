package br.com.alura.store.order.action;

import br.com.alura.store.order.Order;

public class OrderLogger implements ActionAfterOrderCreation {

	@Override
	public void executeAction(Order order) {
		System.out.println("Order created: " + order);
	}

}
