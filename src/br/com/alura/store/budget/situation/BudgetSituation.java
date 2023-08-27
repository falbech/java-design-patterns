package br.com.alura.store.budget.situation;

import java.math.BigDecimal;

import br.com.alura.store.DomainException;
import br.com.alura.store.budget.Budget;

public abstract class BudgetSituation {
	
	public BigDecimal calculateExtraDiscount(Budget budget) {
		return BigDecimal.ZERO;
	}
	
	public void approve(Budget budget) {
		new DomainException("Budget cannot be approved!");
	}
	
	public void deny(Budget budget) {
		new DomainException("Budget cannot be denied!");
	}
	
	public void finish(Budget budget) {
		new DomainException("Budget cannot be denied!");
	}

}
