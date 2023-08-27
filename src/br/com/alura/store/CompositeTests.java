package br.com.alura.store;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.budget.BudgetItem;
import br.com.alura.store.budget.BudgetProxy;

public class CompositeTests {

	public static void main(String args[]) {
		Budget oldBudget = new Budget();
		oldBudget.addItem(new BudgetItem(new BigDecimal("200")));
		oldBudget.deny();
		
		Budget budget = new Budget();
		budget.addItem(new BudgetItem(new BigDecimal("500")));
		budget.addItem(oldBudget);
		
		BudgetProxy proxy = new BudgetProxy(budget);
		
		System.out.println(proxy.getValue());
		System.out.println(proxy.getValue());
		System.out.println(proxy.getValue());
		System.out.println(proxy.getValue());
		System.out.println(proxy.getValue());
	}
}
