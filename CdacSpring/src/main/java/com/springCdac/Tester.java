package com.springCdac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.AppConfig;
import pojo.OnePlus;

public class Tester {

	public static void main(String[] args) {
		
	//	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml"); 
		//Vehicle obj = (Vehicle) ctx.getBean("vehicle");  //used during XML Calls
		//	Vehicle obj = (Vehicle) ctx.getBean("bike");   //Used during AnnotationBasedCall
	//	Car obj = (Car) ctx.getBean("car");   //Used during XMLCall
		
	//	obj.drive();
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		OnePlus Nine_r = (OnePlus) ctx.getBean(OnePlus.class);
		Nine_r.config(); 
	}
}
