package br.com.alura.store;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.budget.BudgetItem;
import br.com.alura.store.discount.DiscountCalculator;

public class DiscountsTests {

	public static void main(String args[]) {
		Budget budget = new Budget();
		budget.addItem(new BudgetItem(new BigDecimal("200")));
		
		Budget budget2 = new Budget();
		budget2.addItem(new BudgetItem(new BigDecimal("1000")));
		
		Budget budget3 = new Budget();
		budget3.addItem(new BudgetItem(new BigDecimal("1000")));

		DiscountCalculator calculator = new DiscountCalculator();
		System.out.println(calculator.calculate(budget));
		System.out.println(calculator.calculate(budget2));
	} 
}
