package br.com.alura.store.order;

import java.math.BigDecimal;

public class GenerateOrder {
	private String client;
	private BigDecimal budgetValue;
	private int itemsAmount;
	
	public GenerateOrder(String client,  BigDecimal budget, int itemsAmount) {
		this.client = client;
		this.budgetValue = budget;
		this.itemsAmount = itemsAmount;
	}

	public String getClient() {
		return client;
	}

	public BigDecimal getBudgetValue() {
		return budgetValue;
	}

	public int getItemsAmount() {
		return itemsAmount;
	}
	
	
}
