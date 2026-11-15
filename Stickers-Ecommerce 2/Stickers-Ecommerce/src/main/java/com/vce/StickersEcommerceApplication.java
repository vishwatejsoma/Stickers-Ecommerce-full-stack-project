package com.vce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.abc.PrintMessage;

@SpringBootApplication
@ComponentScan(basePackages = {"com.abc","com.vce"})
public class StickersEcommerceApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication
				.run(StickersEcommerceApplication.class, args);
		WishMessage obj = context.getBean(WishMessage.class);
		String s = obj.wishMessageGenerator();
		System.out.println(s); 
		PrintMessage p = context
				.getBean(PrintMessage.class);
		p.printM();
		
	}

}
