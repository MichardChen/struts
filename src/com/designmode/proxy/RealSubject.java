package com.designmode.proxy;

public class RealSubject implements Subject{

	@Override
	public void visit() {
		System.out.println("real subject");
	}

}
