package br.com.alura.store.order.action;

import br.com.alura.store.order.Order;

public interface ActionAfterOrderCreation {
	
	public void executeAction(Order order);

}
