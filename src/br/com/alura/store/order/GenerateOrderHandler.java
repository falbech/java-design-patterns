package br.com.alura.store.order;

import java.time.LocalDateTime;

import br.com.alura.store.budget.Budget;

public class GenerateOrderHandler {
	
	// constructor with dependency injection
	
	public void execute(GenerateOrder data) {
		Budget budget = new Budget(data.getBudgetValue(), data.getItemsAmount());
		Order order = new Order(data.getClient(), LocalDateTime.now(), budget);
		
		System.out.println("Save on db");
		System.out.println("Send email");
	}

}
