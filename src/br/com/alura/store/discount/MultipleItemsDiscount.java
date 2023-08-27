package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class MultipleItemsDiscount extends Discount {

	public MultipleItemsDiscount(Discount next) {
		super(next);
	}

	public BigDecimal performCalulation(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean mustApply(Budget budget) {
		return budget.getItemsAmount() > 5;
	}
}
