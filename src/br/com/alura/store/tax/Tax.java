package br.com.alura.store.tax;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public abstract class Tax {
	
	private Tax next;
	
	public Tax(Tax tax) {
		this.next = tax;
	}
	
	protected abstract BigDecimal performCalculation(Budget budget);

	public BigDecimal calculate(Budget budget) {
		BigDecimal taxValue = performCalculation(budget);
		BigDecimal nextTaxValue = BigDecimal.ZERO;
		if(this.next != null) {
			nextTaxValue = this.next.performCalculation(budget);
		}
		return taxValue.add(nextTaxValue);
	}

}
