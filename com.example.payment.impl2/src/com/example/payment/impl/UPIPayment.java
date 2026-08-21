package com.example.payment.impl;

import com.example.spi.PaymentService;

public class UPIPayment implements PaymentService {

	@Override
	public void pay(double amount) {
		System.out.println("paid "+amount+" Using UPI");

	}

}
