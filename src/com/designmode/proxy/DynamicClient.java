package com.designmode.proxy;

import java.lang.reflect.Proxy;

public class DynamicClient {

	public static void main(String[] args){
		
		Subject subject = new RealSubject();
		DynamicProxy proxy = new DynamicProxy(subject);
		ClassLoader classLoader = subject.getClass().getClassLoader();
		Subject sub = (Subject)Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, proxy);
		sub.visit();
	}
}
