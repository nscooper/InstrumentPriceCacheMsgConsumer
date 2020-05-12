package com.nscooper.mizuho.price.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		// create Spring context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("msg-listener-context.xml");
		while (1==1){
			//
		}



	}
}