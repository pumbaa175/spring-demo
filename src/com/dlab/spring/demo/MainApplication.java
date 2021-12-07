package com.dlab.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		String brand = "AMD";
		
		CPU cpu = context.getBean(brand, CPU.class);
		
		System.out.println(cpu.getBrand());
		
		context.close();
	}
	
}
