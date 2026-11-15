package com.abc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vce.WishMessage;

@Component
public class PrintMessage {

	@Autowired
	WishMessage obj;
	
	public void printM() {
		String s = obj.wishMessageGenerator();
		System.out.println(s);
	}
	//spring mvc, rest, -> api's ecommerce
	//to react
}
