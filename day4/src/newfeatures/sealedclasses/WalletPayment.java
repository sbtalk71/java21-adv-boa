package newfeatures.sealedclasses;

public sealed class WalletPayment extends Payment permits PayTmPayment {

	@Override
	void pay(double amount) {
		// TODO Auto-generated method stub

	}

}
