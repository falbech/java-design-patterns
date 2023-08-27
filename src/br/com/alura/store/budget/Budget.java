package br.com.alura.store.budget;

import java.math.BigDecimal;

import br.com.alura.store.budget.situation.BudgetSituation;
import br.com.alura.store.budget.situation.UnderAnalysis;

public class Budget {
	
	private BigDecimal value;
	private int itemsAmount;
	private BudgetSituation situation;

	public Budget(BigDecimal value, int itemsAmount) {
		this.value = value;
		this.itemsAmount = itemsAmount;
		this.situation = new UnderAnalysis();
	}

	public BigDecimal getValue() {
		return value;
	}
	
	public void applyExtraDiscount() {
		BigDecimal extraDiscount = this.situation.calculateExtraDiscount(this);		
		this.value = this.value.subtract(extraDiscount);
	}
	
	public void approve() {
		this.situation.approve(this);
	}
	
	public void deny() {
		this.situation.deny(this);
	}
	
	public void finish() {
		this.situation.finish(this);
	}
	
	public BudgetSituation getSituation() {
		return situation;
	}

	public void setSituation(BudgetSituation situation) {
		this.situation = situation;
	}

	public int getItemsAmount() {
		return itemsAmount;
	}

}
