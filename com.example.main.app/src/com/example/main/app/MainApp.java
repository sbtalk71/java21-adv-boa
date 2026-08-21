package com.example.main.app;

import java.util.ServiceLoader;

import com.example.spi.PaymentService;

public class MainApp {

	public static void main(String[] args) {
		ServiceLoader<PaymentService> loader = ServiceLoader.load(PaymentService.class);

		for (PaymentService service : loader) {
			System.out.println(service.getClass().getName());
			service.pay(3000);
		}

	}

}
