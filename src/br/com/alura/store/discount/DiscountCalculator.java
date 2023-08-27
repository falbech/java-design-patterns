package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class DiscountCalculator {

	public BigDecimal calculate(Budget budget) {
		Discount discount = new MultipleItemsDiscount(new HighPriceBasedDiscount(new NoDiscount()));
		return discount.calculate(budget);
	}

}
