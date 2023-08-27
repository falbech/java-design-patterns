package br.com.alura.store.order;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.budget.BudgetItem;
import br.com.alura.store.order.action.ActionAfterOrderCreation;

public class GenerateOrderHandler {
	
	// constructor with dependency injection
	
	private List<ActionAfterOrderCreation> actions;
	
	public GenerateOrderHandler(List<ActionAfterOrderCreation> actions) {
		this.actions = actions;
	}
	
	public void execute(GenerateOrder data) {
		Budget budget = new Budget();
		budget.addItem(new BudgetItem(data.getBudgetValue()));
		Order order = new Order(data.getClient(), LocalDateTime.now(), budget);
		
		actions.forEach(action -> action.executeAction(order));
	}
}
