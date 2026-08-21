package newfeatures.sealedclasses;

public sealed abstract class Payment permits NetBankingPayment,CreditCardPayment,UPIPayment,WalletPayment {

	abstract void pay(double amount);
	
}
