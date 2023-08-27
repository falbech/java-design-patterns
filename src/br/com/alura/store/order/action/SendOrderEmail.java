package br.com.alura.store.order.action;

import br.com.alura.store.order.Order;

public class SendOrderEmail implements ActionAfterOrderCreation{

	@Override
	public void executeAction(Order order) {
		System.out.println("Sending email...");		
	}
}
