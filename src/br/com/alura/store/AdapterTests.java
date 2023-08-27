package br.com.alura.store;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.budget.BudgetRegister;
import br.com.alura.store.http.JavahttpClient;
import br.com.alura.store.tax.ICMS;
import br.com.alura.store.tax.ISS;
import br.com.alura.store.tax.TaxCalculator;

public class AdapterTests {

	public static void main(String args[]) {
		Budget budget = new Budget(new BigDecimal("10"), 1);
		budget.approve();
		budget.finish();
		
		BudgetRegister registerService = new BudgetRegister(new JavahttpClient());
		registerService.register(budget);

	}
}
