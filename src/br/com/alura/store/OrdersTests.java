package br.com.alura.store;

import java.math.BigDecimal;

import br.com.alura.store.order.GenerateOrder;
import br.com.alura.store.order.GenerateOrderHandler;

public class OrdersTests {

	public static void main(String args[]) {
		BigDecimal budgetValue = new BigDecimal("600");
		String client = "Foo Bar";
		int amount = 4;
		
		GenerateOrder orderGenerationData = new GenerateOrder(client, budgetValue, amount);
		GenerateOrderHandler handler = new GenerateOrderHandler();
		handler.execute(orderGenerationData);
	}
}
