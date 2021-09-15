package com.itbulls.greetings;

public class DefaultServiceStatusLogger implements ServiceStatusLogger {

	@Override
	public void printServiceStatusLog() {
		System.out.println("Service is up and running");
	}

}
