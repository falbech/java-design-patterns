package br.com.alura.store.budget;

import java.util.Map;

import br.com.alura.store.DomainException;
import br.com.alura.store.http.HttpAdapter;

public class BudgetRegister {

	private HttpAdapter http;

	public BudgetRegister(HttpAdapter http) {
		this.http = http;
	}

	public void register(Budget budget) {
		if(!budget.isFinished()) {
			throw new DomainException("Budget not finished!");
		}
		String url = "http://example.com/api/budgets";
		Map<String, Object> data = Map.of("valor", budget.getValue(), "amount", budget.getItemsAmount());
		http.post(url, data);
	}
}
