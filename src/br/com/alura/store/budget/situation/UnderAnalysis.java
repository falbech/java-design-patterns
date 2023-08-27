package br.com.alura.store.budget.situation;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class UnderAnalysis extends BudgetSituation {
	
	public BigDecimal calculateExtraDiscount(Budget budget) {
		return budget.getValue().multiply(new BigDecimal("0.05"));
	}
	
	public void approve(Budget budget) {
		budget.setSituation(new Approved());
	}
	
	public void deny(Budget budget) {
		budget.setSituation(new Denied());
	}

}
