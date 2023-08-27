package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public abstract class Discount {
	
	protected Discount next;

	public Discount(Discount next) {
		this.next = next;
	}
	
	public BigDecimal calculate(Budget budget) {
		if (mustApply(budget)) {
			return performCalulation(budget);
		}
		return next.calculate(budget);
	}
	
	
	protected abstract BigDecimal performCalulation(Budget budget);
	
	protected abstract boolean mustApply(Budget budget);
}
