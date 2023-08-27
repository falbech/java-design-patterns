package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class HighPriceBasedDiscount extends Discount {

	public HighPriceBasedDiscount(Discount next) {
		super(next);
	}

	public BigDecimal performCalulation(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean mustApply(Budget budget) {
		return budget.getValue().compareTo(new BigDecimal("500")) > 0;
	}

}
