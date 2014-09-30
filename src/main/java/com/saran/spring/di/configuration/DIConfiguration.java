package com.saran.spring.di.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.saran.spring.di.services.EmailService;
import com.saran.spring.di.services.MessageService;


//@Configuratin indicates that the class can be used by the spring ioc container as a source of bean definitions.
@Configuration

@ComponentScan(value={"com.saran.spring.di.consumer"})
public class DIConfiguration {
//@Bean annoatation tels spring that a method annotated with @Bean will retrun an object that should be
//	registered as a bean in the spring application context.
	@Bean
	public MessageService getMessageService(){
		return new EmailService();
	}
}
