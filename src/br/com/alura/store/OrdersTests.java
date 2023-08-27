package br.com.alura.store;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.store.order.GenerateOrder;
import br.com.alura.store.order.GenerateOrderHandler;
import br.com.alura.store.order.action.SaveOrder;
import br.com.alura.store.order.action.SendOrderEmail;

public class OrdersTests {

	public static void main(String args[]) {
		String client = "Foo Bar";
		BigDecimal budgetValue = new BigDecimal("600");
		int amount = 4;
		
		GenerateOrder orderGenerationData = new GenerateOrder(client, budgetValue, amount);
		GenerateOrderHandler handler = new GenerateOrderHandler(
				Arrays.asList(new SaveOrder(), new SendOrderEmail()));
		handler.execute(orderGenerationData);
	}
}
