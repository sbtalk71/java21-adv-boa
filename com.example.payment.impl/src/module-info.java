module com.example.payment.impl {
	requires com.example.spi;
	provides com.example.spi.PaymentService with com.example.payment.impl.CreditCardPayment;
}