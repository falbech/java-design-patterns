package br.com.alura.store.budget;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.store.budget.situation.BudgetSituation;
import br.com.alura.store.budget.situation.Finished;
import br.com.alura.store.budget.situation.UnderAnalysis;

public class Budget implements Budgetable{
	
	private BigDecimal value;
	private BudgetSituation situation;
	private List<Budgetable> items;

	public Budget() {
		this.value = BigDecimal.ZERO;
		this.items = new ArrayList<>();
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
		return items.size();
	}

	public boolean isFinished() {
		return situation instanceof Finished;
	}
	
	public void addItem(Budgetable item) {
		this.value = this.value.add(item.getValue());
		this.items.add(item);
	}

}
