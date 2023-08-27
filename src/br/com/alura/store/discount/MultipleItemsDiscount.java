package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class MultipleItemsDiscount extends Discount {

	public MultipleItemsDiscount(Discount next) {
		super(next);
	}

	public BigDecimal calculate(Budget budget) {
		if (budget.getItemsAmount() > 5) {
			return budget.getValue().multiply(new BigDecimal("0.1"));
		}

		return next.calculate(budget);
	}

}
