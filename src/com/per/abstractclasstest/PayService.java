package com.per.abstractclasstest;

public class PayService implements Payable {
	public void cutCheck(Payable p) {
		double gross = p.pay();
	}

	@Override
	public double pay() {
		// TODO Auto-generated method stub
		return 0;
	}
}
