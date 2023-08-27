package br.com.alura.store.budget.situation;

import br.com.alura.store.budget.Budget;

public class Denied extends BudgetSituation {
	
	public void finish(Budget budget) {
		budget.setSituation(new Finished());
	}

}
