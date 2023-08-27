package br.com.alura.store;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.discount.DiscountCalculator;

public class DiscountsTests {

	public static void main(String args[]) {
		Budget budget = new Budget(new BigDecimal("200"), 6);
		Budget budget2 = new Budget(new BigDecimal("1000"), 1);

		DiscountCalculator calculator = new DiscountCalculator();
		System.out.println(calculator.calculate(budget));
		System.out.println(calculator.calculate(budget2));
	}
}
