package br.com.alura.store.budget.situation;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class Approved extends BudgetSituation {
	
	public BigDecimal calculateExtraDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}
	
	@Override
	public void finish(Budget budget) {
		budget.setSituation(new Finished());
	}
	

}
