package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class NoDiscount extends Discount {

	public NoDiscount() {
		super(null);
	}

	public BigDecimal performCalulation(Budget budget) {
		return BigDecimal.ZERO;
	}
	
	@Override
	public boolean mustApply(Budget budget) {
		return true;
	}
}
