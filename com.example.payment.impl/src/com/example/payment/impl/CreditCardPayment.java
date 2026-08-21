package com.example.payment.impl;

import com.example.spi.PaymentService;

public class CreditCardPayment implements PaymentService {

	@Override
	public void pay(double amount) {
		System.out.println("paid "+amount+" Using Credit Card");

	}

}
