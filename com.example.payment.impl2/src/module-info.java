module com.example.payment.impl2 {
	requires com.example.spi;
	provides com.example.spi.PaymentService with com.example.payment.impl.UPIPayment;
}