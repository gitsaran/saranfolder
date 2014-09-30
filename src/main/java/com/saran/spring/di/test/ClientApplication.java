package com.saran.spring.di.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.saran.spring.di.configuration.DIConfiguration;
import com.saran.spring.di.consumer.MyApplication;

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);
		
		app.processMessage("Hi Saran", "saran@gmail.com");
		
		//close the context
		context.close();
	}

}
