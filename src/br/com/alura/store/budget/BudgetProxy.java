package br.com.alura.store.budget;

import java.math.BigDecimal;

public class BudgetProxy implements Budgetable{
	
	private BigDecimal value;
	private Budget budget;
	
	public BudgetProxy(Budget budget) {
		this.budget = budget;
	}
	
	@Override
	public BigDecimal getValue() {
		if(value == null) {
			this.value = budget.getValue();
		}
		return this.value;
	}
	

}
